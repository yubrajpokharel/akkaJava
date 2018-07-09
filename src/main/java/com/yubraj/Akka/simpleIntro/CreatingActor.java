package com.yubraj.Akka.simpleIntro;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class CreatingActor {
  public static void main(String[] args) {

    //As we discussed all the actors will be in the hierarchy so lets create first the actor system
    //in which our actors will be resides
    //actors who share the common configuration should be in the same Actor system
    ActorSystem system = ActorSystem.create("system");
    ActorRef simpleActor = system.actorOf(Props.create(SimpleActor.class), "simpleActor");
    simpleActor.tell("hi there", simpleActor);
    simpleActor.tell(1, simpleActor);
  }
}
