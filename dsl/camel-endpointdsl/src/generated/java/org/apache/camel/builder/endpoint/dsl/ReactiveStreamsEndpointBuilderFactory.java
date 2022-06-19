/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Exchange messages with reactive stream processing libraries compatible with
 * the reactive streams standard.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ReactiveStreamsEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedReactiveStreamsEndpointConsumerBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointConsumerBuilder) this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Number of threads used to process exchanges in the Camel route.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param concurrentConsumers the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * 
         * The option is a: &lt;code&gt;double&lt;/code&gt; type.
         * 
         * Default: 0.25
         * Group: consumer
         * 
         * @param exchangesRefillLowWatermark the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder exchangesRefillLowWatermark(
                double exchangesRefillLowWatermark) {
            doSetProperty("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return this;
        }
        /**
         * Set the low watermark of requested exchanges to the active
         * subscription as percentage of the maxInflightExchanges. When the
         * number of pending items from the upstream source is lower than the
         * watermark, new items can be requested to the subscription. If set to
         * 0, the subscriber will request items in batches of
         * maxInflightExchanges, only after all items of the previous batch have
         * been processed. If set to 1, the subscriber can request a new item
         * each time an exchange is processed (chatty). Any intermediate value
         * can be used.
         * 
         * The option will be converted to a &lt;code&gt;double&lt;/code&gt;
         * type.
         * 
         * Default: 0.25
         * Group: consumer
         * 
         * @param exchangesRefillLowWatermark the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder exchangesRefillLowWatermark(
                String exchangesRefillLowWatermark) {
            doSetProperty("exchangesRefillLowWatermark", exchangesRefillLowWatermark);
            return this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param forwardOnComplete the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnComplete(
                boolean forwardOnComplete) {
            doSetProperty("forwardOnComplete", forwardOnComplete);
            return this;
        }
        /**
         * Determines if onComplete events should be pushed to the Camel route.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param forwardOnComplete the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnComplete(
                String forwardOnComplete) {
            doSetProperty("forwardOnComplete", forwardOnComplete);
            return this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param forwardOnError the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnError(
                boolean forwardOnError) {
            doSetProperty("forwardOnError", forwardOnError);
            return this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param forwardOnError the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder forwardOnError(
                String forwardOnError) {
            doSetProperty("forwardOnError", forwardOnError);
            return this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 128
         * Group: consumer
         * 
         * @param maxInflightExchanges the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder maxInflightExchanges(
                Integer maxInflightExchanges) {
            doSetProperty("maxInflightExchanges", maxInflightExchanges);
            return this;
        }
        /**
         * Maximum number of exchanges concurrently being processed by Camel.
         * This parameter controls backpressure on the stream. Setting a
         * non-positive value will disable backpressure.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 128
         * Group: consumer
         * 
         * @param maxInflightExchanges the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointConsumerBuilder maxInflightExchanges(
                String maxInflightExchanges) {
            doSetProperty("maxInflightExchanges", maxInflightExchanges);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Reactive Streams
     * component.
     */
    public interface AdvancedReactiveStreamsEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ReactiveStreamsEndpointConsumerBuilder basic() {
            return (ReactiveStreamsEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedReactiveStreamsEndpointProducerBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointProducerBuilder) this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param backpressureStrategy the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointProducerBuilder backpressureStrategy(
                org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy backpressureStrategy) {
            doSetProperty("backpressureStrategy", backpressureStrategy);
            return this;
        }
        /**
         * The backpressure strategy to use when pushing events to a slow
         * subscriber.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.reactive.streams.ReactiveStreamsBackpressureStrategy&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param backpressureStrategy the value to set
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointProducerBuilder backpressureStrategy(
                String backpressureStrategy) {
            doSetProperty("backpressureStrategy", backpressureStrategy);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Reactive Streams
     * component.
     */
    public interface AdvancedReactiveStreamsEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ReactiveStreamsEndpointProducerBuilder basic() {
            return (ReactiveStreamsEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedReactiveStreamsEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Reactive Streams component.
     */
    public interface ReactiveStreamsEndpointBuilder
            extends
                ReactiveStreamsEndpointConsumerBuilder,
                ReactiveStreamsEndpointProducerBuilder {
        default AdvancedReactiveStreamsEndpointBuilder advanced() {
            return (AdvancedReactiveStreamsEndpointBuilder) this;
        }
    }

    /**
     * Advanced builder for endpoint for the Reactive Streams component.
     */
    public interface AdvancedReactiveStreamsEndpointBuilder
            extends
                AdvancedReactiveStreamsEndpointConsumerBuilder,
                AdvancedReactiveStreamsEndpointProducerBuilder {
        default ReactiveStreamsEndpointBuilder basic() {
            return (ReactiveStreamsEndpointBuilder) this;
        }
    }

    public interface ReactiveStreamsBuilders {
        /**
         * Reactive Streams (camel-reactive-streams)
         * Exchange messages with reactive stream processing libraries
         * compatible with the reactive streams standard.
         * 
         * Category: reactive,streams
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-reactive-streams
         * 
         * Syntax: <code>reactive-streams:stream</code>
         * 
         * Path parameter: stream
         * Name of the stream channel used by the endpoint to exchange messages.
         * 
         * @param path stream
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointBuilder reactiveStreams(String path) {
            return ReactiveStreamsEndpointBuilderFactory.endpointBuilder("reactive-streams", path);
        }
        /**
         * Reactive Streams (camel-reactive-streams)
         * Exchange messages with reactive stream processing libraries
         * compatible with the reactive streams standard.
         * 
         * Category: reactive,streams
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-reactive-streams
         * 
         * Syntax: <code>reactive-streams:stream</code>
         * 
         * Path parameter: stream
         * Name of the stream channel used by the endpoint to exchange messages.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path stream
         * @return the dsl builder
         */
        default ReactiveStreamsEndpointBuilder reactiveStreams(
                String componentName,
                String path) {
            return ReactiveStreamsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ReactiveStreamsEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ReactiveStreamsEndpointBuilderImpl extends AbstractEndpointBuilder implements ReactiveStreamsEndpointBuilder, AdvancedReactiveStreamsEndpointBuilder {
            public ReactiveStreamsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ReactiveStreamsEndpointBuilderImpl(path);
    }
}