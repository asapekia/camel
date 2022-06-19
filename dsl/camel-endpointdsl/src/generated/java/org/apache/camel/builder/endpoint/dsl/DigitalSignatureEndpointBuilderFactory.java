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
 * Sign and verify exchanges using the Signature Service of the Java
 * Cryptographic Extension (JCE).
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DigitalSignatureEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Crypto (JCE) component.
     */
    public interface DigitalSignatureEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedDigitalSignatureEndpointBuilder advanced() {
            return (AdvancedDigitalSignatureEndpointBuilder) this;
        }
        /**
         * Sets the JCE name of the Algorithm that should be used for the
         * signer.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: SHA256withRSA
         * Group: producer
         * 
         * @param algorithm the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder algorithm(String algorithm) {
            doSetProperty("algorithm", algorithm);
            return this;
        }
        /**
         * Sets the alias used to query the KeyStore for keys and {link
         * java.security.cert.Certificate Certificates} to be used in signing
         * and verifying exchanges. This value can be provided at runtime via
         * the message header
         * org.apache.camel.component.crypto.DigitalSignatureConstants#KEYSTORE_ALIAS.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param alias the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder alias(String alias) {
            doSetProperty("alias", alias);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param certificateName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder certificateName(
                String certificateName) {
            doSetProperty("certificateName", certificateName);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * 
         * The option is a: &lt;code&gt;java.security.KeyStore&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param keystore the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder keystore(
                java.security.KeyStore keystore) {
            doSetProperty("keystore", keystore);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges. A KeyStore is typically used with an
         * alias, either one supplied in the Route definition or dynamically via
         * the message header CamelSignatureKeyStoreAlias. If no alias is
         * supplied and there is only a single entry in the Keystore, then this
         * single entry will be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.KeyStore&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keystore the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder keystore(String keystore) {
            doSetProperty("keystore", keystore);
            return this;
        }
        /**
         * Sets the reference name for a Keystore that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keystoreName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder keystoreName(String keystoreName) {
            doSetProperty("keystoreName", keystoreName);
            return this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * 
         * The option is a: &lt;code&gt;java.security.PrivateKey&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param privateKey the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder privateKey(
                java.security.PrivateKey privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Set the PrivateKey that should be used to sign the exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.PrivateKey&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param privateKey the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder privateKey(String privateKey) {
            doSetProperty("privateKey", privateKey);
            return this;
        }
        /**
         * Sets the reference name for a PrivateKey that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param privateKeyName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder privateKeyName(
                String privateKeyName) {
            doSetProperty("privateKeyName", privateKeyName);
            return this;
        }
        /**
         * Set the id of the security provider that provides the configured
         * Signature algorithm.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param provider the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder provider(String provider) {
            doSetProperty("provider", provider);
            return this;
        }
        /**
         * references that should be resolved when the context changes.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param publicKeyName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder publicKeyName(
                String publicKeyName) {
            doSetProperty("publicKeyName", publicKeyName);
            return this;
        }
        /**
         * Sets the reference name for a SecureRandom that can be found in the
         * registry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secureRandomName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder secureRandomName(
                String secureRandomName) {
            doSetProperty("secureRandomName", secureRandomName);
            return this;
        }
        /**
         * Set the name of the message header that should be used to store the
         * base64 encoded signature. This defaults to 'CamelDigitalSignature'.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param signatureHeaderName the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder signatureHeaderName(
                String signatureHeaderName) {
            doSetProperty("signatureHeaderName", signatureHeaderName);
            return this;
        }
        /**
         * Sets the password used to access an aliased PrivateKey in the
         * KeyStore.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Crypto (JCE) component.
     */
    public interface AdvancedDigitalSignatureEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DigitalSignatureEndpointBuilder basic() {
            return (DigitalSignatureEndpointBuilder) this;
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
        default AdvancedDigitalSignatureEndpointBuilder lazyStartProducer(
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
        default AdvancedDigitalSignatureEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 2048
         * Group: advanced
         * 
         * @param bufferSize the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder bufferSize(
                Integer bufferSize) {
            doSetProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * Set the size of the buffer used to read in the Exchange payload data.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 2048
         * Group: advanced
         * 
         * @param bufferSize the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder bufferSize(
                String bufferSize) {
            doSetProperty("bufferSize", bufferSize);
            return this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * 
         * The option is a:
         * &lt;code&gt;java.security.cert.Certificate&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param certificate the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder certificate(
                java.security.cert.Certificate certificate) {
            doSetProperty("certificate", certificate);
            return this;
        }
        /**
         * Set the Certificate that should be used to verify the signature in
         * the exchange based on its payload.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.cert.Certificate&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param certificate the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder certificate(
                String certificate) {
            doSetProperty("certificate", certificate);
            return this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder clearHeaders(
                boolean clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Determines if the Signature specific headers be cleared after signing
         * and verification. Defaults to true, and should only be made otherwise
         * at your extreme peril as vital private information such as Keys and
         * passwords may escape if unset.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param clearHeaders the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder clearHeaders(
                String clearHeaders) {
            doSetProperty("clearHeaders", clearHeaders);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.KeyStoreParameters&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param keyStoreParameters the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder keyStoreParameters(
                org.apache.camel.support.jsse.KeyStoreParameters keyStoreParameters) {
            doSetProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Sets the KeyStore that can contain keys and Certficates for use in
         * signing and verifying exchanges based on the given
         * KeyStoreParameters. A KeyStore is typically used with an alias,
         * either one supplied in the Route definition or dynamically via the
         * message header CamelSignatureKeyStoreAlias. If no alias is supplied
         * and there is only a single entry in the Keystore, then this single
         * entry will be used.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.jsse.KeyStoreParameters&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param keyStoreParameters the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder keyStoreParameters(
                String keyStoreParameters) {
            doSetProperty("keyStoreParameters", keyStoreParameters);
            return this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * 
         * The option is a: &lt;code&gt;java.security.PublicKey&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param publicKey the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder publicKey(
                java.security.PublicKey publicKey) {
            doSetProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the PublicKey that should be used to verify the signature in the
         * exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.PublicKey&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param publicKey the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder publicKey(
                String publicKey) {
            doSetProperty("publicKey", publicKey);
            return this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * 
         * The option is a: &lt;code&gt;java.security.SecureRandom&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param secureRandom the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder secureRandom(
                java.security.SecureRandom secureRandom) {
            doSetProperty("secureRandom", secureRandom);
            return this;
        }
        /**
         * Set the SecureRandom used to initialize the Signature service.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.security.SecureRandom&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param secureRandom the value to set
         * @return the dsl builder
         */
        default AdvancedDigitalSignatureEndpointBuilder secureRandom(
                String secureRandom) {
            doSetProperty("secureRandom", secureRandom);
            return this;
        }
    }

    public interface DigitalSignatureBuilders {
        /**
         * Crypto (JCE) (camel-crypto)
         * Sign and verify exchanges using the Signature Service of the Java
         * Cryptographic Extension (JCE).
         * 
         * Category: security,transformation
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-crypto
         * 
         * Syntax: <code>crypto:cryptoOperation:name</code>
         * 
         * Path parameter: cryptoOperation (required)
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * There are 2 enums and the value can be one of: sign, verify
         * 
         * Path parameter: name (required)
         * The logical name of this operation.
         * 
         * @param path cryptoOperation:name
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder crypto(String path) {
            return DigitalSignatureEndpointBuilderFactory.endpointBuilder("crypto", path);
        }
        /**
         * Crypto (JCE) (camel-crypto)
         * Sign and verify exchanges using the Signature Service of the Java
         * Cryptographic Extension (JCE).
         * 
         * Category: security,transformation
         * Since: 2.3
         * Maven coordinates: org.apache.camel:camel-crypto
         * 
         * Syntax: <code>crypto:cryptoOperation:name</code>
         * 
         * Path parameter: cryptoOperation (required)
         * Set the Crypto operation from that supplied after the crypto scheme
         * in the endpoint uri e.g. crypto:sign sets sign as the operation.
         * There are 2 enums and the value can be one of: sign, verify
         * 
         * Path parameter: name (required)
         * The logical name of this operation.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cryptoOperation:name
         * @return the dsl builder
         */
        default DigitalSignatureEndpointBuilder crypto(
                String componentName,
                String path) {
            return DigitalSignatureEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DigitalSignatureEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class DigitalSignatureEndpointBuilderImpl extends AbstractEndpointBuilder implements DigitalSignatureEndpointBuilder, AdvancedDigitalSignatureEndpointBuilder {
            public DigitalSignatureEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DigitalSignatureEndpointBuilderImpl(path);
    }
}