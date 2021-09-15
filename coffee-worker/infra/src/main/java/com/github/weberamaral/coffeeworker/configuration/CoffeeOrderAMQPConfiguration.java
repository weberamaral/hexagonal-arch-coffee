package com.github.weberamaral.coffeeworker.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeOrderAMQPConfiguration {
  
  public static final String QUEUE = "coffee-orders-created";
  public static final String EXCHANGE = "CoffeeOrders";
  public static final String ROUTING_KEY = "";
  
  @Bean
  public Exchange declareExchange() {
    return ExchangeBuilder.directExchange(EXCHANGE)
      .durable(true)
      .build();
  }
  
  @Bean
  public Queue declareQueue() {
    return QueueBuilder.durable(QUEUE)
      .build();
  }
  
  @Bean
  public Binding declareBinding(Exchange exchange, Queue queue) {
    return BindingBuilder.bind(queue)
      .to(exchange)
      .with(ROUTING_KEY)
      .noargs();
  }
  
  @Bean
  public SimpleRabbitListenerContainerFactory spFactory(ConnectionFactory connectionFactory, 
                                                      SimpleRabbitListenerContainerFactoryConfigurer configurer) {
    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
    configurer.configure(factory, connectionFactory);
    factory.setMessageConverter(jsonMessageConverter());
    return factory;
  }

  @Bean
  public MessageConverter jsonMessageConverter() {
    return new Jackson2JsonMessageConverter();
  }
}