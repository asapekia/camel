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
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on ArangoDb when used as a Document Database, or as a
 * Graph Database
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ArangoDbEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ArangoDb component.
     */
    public interface ArangoDbEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedArangoDbEndpointBuilder advanced() {
            return (AdvancedArangoDbEndpointBuilder) this;
        }
        /**
         * Collection name, when using ArangoDb as a Document Database. Set the
         * documentCollection name when using the CRUD operation on the document
         * database collections (SAVE_DOCUMENT , FIND_DOCUMENT_BY_KEY,
         * UPDATE_DOCUMENT, DELETE_DOCUMENT).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param documentCollection the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder documentCollection(
                String documentCollection) {
            doSetProperty("documentCollection", documentCollection);
            return this;
        }
        /**
         * Collection name of vertices, when using ArangoDb as a Graph Database.
         * Set the edgeCollection name to perform CRUD operation on edges using
         * these operations : SAVE_VERTEX, FIND_VERTEX_BY_KEY, UPDATE_VERTEX,
         * DELETE_VERTEX. The graph attribute is mandatory.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param edgeCollection the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder edgeCollection(String edgeCollection) {
            doSetProperty("edgeCollection", edgeCollection);
            return this;
        }
        /**
         * Graph name, when using ArangoDb as a Graph Database. Combine this
         * attribute with one of the two attributes vertexCollection and
         * edgeCollection.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param graph the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder graph(String graph) {
            doSetProperty("graph", graph);
            return this;
        }
        /**
         * ArangoDB host. If host and port are default, this field is Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Operations to perform on ArangoDb. For the operation AQL_QUERY, no
         * need to specify a collection or graph.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.arangodb.ArangoDbOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder operation(
                org.apache.camel.component.arangodb.ArangoDbOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Operations to perform on ArangoDb. For the operation AQL_QUERY, no
         * need to specify a collection or graph.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.arangodb.ArangoDbOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * ArangoDB exposed port. If host and port are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * ArangoDB exposed port. If host and port are default, this field is
         * Optional.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder port(String port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Collection name of vertices, when using ArangoDb as a Graph Database.
         * Set the vertexCollection name to perform CRUD operation on vertices
         * using these operations : SAVE_EDGE, FIND_EDGE_BY_KEY, UPDATE_EDGE,
         * DELETE_EDGE. The graph attribute is mandatory.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param vertexCollection the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder vertexCollection(String vertexCollection) {
            doSetProperty("vertexCollection", vertexCollection);
            return this;
        }
        /**
         * ArangoDB password. If user and password are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * ArangoDB user. If user and password are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder user(String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ArangoDb component.
     */
    public interface AdvancedArangoDbEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ArangoDbEndpointBuilder basic() {
            return (ArangoDbEndpointBuilder) this;
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
        default AdvancedArangoDbEndpointBuilder lazyStartProducer(
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
        default AdvancedArangoDbEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface ArangoDbBuilders {
        /**
         * ArangoDb (camel-arangodb)
         * Perform operations on ArangoDb when used as a Document Database, or
         * as a Graph Database
         * 
         * Category: database
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-arangodb
         * 
         * @return the dsl builder for the headers' name.
         */
        default ArangoDbHeaderNameBuilder arangodb() {
            return ArangoDbHeaderNameBuilder.INSTANCE;
        }
        /**
         * ArangoDb (camel-arangodb)
         * Perform operations on ArangoDb when used as a Document Database, or
         * as a Graph Database
         * 
         * Category: database
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-arangodb
         * 
         * Syntax: <code>arangodb:database</code>
         * 
         * Path parameter: database (required)
         * database name
         * 
         * @param path database
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder arangodb(String path) {
            return ArangoDbEndpointBuilderFactory.endpointBuilder("arangodb", path);
        }
        /**
         * ArangoDb (camel-arangodb)
         * Perform operations on ArangoDb when used as a Document Database, or
         * as a Graph Database
         * 
         * Category: database
         * Since: 3.5
         * Maven coordinates: org.apache.camel:camel-arangodb
         * 
         * Syntax: <code>arangodb:database</code>
         * 
         * Path parameter: database (required)
         * database name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path database
         * @return the dsl builder
         */
        default ArangoDbEndpointBuilder arangodb(
                String componentName,
                String path) {
            return ArangoDbEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the ArangoDb component.
     */
    public static class ArangoDbHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final ArangoDbHeaderNameBuilder INSTANCE = new ArangoDbHeaderNameBuilder();

        /**
         * Indicates if there are multiple documents to update. If set to true,
         * the body of the message must be a Collection of documents to update.
         * 
         * The option is a: {@code java.lang.Boolean} type.
         * 
         * Default: false
         * Group: producer
         * 
         * @return the name of the header {@code ArangoDbMultiUpdate}.
         */
        public String arangoDbMultiUpdate() {
            return "ArangoDbMultiUpdate";
        }

        /**
         * Indicates if there are multiple documents to insert. If set to true,
         * the body of the message must be a Collection of documents to insert.
         * 
         * The option is a: {@code java.lang.Boolean} type.
         * 
         * Default: false
         * Group: producer
         * 
         * @return the name of the header {@code ArangoDbMultiInsert}.
         */
        public String arangoDbMultiInsert() {
            return "ArangoDbMultiInsert";
        }

        /**
         * Indicates if there are multiple documents to delete. If set to true,
         * the body of the message must be a Collection of key of documents to
         * delete.
         * 
         * The option is a: {@code java.lang.Boolean} type.
         * 
         * Default: false
         * Group: producer
         * 
         * @return the name of the header {@code ArangoDbMultiDelete}.
         */
        public String arangoDbMultiDelete() {
            return "ArangoDbMultiDelete";
        }

        /**
         * The Arango key to use for the operation.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code key}.
         */
        public String key() {
            return "key";
        }

        /**
         * The type of the result of the operation.
         * 
         * The option is a: {@code java.lang.Class} type.
         * 
         * Default: BaseDocument.class or BaseEdgeDocument.class
         * Group: producer
         * 
         * @return the name of the header {@code ResultClassType}.
         */
        public String resultClassType() {
            return "ResultClassType";
        }

        /**
         * The AQL query to execute.
         * 
         * The option is a: {@code java.lang.String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ArangoDbAqlQuery}.
         */
        public String arangoDbAqlQuery() {
            return "ArangoDbAqlQuery";
        }

        /**
         * The key/value pairs defining the variables to bind the query to.
         * 
         * The option is a: {@code java.util.Map} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ArangoDbAqlParameters}.
         */
        public String arangoDbAqlParameters() {
            return "ArangoDbAqlParameters";
        }

        /**
         * The additional options that will be passed to the query API.
         * 
         * The option is a: {@code com.arangodb.model.AqlQueryOptions} type.
         * 
         * Group: advanced
         * 
         * @return the name of the header {@code ArangoDbAqlOptions}.
         */
        public String arangoDbAqlOptions() {
            return "ArangoDbAqlOptions";
        }
    }
    static ArangoDbEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ArangoDbEndpointBuilderImpl extends AbstractEndpointBuilder implements ArangoDbEndpointBuilder, AdvancedArangoDbEndpointBuilder {
            public ArangoDbEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ArangoDbEndpointBuilderImpl(path);
    }
}