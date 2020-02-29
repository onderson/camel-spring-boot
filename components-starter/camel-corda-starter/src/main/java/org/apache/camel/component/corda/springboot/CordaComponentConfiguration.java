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
package org.apache.camel.component.corda.springboot;

import javax.annotation.Generated;
import net.corda.core.contracts.ContractState;
import net.corda.core.flows.FlowLogic;
import net.corda.core.node.services.vault.Sort;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The corda component uses corda-rpc to interact with corda nodes.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.corda")
public class CordaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the corda component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a shared configuration. The option is a
     * org.apache.camel.component.corda.CordaConfiguration type.
     */
    private String configuration;
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
     * PageSpecification allows specification of a page number (starting from 1)
     * and page size (defaulting to 200 with a maximum page size of
     * (Integer.MAX_INT) Note: we default the page number to 200 to enable
     * queries without requiring a page specification but enabling detection of
     * large results sets that fall out of the 200 requirement. Max page size
     * should be used with extreme caution as results may exceed your JVM memory
     * footprint. The option is a
     * net.corda.core.node.services.vault.PageSpecification type.
     */
    private String pageSpecification;
    /**
     * Whether to process snapshots or not
     */
    private Boolean processSnapshot = true;
    /**
     * Sort allows specification of a set of entity attribute names and their
     * associated directionality and null handling, to be applied upon
     * processing a query specification.
     */
    private Sort sort;
    /**
     * A contract state (or just state) contains opaque data used by a contract
     * program. It can be thought of as a disk file that the program can use to
     * persist data across transactions. States are immutable: once created they
     * are never updated, instead, any changes must generate a new successor
     * state. States can be updated (consumed) only once: the notary is
     * responsible for ensuring there is no double spending by only signing a
     * transaction if the input states are all free.
     */
    private Class<ContractState> contractStateClass;
    /**
     * Start the given flow with the given arguments, returning an Observable
     * with a single observation of the result of running the flow. The
     * flowLogicClass must be annotated with
     * net.corda.core.flows.StartableByRPC.
     */
    private Object[] flowLogicArguments;
    /**
     * Start the given flow with the given arguments, returning an Observable
     * with a single observation of the result of running the flow. The
     * flowLogicClass must be annotated with
     * net.corda.core.flows.StartableByRPC.
     */
    private Class<FlowLogic<Object>> flowLogicClass;
    /**
     * QueryCriteria assumes underlying schema tables are correctly indexed for
     * performance. The option is a
     * net.corda.core.node.services.vault.QueryCriteria type.
     */
    private String queryCriteria;
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
     * Operation to use
     */
    private String operation;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Password for login
     */
    private String password;
    /**
     * Username for login
     */
    private String username;

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getPageSpecification() {
        return pageSpecification;
    }

    public void setPageSpecification(String pageSpecification) {
        this.pageSpecification = pageSpecification;
    }

    public Boolean getProcessSnapshot() {
        return processSnapshot;
    }

    public void setProcessSnapshot(Boolean processSnapshot) {
        this.processSnapshot = processSnapshot;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Class<ContractState> getContractStateClass() {
        return contractStateClass;
    }

    public void setContractStateClass(Class<ContractState> contractStateClass) {
        this.contractStateClass = contractStateClass;
    }

    public Object[] getFlowLogicArguments() {
        return flowLogicArguments;
    }

    public void setFlowLogicArguments(Object[] flowLogicArguments) {
        this.flowLogicArguments = flowLogicArguments;
    }

    public Class<FlowLogic<Object>> getFlowLogicClass() {
        return flowLogicClass;
    }

    public void setFlowLogicClass(Class<FlowLogic<Object>> flowLogicClass) {
        this.flowLogicClass = flowLogicClass;
    }

    public String getQueryCriteria() {
        return queryCriteria;
    }

    public void setQueryCriteria(String queryCriteria) {
        this.queryCriteria = queryCriteria;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}