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
package org.apache.camel.component.azure.queue.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.azure.queue.QueueServiceComponent;
import org.apache.camel.component.azure.queue.QueueServiceOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The azure-queue component is used for storing and retrieving messages from
 * Azure Storage Queue Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.azure-queue")
public class QueueServiceComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the azure-queue component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * The queue service client. The option is a
     * com.microsoft.azure.storage.queue.CloudQueue type.
     */
    private String azureQueueClient;
    /**
     * Set the storage credentials, required in most cases. The option is a
     * com.microsoft.azure.storage.StorageCredentials type.
     */
    private String credentials;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Message Time To Live in seconds
     */
    private Integer messageTimeToLive;
    /**
     * Message Visibility Delay in seconds
     */
    private Integer messageVisibilityDelay;
    /**
     * Queue service operation hint to the producer
     */
    private QueueServiceOperations operation = QueueServiceOperations.listQueues;
    /**
     * Set a prefix which can be used for listing the queues
     */
    private String queuePrefix;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * The Queue Service configuration. The option is a
     * org.apache.camel.component.azure.queue.QueueServiceConfiguration type.
     */
    private String configuration;

    public String getAzureQueueClient() {
        return azureQueueClient;
    }

    public void setAzureQueueClient(String azureQueueClient) {
        this.azureQueueClient = azureQueueClient;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Integer getMessageTimeToLive() {
        return messageTimeToLive;
    }

    public void setMessageTimeToLive(Integer messageTimeToLive) {
        this.messageTimeToLive = messageTimeToLive;
    }

    public Integer getMessageVisibilityDelay() {
        return messageVisibilityDelay;
    }

    public void setMessageVisibilityDelay(Integer messageVisibilityDelay) {
        this.messageVisibilityDelay = messageVisibilityDelay;
    }

    public QueueServiceOperations getOperation() {
        return operation;
    }

    public void setOperation(QueueServiceOperations operation) {
        this.operation = operation;
    }

    public String getQueuePrefix() {
        return queuePrefix;
    }

    public void setQueuePrefix(String queuePrefix) {
        this.queuePrefix = queuePrefix;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}