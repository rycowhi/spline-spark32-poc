package com.github.rycowhi

import org.apache.commons.configuration.Configuration
import za.co.absa.spline.harvester.dispatcher.LineageDispatcher
import za.co.absa.spline.producer.model.v1_1.{ExecutionEvent, ExecutionPlan}

class TestDispatcher(configuration: Configuration) extends LineageDispatcher {

  override def send(plan: ExecutionPlan): Unit = {}

  override def send(event: ExecutionEvent): Unit = {}

}
