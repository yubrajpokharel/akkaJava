package com.yubraj.Akka.simpleIntro;

import akka.actor.AbstractActor;

public class SimpleActor extends AbstractActor {
  public Receive createReceive() {
    return receiveBuilder()
        .match(String.class, r -> {
          System.out.println("Message received: "+r);
        })
        .match(Integer.class, r -> {
          System.out.println("Integer received: "+r);
        })
        .build();
  }
}
