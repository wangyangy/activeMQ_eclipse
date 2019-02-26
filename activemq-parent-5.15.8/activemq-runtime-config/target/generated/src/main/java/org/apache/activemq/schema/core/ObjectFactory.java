//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.10-b140310.1920 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2019.02.26 时间 09:59:41 AM CST 
//


package org.apache.activemq.schema.core;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.activemq.schema.core package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DtoPListStoreImplBrokerService_QNAME = new QName("http://activemq.apache.org/schema/core", "brokerService");
    private final static QName _DtoTempUsageStore_QNAME = new QName("http://activemq.apache.org/schema/core", "store");
    private final static QName _DtoTempUsageParent_QNAME = new QName("http://activemq.apache.org/schema/core", "parent");
    private final static QName _DtoTempUsageExecutor_QNAME = new QName("http://activemq.apache.org/schema/core", "executor");
    private final static QName _DtoTempUsageLimiter_QNAME = new QName("http://activemq.apache.org/schema/core", "limiter");
    private final static QName _DtoXaConnectionFactoryRejectedTaskHandler_QNAME = new QName("http://activemq.apache.org/schema/core", "rejectedTaskHandler");
    private final static QName _DtoXaConnectionFactorySessionTaskRunner_QNAME = new QName("http://activemq.apache.org/schema/core", "sessionTaskRunner");
    private final static QName _DtoXaConnectionFactoryConnectionIdGenerator_QNAME = new QName("http://activemq.apache.org/schema/core", "connectionIdGenerator");
    private final static QName _DtoXaConnectionFactoryProperties_QNAME = new QName("http://activemq.apache.org/schema/core", "properties");
    private final static QName _DtoXaConnectionFactoryBlobTransferPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "blobTransferPolicy");
    private final static QName _DtoXaConnectionFactoryExceptionListener_QNAME = new QName("http://activemq.apache.org/schema/core", "exceptionListener");
    private final static QName _DtoXaConnectionFactoryClientIdGenerator_QNAME = new QName("http://activemq.apache.org/schema/core", "clientIdGenerator");
    private final static QName _DtoXaConnectionFactoryTrustedPackages_QNAME = new QName("http://activemq.apache.org/schema/core", "trustedPackages");
    private final static QName _DtoXaConnectionFactoryTransportListener_QNAME = new QName("http://activemq.apache.org/schema/core", "transportListener");
    private final static QName _DtoXaConnectionFactoryPrefetchPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "prefetchPolicy");
    private final static QName _DtoXaConnectionFactoryTransformer_QNAME = new QName("http://activemq.apache.org/schema/core", "transformer");
    private final static QName _DtoXaConnectionFactoryClientInternalExceptionListener_QNAME = new QName("http://activemq.apache.org/schema/core", "clientInternalExceptionListener");
    private final static QName _DtoXaConnectionFactoryRedeliveryPolicyMap_QNAME = new QName("http://activemq.apache.org/schema/core", "redeliveryPolicyMap");
    private final static QName _DtoXaConnectionFactoryRedeliveryPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "redeliveryPolicy");
    private final static QName _DtoSystemUsageJobSchedulerStore_QNAME = new QName("http://activemq.apache.org/schema/core", "jobSchedulerStore");
    private final static QName _DtoSystemUsageTempStore_QNAME = new QName("http://activemq.apache.org/schema/core", "tempStore");
    private final static QName _DtoSystemUsageTempUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "tempUsage");
    private final static QName _DtoSystemUsageAdapter_QNAME = new QName("http://activemq.apache.org/schema/core", "adapter");
    private final static QName _DtoSystemUsageMemoryUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "memoryUsage");
    private final static QName _DtoSystemUsageJobSchedulerUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "jobSchedulerUsage");
    private final static QName _DtoSystemUsageStoreUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "storeUsage");
    private final static QName _DtoSimpleJmsMessageConvertorConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "connection");
    private final static QName _DtoInboundQueueBridgeProducerConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "producerConnection");
    private final static QName _DtoInboundQueueBridgeConsumer_QNAME = new QName("http://activemq.apache.org/schema/core", "consumer");
    private final static QName _DtoInboundQueueBridgeConsumerConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "consumerConnection");
    private final static QName _DtoInboundQueueBridgeConsumerQueue_QNAME = new QName("http://activemq.apache.org/schema/core", "consumerQueue");
    private final static QName _DtoInboundQueueBridgeJmsMessageConvertor_QNAME = new QName("http://activemq.apache.org/schema/core", "jmsMessageConvertor");
    private final static QName _DtoInboundQueueBridgeProducerQueue_QNAME = new QName("http://activemq.apache.org/schema/core", "producerQueue");
    private final static QName _DtoInboundQueueBridgeJmsConnector_QNAME = new QName("http://activemq.apache.org/schema/core", "jmsConnector");
    private final static QName _DtoNoSubscriptionRecoveryPolicyBroker_QNAME = new QName("http://activemq.apache.org/schema/core", "broker");
    private final static QName _DtoVirtualDestinationInterceptorVirtualDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "virtualDestinations");
    private final static QName _DtoRedeliveryPluginAdminConnectionContext_QNAME = new QName("http://activemq.apache.org/schema/core", "adminConnectionContext");
    private final static QName _DtoRedeliveryPluginNext_QNAME = new QName("http://activemq.apache.org/schema/core", "next");
    private final static QName _DtoOutboundTopicBridgeProducerTopic_QNAME = new QName("http://activemq.apache.org/schema/core", "producerTopic");
    private final static QName _DtoOutboundTopicBridgeConsumerTopic_QNAME = new QName("http://activemq.apache.org/schema/core", "consumerTopic");
    private final static QName _DtoMaxdbJdbcAdapterStatements_QNAME = new QName("http://activemq.apache.org/schema/core", "statements");
    private final static QName _DtoBrokerPersistenceTaskRunnerFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "persistenceTaskRunnerFactory");
    private final static QName _DtoBrokerDestinationInterceptors_QNAME = new QName("http://activemq.apache.org/schema/core", "destinationInterceptors");
    private final static QName _DtoBrokerMessageAuthorizationPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "messageAuthorizationPolicy");
    private final static QName _DtoBrokerNetworkConnectorURIs_QNAME = new QName("http://activemq.apache.org/schema/core", "networkConnectorURIs");
    private final static QName _DtoBrokerTransportConnectors_QNAME = new QName("http://activemq.apache.org/schema/core", "transportConnectors");
    private final static QName _DtoBrokerStartException_QNAME = new QName("http://activemq.apache.org/schema/core", "startException");
    private final static QName _DtoBrokerNetworkConnectors_QNAME = new QName("http://activemq.apache.org/schema/core", "networkConnectors");
    private final static QName _DtoBrokerRegionBroker_QNAME = new QName("http://activemq.apache.org/schema/core", "regionBroker");
    private final static QName _DtoBrokerTempDataStore_QNAME = new QName("http://activemq.apache.org/schema/core", "tempDataStore");
    private final static QName _DtoBrokerServices_QNAME = new QName("http://activemq.apache.org/schema/core", "services");
    private final static QName _DtoBrokerSslContext_QNAME = new QName("http://activemq.apache.org/schema/core", "sslContext");
    private final static QName _DtoBrokerShutdownHooks_QNAME = new QName("http://activemq.apache.org/schema/core", "shutdownHooks");
    private final static QName _DtoBrokerJmsBridgeConnectors_QNAME = new QName("http://activemq.apache.org/schema/core", "jmsBridgeConnectors");
    private final static QName _DtoBrokerDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "destinations");
    private final static QName _DtoBrokerTransportConnectorURIs_QNAME = new QName("http://activemq.apache.org/schema/core", "transportConnectorURIs");
    private final static QName _DtoBrokerAdminView_QNAME = new QName("http://activemq.apache.org/schema/core", "adminView");
    private final static QName _DtoBrokerPersistenceAdapter_QNAME = new QName("http://activemq.apache.org/schema/core", "persistenceAdapter");
    private final static QName _DtoBrokerProducerSystemUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "producerSystemUsage");
    private final static QName _DtoBrokerManagementContext_QNAME = new QName("http://activemq.apache.org/schema/core", "managementContext");
    private final static QName _DtoBrokerProxyConnectors_QNAME = new QName("http://activemq.apache.org/schema/core", "proxyConnectors");
    private final static QName _DtoBrokerTaskRunnerFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "taskRunnerFactory");
    private final static QName _DtoBrokerConsumerSystemUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "consumerSystemUsage");
    private final static QName _DtoBrokerIoExceptionHandler_QNAME = new QName("http://activemq.apache.org/schema/core", "ioExceptionHandler");
    private final static QName _DtoBrokerDestinationPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "destinationPolicy");
    private final static QName _DtoBrokerBrokerContext_QNAME = new QName("http://activemq.apache.org/schema/core", "brokerContext");
    private final static QName _DtoBrokerSystemUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "systemUsage");
    private final static QName _DtoBrokerPersistenceFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "persistenceFactory");
    private final static QName _DtoBrokerPlugins_QNAME = new QName("http://activemq.apache.org/schema/core", "plugins");
    private final static QName _DtoBrokerDestinationFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "destinationFactory");
    private final static QName _DtoTaskRunnerFactoryThreadClassLoader_QNAME = new QName("http://activemq.apache.org/schema/core", "threadClassLoader");
    private final static QName _DtoSharedDeadLetterStrategyDeadLetterQueue_QNAME = new QName("http://activemq.apache.org/schema/core", "deadLetterQueue");
    private final static QName _DtoManagementContextMBeanServer_QNAME = new QName("http://activemq.apache.org/schema/core", "MBeanServer");
    private final static QName _DtoManagementContextEnvironment_QNAME = new QName("http://activemq.apache.org/schema/core", "environment");
    private final static QName _DtoManagementContextServer_QNAME = new QName("http://activemq.apache.org/schema/core", "server");
    private final static QName _DtoTempQueueCompositeDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "compositeDestinations");
    private final static QName _DtoLeaseDatabaseLockerDataSource_QNAME = new QName("http://activemq.apache.org/schema/core", "dataSource");
    private final static QName _DtoLeaseDatabaseLockerLockable_QNAME = new QName("http://activemq.apache.org/schema/core", "lockable");
    private final static QName _DtoFixedSizedSubscriptionRecoveryPolicyBuffer_QNAME = new QName("http://activemq.apache.org/schema/core", "buffer");
    private final static QName _DtoUdpTraceBrokerPluginWireFormat_QNAME = new QName("http://activemq.apache.org/schema/core", "wireFormat");
    private final static QName _DtoUdpTraceBrokerPluginWireFormatFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "wireFormatFactory");
    private final static QName _DtoUdpTraceBrokerPluginAddress_QNAME = new QName("http://activemq.apache.org/schema/core", "address");
    private final static QName _DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "staticallyIncludedDestinations");
    private final static QName _DtoLdapNetworkConnectorDurableDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "durableDestinations");
    private final static QName _DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "dynamicallyIncludedDestinations");
    private final static QName _DtoLdapNetworkConnectorExcludedDestinations_QNAME = new QName("http://activemq.apache.org/schema/core", "excludedDestinations");
    private final static QName _DtoLdapNetworkConnectorBridgeFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "bridgeFactory");
    private final static QName _DtoLdapNetworkConnectorConnectionFilter_QNAME = new QName("http://activemq.apache.org/schema/core", "connectionFilter");
    private final static QName _DtoRetainedMessageSubscriptionRecoveryPolicyWrapped_QNAME = new QName("http://activemq.apache.org/schema/core", "wrapped");
    private final static QName _DtoForwardingBridgeNetworkBridgeFailedListener_QNAME = new QName("http://activemq.apache.org/schema/core", "networkBridgeFailedListener");
    private final static QName _DtoForwardingBridgeLocalBroker_QNAME = new QName("http://activemq.apache.org/schema/core", "localBroker");
    private final static QName _DtoForwardingBridgeRemoteBroker_QNAME = new QName("http://activemq.apache.org/schema/core", "remoteBroker");
    private final static QName _DtoCompositeQueueForwardTo_QNAME = new QName("http://activemq.apache.org/schema/core", "forwardTo");
    private final static QName _DtoDestinationEntryDestination_QNAME = new QName("http://activemq.apache.org/schema/core", "destination");
    private final static QName _DtoDestinationEntryValue_QNAME = new QName("http://activemq.apache.org/schema/core", "value");
    private final static QName _DtoQueueDispatchSelectorExclusiveConsumer_QNAME = new QName("http://activemq.apache.org/schema/core", "exclusiveConsumer");
    private final static QName _DtoSimpleAuthenticationPluginUsers_QNAME = new QName("http://activemq.apache.org/schema/core", "users");
    private final static QName _DtoSimpleAuthenticationPluginUserPasswords_QNAME = new QName("http://activemq.apache.org/schema/core", "userPasswords");
    private final static QName _DtoSimpleAuthenticationPluginUserGroups_QNAME = new QName("http://activemq.apache.org/schema/core", "userGroups");
    private final static QName _DtoTempDestinationAuthorizationEntryWriteACLs_QNAME = new QName("http://activemq.apache.org/schema/core", "writeACLs");
    private final static QName _DtoTempDestinationAuthorizationEntryReadACLs_QNAME = new QName("http://activemq.apache.org/schema/core", "readACLs");
    private final static QName _DtoTempDestinationAuthorizationEntryAdminACLs_QNAME = new QName("http://activemq.apache.org/schema/core", "adminACLs");
    private final static QName _DtoMemoryPersistenceAdapterUsageManager_QNAME = new QName("http://activemq.apache.org/schema/core", "usageManager");
    private final static QName _DtoJmsTopicConnectorLocalTopicConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "localTopicConnection");
    private final static QName _DtoJmsTopicConnectorOutboundTopicConnectionFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundTopicConnectionFactory");
    private final static QName _DtoJmsTopicConnectorInboundTopicBridges_QNAME = new QName("http://activemq.apache.org/schema/core", "inboundTopicBridges");
    private final static QName _DtoJmsTopicConnectorOutboundTopicBridges_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundTopicBridges");
    private final static QName _DtoJmsTopicConnectorInboundMessageConvertor_QNAME = new QName("http://activemq.apache.org/schema/core", "inboundMessageConvertor");
    private final static QName _DtoJmsTopicConnectorReconnectionPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "reconnectionPolicy");
    private final static QName _DtoJmsTopicConnectorOutboundMessageConvertor_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundMessageConvertor");
    private final static QName _DtoJmsTopicConnectorLocalTopicConnectionFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "localTopicConnectionFactory");
    private final static QName _DtoJmsTopicConnectorOutboundTopicConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundTopicConnection");
    private final static QName _DtoQueryBasedSubscriptionRecoveryPolicyQuery_QNAME = new QName("http://activemq.apache.org/schema/core", "query");
    private final static QName _DtoTransportConnectorPublishedAddressPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "publishedAddressPolicy");
    private final static QName _DtoTransportConnectorDiscoveryAgent_QNAME = new QName("http://activemq.apache.org/schema/core", "discoveryAgent");
    private final static QName _DtoTransportConnectorBrokerInfo_QNAME = new QName("http://activemq.apache.org/schema/core", "brokerInfo");
    private final static QName _DtoPolicyEntryPendingMessageLimitStrategy_QNAME = new QName("http://activemq.apache.org/schema/core", "pendingMessageLimitStrategy");
    private final static QName _DtoPolicyEntryPendingQueuePolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "pendingQueuePolicy");
    private final static QName _DtoPolicyEntrySubscriptionRecoveryPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "subscriptionRecoveryPolicy");
    private final static QName _DtoPolicyEntryNetworkBridgeFilterFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "networkBridgeFilterFactory");
    private final static QName _DtoPolicyEntryPendingDurableSubscriberPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "pendingDurableSubscriberPolicy");
    private final static QName _DtoPolicyEntrySlowConsumerStrategy_QNAME = new QName("http://activemq.apache.org/schema/core", "slowConsumerStrategy");
    private final static QName _DtoPolicyEntryDeadLetterStrategy_QNAME = new QName("http://activemq.apache.org/schema/core", "deadLetterStrategy");
    private final static QName _DtoPolicyEntryDispatchPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "dispatchPolicy");
    private final static QName _DtoPolicyEntryMessageGroupMapFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "messageGroupMapFactory");
    private final static QName _DtoPolicyEntryPendingSubscriberPolicy_QNAME = new QName("http://activemq.apache.org/schema/core", "pendingSubscriberPolicy");
    private final static QName _DtoPolicyEntryMessageEvictionStrategy_QNAME = new QName("http://activemq.apache.org/schema/core", "messageEvictionStrategy");
    private final static QName _DtoAuthorizationPluginMap_QNAME = new QName("http://activemq.apache.org/schema/core", "map");
    private final static QName _DtoStatementsDropSchemaStatements_QNAME = new QName("http://activemq.apache.org/schema/core", "dropSchemaStatements");
    private final static QName _DtoStatementsCreateSchemaStatements_QNAME = new QName("http://activemq.apache.org/schema/core", "createSchemaStatements");
    private final static QName _DtoStatementsCreateLockSchemaStatements_QNAME = new QName("http://activemq.apache.org/schema/core", "createLockSchemaStatements");
    private final static QName _DtoCamelEndpointLoaderSource_QNAME = new QName("http://activemq.apache.org/schema/core", "source");
    private final static QName _DtoCamelEndpointLoaderComponent_QNAME = new QName("http://activemq.apache.org/schema/core", "component");
    private final static QName _DtoCamelEndpointLoaderCamelContext_QNAME = new QName("http://activemq.apache.org/schema/core", "camelContext");
    private final static QName _DtoPartitionBrokerPluginConfig_QNAME = new QName("http://activemq.apache.org/schema/core", "config");
    private final static QName _DtoJournaledJDBCJdbcAdapter_QNAME = new QName("http://activemq.apache.org/schema/core", "jdbcAdapter");
    private final static QName _DtoJournaledJDBCLocker_QNAME = new QName("http://activemq.apache.org/schema/core", "locker");
    private final static QName _DtoJournaledJDBCJournal_QNAME = new QName("http://activemq.apache.org/schema/core", "journal");
    private final static QName _DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME = new QName("http://activemq.apache.org/schema/core", "scheduledThreadPoolExecutor");
    private final static QName _DtoSslContextSSLContext_QNAME = new QName("http://activemq.apache.org/schema/core", "SSLContext");
    private final static QName _DtoSslContextKeyManagers_QNAME = new QName("http://activemq.apache.org/schema/core", "keyManagers");
    private final static QName _DtoSslContextTrustManagers_QNAME = new QName("http://activemq.apache.org/schema/core", "trustManagers");
    private final static QName _DtoSslContextSecureRandom_QNAME = new QName("http://activemq.apache.org/schema/core", "secureRandom");
    private final static QName _DtoPooledConnectionFactoryTransactionManager_QNAME = new QName("http://activemq.apache.org/schema/core", "transactionManager");
    private final static QName _DtoPooledConnectionFactoryConnectionFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "connectionFactory");
    private final static QName _DtoDemandForwardingBridgeNetworkBridgeListener_QNAME = new QName("http://activemq.apache.org/schema/core", "networkBridgeListener");
    private final static QName _DtoDemandForwardingBridgeConfiguration_QNAME = new QName("http://activemq.apache.org/schema/core", "configuration");
    private final static QName _DtoFilteredDestinationFilter_QNAME = new QName("http://activemq.apache.org/schema/core", "filter");
    private final static QName _DtoTransactDatabaseLockerExceptionHandler_QNAME = new QName("http://activemq.apache.org/schema/core", "exceptionHandler");
    private final static QName _DtoJdbcPersistenceAdapterDs_QNAME = new QName("http://activemq.apache.org/schema/core", "ds");
    private final static QName _DtoJdbcPersistenceAdapterDatabaseLocker_QNAME = new QName("http://activemq.apache.org/schema/core", "databaseLocker");
    private final static QName _DtoJdbcPersistenceAdapterLockDataSource_QNAME = new QName("http://activemq.apache.org/schema/core", "lockDataSource");
    private final static QName _DtoRedeliveryPolicyMapRedeliveryPolicyEntries_QNAME = new QName("http://activemq.apache.org/schema/core", "redeliveryPolicyEntries");
    private final static QName _DtoRedeliveryPolicyMapDefaultEntry_QNAME = new QName("http://activemq.apache.org/schema/core", "defaultEntry");
    private final static QName _DtoRedeliveryPolicyMapEntries_QNAME = new QName("http://activemq.apache.org/schema/core", "entries");
    private final static QName _DtoJournalPersistenceAdapterLongTermPersistence_QNAME = new QName("http://activemq.apache.org/schema/core", "longTermPersistence");
    private final static QName _DtoMulticastNetworkConnectorBridge_QNAME = new QName("http://activemq.apache.org/schema/core", "bridge");
    private final static QName _DtoMulticastNetworkConnectorLocalTransport_QNAME = new QName("http://activemq.apache.org/schema/core", "localTransport");
    private final static QName _DtoMulticastNetworkConnectorRemoteTransport_QNAME = new QName("http://activemq.apache.org/schema/core", "remoteTransport");
    private final static QName _DtoJmsQueueConnectorLocalQueueConnectionFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "localQueueConnectionFactory");
    private final static QName _DtoJmsQueueConnectorOutboundQueueConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundQueueConnection");
    private final static QName _DtoJmsQueueConnectorOutboundQueueBridges_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundQueueBridges");
    private final static QName _DtoJmsQueueConnectorOutboundQueueConnectionFactory_QNAME = new QName("http://activemq.apache.org/schema/core", "outboundQueueConnectionFactory");
    private final static QName _DtoJmsQueueConnectorLocalQueueConnection_QNAME = new QName("http://activemq.apache.org/schema/core", "localQueueConnection");
    private final static QName _DtoJmsQueueConnectorInboundQueueBridges_QNAME = new QName("http://activemq.apache.org/schema/core", "inboundQueueBridges");
    private final static QName _DtoPublishedAddressPolicyHostMapping_QNAME = new QName("http://activemq.apache.org/schema/core", "hostMapping");
    private final static QName _DtoPublishedAddressPolicyPortMapping_QNAME = new QName("http://activemq.apache.org/schema/core", "portMapping");
    private final static QName _DtoMKahaDBTransactionStore_QNAME = new QName("http://activemq.apache.org/schema/core", "transactionStore");
    private final static QName _DtoMKahaDBFilteredPersistenceAdapters_QNAME = new QName("http://activemq.apache.org/schema/core", "filteredPersistenceAdapters");
    private final static QName _DtoKahaDBTransactionIdTransformer_QNAME = new QName("http://activemq.apache.org/schema/core", "transactionIdTransformer");
    private final static QName _DtoPolicyMapPolicyEntries_QNAME = new QName("http://activemq.apache.org/schema/core", "policyEntries");
    private final static QName _DtoAuthorizationMapTempDestinationAuthorizationEntry_QNAME = new QName("http://activemq.apache.org/schema/core", "tempDestinationAuthorizationEntry");
    private final static QName _DtoAuthorizationMapAuthorizationEntries_QNAME = new QName("http://activemq.apache.org/schema/core", "authorizationEntries");
    private final static QName _DtoFilteredKahaDBTemplate_QNAME = new QName("http://activemq.apache.org/schema/core", "template");
    private final static QName _DtoFilteredKahaDBUsage_QNAME = new QName("http://activemq.apache.org/schema/core", "usage");
    private final static QName _DtoLDAPAuthorizationMapContext_QNAME = new QName("http://activemq.apache.org/schema/core", "context");
    private final static QName _DtoLDAPAuthorizationMapOptions_QNAME = new QName("http://activemq.apache.org/schema/core", "options");
    private final static QName _DtoLDAPAuthorizationMapQueueSearchMatchingFormat_QNAME = new QName("http://activemq.apache.org/schema/core", "queueSearchMatchingFormat");
    private final static QName _DtoLDAPAuthorizationMapTopicSearchMatchingFormat_QNAME = new QName("http://activemq.apache.org/schema/core", "topicSearchMatchingFormat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.activemq.schema.core
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DtoInformixJDBCAdapter }
     * 
     */
    public DtoInformixJDBCAdapter createDtoInformixJDBCAdapter() {
        return new DtoInformixJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoPListStoreImpl }
     * 
     */
    public DtoPListStoreImpl createDtoPListStoreImpl() {
        return new DtoPListStoreImpl();
    }

    /**
     * Create an instance of {@link DtoJobSchedulerUsage }
     * 
     */
    public DtoJobSchedulerUsage createDtoJobSchedulerUsage() {
        return new DtoJobSchedulerUsage();
    }

    /**
     * Create an instance of {@link DtoPublishedAddressPolicy }
     * 
     */
    public DtoPublishedAddressPolicy createDtoPublishedAddressPolicy() {
        return new DtoPublishedAddressPolicy();
    }

    /**
     * Create an instance of {@link DtoRetainedMessageSubscriptionRecoveryPolicy }
     * 
     */
    public DtoRetainedMessageSubscriptionRecoveryPolicy createDtoRetainedMessageSubscriptionRecoveryPolicy() {
        return new DtoRetainedMessageSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoAuthorizationPlugin }
     * 
     */
    public DtoAuthorizationPlugin createDtoAuthorizationPlugin() {
        return new DtoAuthorizationPlugin();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPlugin }
     * 
     */
    public DtoRedeliveryPlugin createDtoRedeliveryPlugin() {
        return new DtoRedeliveryPlugin();
    }

    /**
     * Create an instance of {@link DtoSybaseJdbcAdapter }
     * 
     */
    public DtoSybaseJdbcAdapter createDtoSybaseJdbcAdapter() {
        return new DtoSybaseJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoMysqlJdbcAdapter }
     * 
     */
    public DtoMysqlJdbcAdapter createDtoMysqlJdbcAdapter() {
        return new DtoMysqlJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge }
     * 
     */
    public DtoCompositeDemandForwardingBridge createDtoCompositeDemandForwardingBridge() {
        return new DtoCompositeDemandForwardingBridge();
    }

    /**
     * Create an instance of {@link DtoDefaultIOExceptionHandler }
     * 
     */
    public DtoDefaultIOExceptionHandler createDtoDefaultIOExceptionHandler() {
        return new DtoDefaultIOExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoBlobJDBCAdapter }
     * 
     */
    public DtoBlobJDBCAdapter createDtoBlobJDBCAdapter() {
        return new DtoBlobJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoAuthorizationMap }
     * 
     */
    public DtoAuthorizationMap createDtoAuthorizationMap() {
        return new DtoAuthorizationMap();
    }

    /**
     * Create an instance of {@link DtoOracleJDBCAdapter }
     * 
     */
    public DtoOracleJDBCAdapter createDtoOracleJDBCAdapter() {
        return new DtoOracleJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoMemoryUsage }
     * 
     */
    public DtoMemoryUsage createDtoMemoryUsage() {
        return new DtoMemoryUsage();
    }

    /**
     * Create an instance of {@link DtoHsqldbJdbcAdapter }
     * 
     */
    public DtoHsqldbJdbcAdapter createDtoHsqldbJdbcAdapter() {
        return new DtoHsqldbJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoStoreUsage }
     * 
     */
    public DtoStoreUsage createDtoStoreUsage() {
        return new DtoStoreUsage();
    }

    /**
     * Create an instance of {@link DtoLoggingBrokerPlugin }
     * 
     */
    public DtoLoggingBrokerPlugin createDtoLoggingBrokerPlugin() {
        return new DtoLoggingBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin }
     * 
     */
    public DtoMulticastTraceBrokerPlugin createDtoMulticastTraceBrokerPlugin() {
        return new DtoMulticastTraceBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoTimeStampingBrokerPlugin }
     * 
     */
    public DtoTimeStampingBrokerPlugin createDtoTimeStampingBrokerPlugin() {
        return new DtoTimeStampingBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoLeaseLockerIOExceptionHandler }
     * 
     */
    public DtoLeaseLockerIOExceptionHandler createDtoLeaseLockerIOExceptionHandler() {
        return new DtoLeaseLockerIOExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoLevelDB }
     * 
     */
    public DtoLevelDB createDtoLevelDB() {
        return new DtoLevelDB();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter }
     * 
     */
    public DtoJdbcPersistenceAdapter createDtoJdbcPersistenceAdapter() {
        return new DtoJdbcPersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoTransactDatabaseLocker }
     * 
     */
    public DtoTransactDatabaseLocker createDtoTransactDatabaseLocker() {
        return new DtoTransactDatabaseLocker();
    }

    /**
     * Create an instance of {@link DtoFixedSizedSubscriptionRecoveryPolicy }
     * 
     */
    public DtoFixedSizedSubscriptionRecoveryPolicy createDtoFixedSizedSubscriptionRecoveryPolicy() {
        return new DtoFixedSizedSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoTempQueue }
     * 
     */
    public DtoTempQueue createDtoTempQueue() {
        return new DtoTempQueue();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthenticationPlugin }
     * 
     */
    public DtoSimpleAuthenticationPlugin createDtoSimpleAuthenticationPlugin() {
        return new DtoSimpleAuthenticationPlugin();
    }

    /**
     * Create an instance of {@link DtoJDBCIOExceptionHandler }
     * 
     */
    public DtoJDBCIOExceptionHandler createDtoJDBCIOExceptionHandler() {
        return new DtoJDBCIOExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoSystemUsage }
     * 
     */
    public DtoSystemUsage createDtoSystemUsage() {
        return new DtoSystemUsage();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory }
     * 
     */
    public DtoXaConnectionFactory createDtoXaConnectionFactory() {
        return new DtoXaConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoAbortSlowConsumerStrategy }
     * 
     */
    public DtoAbortSlowConsumerStrategy createDtoAbortSlowConsumerStrategy() {
        return new DtoAbortSlowConsumerStrategy();
    }

    /**
     * Create an instance of {@link DtoProxyConnector }
     * 
     */
    public DtoProxyConnector createDtoProxyConnector() {
        return new DtoProxyConnector();
    }

    /**
     * Create an instance of {@link DtoCamelEndpointLoader }
     * 
     */
    public DtoCamelEndpointLoader createDtoCamelEndpointLoader() {
        return new DtoCamelEndpointLoader();
    }

    /**
     * Create an instance of {@link DtoAuthorizationEntry }
     * 
     */
    public DtoAuthorizationEntry createDtoAuthorizationEntry() {
        return new DtoAuthorizationEntry();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter }
     * 
     */
    public DtoJournalPersistenceAdapter createDtoJournalPersistenceAdapter() {
        return new DtoJournalPersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoPolicyMap }
     * 
     */
    public DtoPolicyMap createDtoPolicyMap() {
        return new DtoPolicyMap();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC }
     * 
     */
    public DtoJournaledJDBC createDtoJournaledJDBC() {
        return new DtoJournaledJDBC();
    }

    /**
     * Create an instance of {@link DtoReplicatedLevelDB }
     * 
     */
    public DtoReplicatedLevelDB createDtoReplicatedLevelDB() {
        return new DtoReplicatedLevelDB();
    }

    /**
     * Create an instance of {@link DtoSharedFileLocker }
     * 
     */
    public DtoSharedFileLocker createDtoSharedFileLocker() {
        return new DtoSharedFileLocker();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin }
     * 
     */
    public DtoUdpTraceBrokerPlugin createDtoUdpTraceBrokerPlugin() {
        return new DtoUdpTraceBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge }
     * 
     */
    public DtoOutboundTopicBridge createDtoOutboundTopicBridge() {
        return new DtoOutboundTopicBridge();
    }

    /**
     * Create an instance of {@link DtoMirroredQueue }
     * 
     */
    public DtoMirroredQueue createDtoMirroredQueue() {
        return new DtoMirroredQueue();
    }

    /**
     * Create an instance of {@link DtoCompositeQueue }
     * 
     */
    public DtoCompositeQueue createDtoCompositeQueue() {
        return new DtoCompositeQueue();
    }

    /**
     * Create an instance of {@link DtoForcePersistencyModeBroker }
     * 
     */
    public DtoForcePersistencyModeBroker createDtoForcePersistencyModeBroker() {
        return new DtoForcePersistencyModeBroker();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge }
     * 
     */
    public DtoInboundQueueBridge createDtoInboundQueueBridge() {
        return new DtoInboundQueueBridge();
    }

    /**
     * Create an instance of {@link DtoCompositeTopic }
     * 
     */
    public DtoCompositeTopic createDtoCompositeTopic() {
        return new DtoCompositeTopic();
    }

    /**
     * Create an instance of {@link DtoFixedCountSubscriptionRecoveryPolicy }
     * 
     */
    public DtoFixedCountSubscriptionRecoveryPolicy createDtoFixedCountSubscriptionRecoveryPolicy() {
        return new DtoFixedCountSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoFilteredDestination }
     * 
     */
    public DtoFilteredDestination createDtoFilteredDestination() {
        return new DtoFilteredDestination();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicy }
     * 
     */
    public DtoRedeliveryPolicy createDtoRedeliveryPolicy() {
        return new DtoRedeliveryPolicy();
    }

    /**
     * Create an instance of {@link DtoQueryBasedSubscriptionRecoveryPolicy }
     * 
     */
    public DtoQueryBasedSubscriptionRecoveryPolicy createDtoQueryBasedSubscriptionRecoveryPolicy() {
        return new DtoQueryBasedSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoDiscarding }
     * 
     */
    public DtoDiscarding createDtoDiscarding() {
        return new DtoDiscarding();
    }

    /**
     * Create an instance of {@link DtoTempTopic }
     * 
     */
    public DtoTempTopic createDtoTempTopic() {
        return new DtoTempTopic();
    }

    /**
     * Create an instance of {@link DtoDestinationPathSeparatorPlugin }
     * 
     */
    public DtoDestinationPathSeparatorPlugin createDtoDestinationPathSeparatorPlugin() {
        return new DtoDestinationPathSeparatorPlugin();
    }

    /**
     * Create an instance of {@link DtoBroker }
     * 
     */
    public DtoBroker createDtoBroker() {
        return new DtoBroker();
    }

    /**
     * Create an instance of {@link DtoDestinationEntry }
     * 
     */
    public DtoDestinationEntry createDtoDestinationEntry() {
        return new DtoDestinationEntry();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthorizationMap }
     * 
     */
    public DtoSimpleAuthorizationMap createDtoSimpleAuthorizationMap() {
        return new DtoSimpleAuthorizationMap();
    }

    /**
     * Create an instance of {@link DtoAbortSlowAckConsumerStrategy }
     * 
     */
    public DtoAbortSlowAckConsumerStrategy createDtoAbortSlowAckConsumerStrategy() {
        return new DtoAbortSlowAckConsumerStrategy();
    }

    /**
     * Create an instance of {@link DtoMaxdbJdbcAdapter }
     * 
     */
    public DtoMaxdbJdbcAdapter createDtoMaxdbJdbcAdapter() {
        return new DtoMaxdbJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoTimedSubscriptionRecoveryPolicy }
     * 
     */
    public DtoTimedSubscriptionRecoveryPolicy createDtoTimedSubscriptionRecoveryPolicy() {
        return new DtoTimedSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge }
     * 
     */
    public DtoInboundTopicBridge createDtoInboundTopicBridge() {
        return new DtoInboundTopicBridge();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory }
     * 
     */
    public DtoConnectionFactory createDtoConnectionFactory() {
        return new DtoConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoDestinationsPlugin }
     * 
     */
    public DtoDestinationsPlugin createDtoDestinationsPlugin() {
        return new DtoDestinationsPlugin();
    }

    /**
     * Create an instance of {@link DtoTransportConnector }
     * 
     */
    public DtoTransportConnector createDtoTransportConnector() {
        return new DtoTransportConnector();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge }
     * 
     */
    public DtoDemandForwardingBridge createDtoDemandForwardingBridge() {
        return new DtoDemandForwardingBridge();
    }

    /**
     * Create an instance of {@link DtoBrokerService }
     * 
     */
    public DtoBrokerService createDtoBrokerService() {
        return new DtoBrokerService();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector }
     * 
     */
    public DtoJmsQueueConnector createDtoJmsQueueConnector() {
        return new DtoJmsQueueConnector();
    }

    /**
     * Create an instance of {@link DtoQueue }
     * 
     */
    public DtoQueue createDtoQueue() {
        return new DtoQueue();
    }

    /**
     * Create an instance of {@link DtoTraceBrokerPathPlugin }
     * 
     */
    public DtoTraceBrokerPathPlugin createDtoTraceBrokerPathPlugin() {
        return new DtoTraceBrokerPathPlugin();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicyMap }
     * 
     */
    public DtoRedeliveryPolicyMap createDtoRedeliveryPolicyMap() {
        return new DtoRedeliveryPolicyMap();
    }

    /**
     * Create an instance of {@link DtoNoSubscriptionRecoveryPolicy }
     * 
     */
    public DtoNoSubscriptionRecoveryPolicy createDtoNoSubscriptionRecoveryPolicy() {
        return new DtoNoSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoTransactJdbcAdapter }
     * 
     */
    public DtoTransactJdbcAdapter createDtoTransactJdbcAdapter() {
        return new DtoTransactJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoKahaDB }
     * 
     */
    public DtoKahaDB createDtoKahaDB() {
        return new DtoKahaDB();
    }

    /**
     * Create an instance of {@link DtoManagementContext }
     * 
     */
    public DtoManagementContext createDtoManagementContext() {
        return new DtoManagementContext();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector }
     * 
     */
    public DtoNetworkConnector createDtoNetworkConnector() {
        return new DtoNetworkConnector();
    }

    /**
     * Create an instance of {@link DtoLDAPAuthorizationMap }
     * 
     */
    public DtoLDAPAuthorizationMap createDtoLDAPAuthorizationMap() {
        return new DtoLDAPAuthorizationMap();
    }

    /**
     * Create an instance of {@link DtoLeaseDatabaseLocker }
     * 
     */
    public DtoLeaseDatabaseLocker createDtoLeaseDatabaseLocker() {
        return new DtoLeaseDatabaseLocker();
    }

    /**
     * Create an instance of {@link DtoSslContext }
     * 
     */
    public DtoSslContext createDtoSslContext() {
        return new DtoSslContext();
    }

    /**
     * Create an instance of {@link DtoPooledConnectionFactory }
     * 
     */
    public DtoPooledConnectionFactory createDtoPooledConnectionFactory() {
        return new DtoPooledConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoQueueDispatchSelector }
     * 
     */
    public DtoQueueDispatchSelector createDtoQueueDispatchSelector() {
        return new DtoQueueDispatchSelector();
    }

    /**
     * Create an instance of {@link DtoDb2JDBCAdapter }
     * 
     */
    public DtoDb2JDBCAdapter createDtoDb2JDBCAdapter() {
        return new DtoDb2JDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoForwardingBridge }
     * 
     */
    public DtoForwardingBridge createDtoForwardingBridge() {
        return new DtoForwardingBridge();
    }

    /**
     * Create an instance of {@link DtoTempDestinationAuthorizationEntry }
     * 
     */
    public DtoTempDestinationAuthorizationEntry createDtoTempDestinationAuthorizationEntry() {
        return new DtoTempDestinationAuthorizationEntry();
    }

    /**
     * Create an instance of {@link DtoTopic }
     * 
     */
    public DtoTopic createDtoTopic() {
        return new DtoTopic();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge }
     * 
     */
    public DtoOutboundQueueBridge createDtoOutboundQueueBridge() {
        return new DtoOutboundQueueBridge();
    }

    /**
     * Create an instance of {@link DtoLastImageSubscriptionRecoveryPolicy }
     * 
     */
    public DtoLastImageSubscriptionRecoveryPolicy createDtoLastImageSubscriptionRecoveryPolicy() {
        return new DtoLastImageSubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector }
     * 
     */
    public DtoMulticastNetworkConnector createDtoMulticastNetworkConnector() {
        return new DtoMulticastNetworkConnector();
    }

    /**
     * Create an instance of {@link DtoSimpleDispatchSelector }
     * 
     */
    public DtoSimpleDispatchSelector createDtoSimpleDispatchSelector() {
        return new DtoSimpleDispatchSelector();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry }
     * 
     */
    public DtoPolicyEntry createDtoPolicyEntry() {
        return new DtoPolicyEntry();
    }

    /**
     * Create an instance of {@link DtoImageBasedJDBCAdaptor }
     * 
     */
    public DtoImageBasedJDBCAdaptor createDtoImageBasedJDBCAdaptor() {
        return new DtoImageBasedJDBCAdaptor();
    }

    /**
     * Create an instance of {@link DtoDefaultJDBCAdapter }
     * 
     */
    public DtoDefaultJDBCAdapter createDtoDefaultJDBCAdapter() {
        return new DtoDefaultJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoStatements }
     * 
     */
    public DtoStatements createDtoStatements() {
        return new DtoStatements();
    }

    /**
     * Create an instance of {@link DtoSharedDeadLetterStrategy }
     * 
     */
    public DtoSharedDeadLetterStrategy createDtoSharedDeadLetterStrategy() {
        return new DtoSharedDeadLetterStrategy();
    }

    /**
     * Create an instance of {@link DtoTempUsage }
     * 
     */
    public DtoTempUsage createDtoTempUsage() {
        return new DtoTempUsage();
    }

    /**
     * Create an instance of {@link DtoMKahaDB }
     * 
     */
    public DtoMKahaDB createDtoMKahaDB() {
        return new DtoMKahaDB();
    }

    /**
     * Create an instance of {@link DtoAxionJDBCAdapter }
     * 
     */
    public DtoAxionJDBCAdapter createDtoAxionJDBCAdapter() {
        return new DtoAxionJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoTaskRunnerFactory }
     * 
     */
    public DtoTaskRunnerFactory createDtoTaskRunnerFactory() {
        return new DtoTaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector }
     * 
     */
    public DtoLdapNetworkConnector createDtoLdapNetworkConnector() {
        return new DtoLdapNetworkConnector();
    }

    /**
     * Create an instance of {@link DtoMemoryPersistenceAdapter }
     * 
     */
    public DtoMemoryPersistenceAdapter createDtoMemoryPersistenceAdapter() {
        return new DtoMemoryPersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoDatabaseLocker }
     * 
     */
    public DtoDatabaseLocker createDtoDatabaseLocker() {
        return new DtoDatabaseLocker();
    }

    /**
     * Create an instance of {@link DtoVirtualDestinationInterceptor }
     * 
     */
    public DtoVirtualDestinationInterceptor createDtoVirtualDestinationInterceptor() {
        return new DtoVirtualDestinationInterceptor();
    }

    /**
     * Create an instance of {@link DtoPostgresqlJdbcAdapter }
     * 
     */
    public DtoPostgresqlJdbcAdapter createDtoPostgresqlJdbcAdapter() {
        return new DtoPostgresqlJdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoOracleBlobJDBCAdapter }
     * 
     */
    public DtoOracleBlobJDBCAdapter createDtoOracleBlobJDBCAdapter() {
        return new DtoOracleBlobJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoPartitionBrokerPlugin }
     * 
     */
    public DtoPartitionBrokerPlugin createDtoPartitionBrokerPlugin() {
        return new DtoPartitionBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoStreamJDBCAdapter }
     * 
     */
    public DtoStreamJDBCAdapter createDtoStreamJDBCAdapter() {
        return new DtoStreamJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoBytesJDBCAdapter }
     * 
     */
    public DtoBytesJDBCAdapter createDtoBytesJDBCAdapter() {
        return new DtoBytesJDBCAdapter();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB }
     * 
     */
    public DtoFilteredKahaDB createDtoFilteredKahaDB() {
        return new DtoFilteredKahaDB();
    }

    /**
     * Create an instance of {@link DtoSimpleJmsMessageConvertor }
     * 
     */
    public DtoSimpleJmsMessageConvertor createDtoSimpleJmsMessageConvertor() {
        return new DtoSimpleJmsMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory }
     * 
     */
    public DtoJournalPersistenceAdapterFactory createDtoJournalPersistenceAdapterFactory() {
        return new DtoJournalPersistenceAdapterFactory();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector }
     * 
     */
    public DtoJmsTopicConnector createDtoJmsTopicConnector() {
        return new DtoJmsTopicConnector();
    }

    /**
     * Create an instance of {@link DtoInformixJDBCAdapter.Statements }
     * 
     */
    public DtoInformixJDBCAdapter.Statements createDtoInformixJDBCAdapterStatements() {
        return new DtoInformixJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoPListStoreImpl.BrokerService }
     * 
     */
    public DtoPListStoreImpl.BrokerService createDtoPListStoreImplBrokerService() {
        return new DtoPListStoreImpl.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJobSchedulerUsage.Executor }
     * 
     */
    public DtoJobSchedulerUsage.Executor createDtoJobSchedulerUsageExecutor() {
        return new DtoJobSchedulerUsage.Executor();
    }

    /**
     * Create an instance of {@link DtoJobSchedulerUsage.Limiter }
     * 
     */
    public DtoJobSchedulerUsage.Limiter createDtoJobSchedulerUsageLimiter() {
        return new DtoJobSchedulerUsage.Limiter();
    }

    /**
     * Create an instance of {@link DtoJobSchedulerUsage.Parent }
     * 
     */
    public DtoJobSchedulerUsage.Parent createDtoJobSchedulerUsageParent() {
        return new DtoJobSchedulerUsage.Parent();
    }

    /**
     * Create an instance of {@link DtoJobSchedulerUsage.Store }
     * 
     */
    public DtoJobSchedulerUsage.Store createDtoJobSchedulerUsageStore() {
        return new DtoJobSchedulerUsage.Store();
    }

    /**
     * Create an instance of {@link DtoPrefetchPolicy }
     * 
     */
    public DtoPrefetchPolicy createDtoPrefetchPolicy() {
        return new DtoPrefetchPolicy();
    }

    /**
     * Create an instance of {@link DtoPriorityDispatchPolicy }
     * 
     */
    public DtoPriorityDispatchPolicy createDtoPriorityDispatchPolicy() {
        return new DtoPriorityDispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoPublishedAddressPolicy.HostMapping }
     * 
     */
    public DtoPublishedAddressPolicy.HostMapping createDtoPublishedAddressPolicyHostMapping() {
        return new DtoPublishedAddressPolicy.HostMapping();
    }

    /**
     * Create an instance of {@link DtoPublishedAddressPolicy.PortMapping }
     * 
     */
    public DtoPublishedAddressPolicy.PortMapping createDtoPublishedAddressPolicyPortMapping() {
        return new DtoPublishedAddressPolicy.PortMapping();
    }

    /**
     * Create an instance of {@link DtoRetainedMessageSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoRetainedMessageSubscriptionRecoveryPolicy.Broker createDtoRetainedMessageSubscriptionRecoveryPolicyBroker() {
        return new DtoRetainedMessageSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped }
     * 
     */
    public DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped createDtoRetainedMessageSubscriptionRecoveryPolicyWrapped() {
        return new DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped();
    }

    /**
     * Create an instance of {@link DtoAuthorizationPlugin.Map }
     * 
     */
    public DtoAuthorizationPlugin.Map createDtoAuthorizationPluginMap() {
        return new DtoAuthorizationPlugin.Map();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPlugin.AdminConnectionContext }
     * 
     */
    public DtoRedeliveryPlugin.AdminConnectionContext createDtoRedeliveryPluginAdminConnectionContext() {
        return new DtoRedeliveryPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPlugin.Next }
     * 
     */
    public DtoRedeliveryPlugin.Next createDtoRedeliveryPluginNext() {
        return new DtoRedeliveryPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPlugin.RedeliveryPolicyMap }
     * 
     */
    public DtoRedeliveryPlugin.RedeliveryPolicyMap createDtoRedeliveryPluginRedeliveryPolicyMap() {
        return new DtoRedeliveryPlugin.RedeliveryPolicyMap();
    }

    /**
     * Create an instance of {@link DtoSybaseJdbcAdapter.Statements }
     * 
     */
    public DtoSybaseJdbcAdapter.Statements createDtoSybaseJdbcAdapterStatements() {
        return new DtoSybaseJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoMysqlJdbcAdapter.Statements }
     * 
     */
    public DtoMysqlJdbcAdapter.Statements createDtoMysqlJdbcAdapterStatements() {
        return new DtoMysqlJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.BrokerService }
     * 
     */
    public DtoCompositeDemandForwardingBridge.BrokerService createDtoCompositeDemandForwardingBridgeBrokerService() {
        return new DtoCompositeDemandForwardingBridge.BrokerService();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.Configuration }
     * 
     */
    public DtoCompositeDemandForwardingBridge.Configuration createDtoCompositeDemandForwardingBridgeConfiguration() {
        return new DtoCompositeDemandForwardingBridge.Configuration();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.DurableDestinations }
     * 
     */
    public DtoCompositeDemandForwardingBridge.DurableDestinations createDtoCompositeDemandForwardingBridgeDurableDestinations() {
        return new DtoCompositeDemandForwardingBridge.DurableDestinations();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations }
     * 
     */
    public DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations createDtoCompositeDemandForwardingBridgeDynamicallyIncludedDestinations() {
        return new DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.ExcludedDestinations }
     * 
     */
    public DtoCompositeDemandForwardingBridge.ExcludedDestinations createDtoCompositeDemandForwardingBridgeExcludedDestinations() {
        return new DtoCompositeDemandForwardingBridge.ExcludedDestinations();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.LocalBroker }
     * 
     */
    public DtoCompositeDemandForwardingBridge.LocalBroker createDtoCompositeDemandForwardingBridgeLocalBroker() {
        return new DtoCompositeDemandForwardingBridge.LocalBroker();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.NetworkBridgeListener }
     * 
     */
    public DtoCompositeDemandForwardingBridge.NetworkBridgeListener createDtoCompositeDemandForwardingBridgeNetworkBridgeListener() {
        return new DtoCompositeDemandForwardingBridge.NetworkBridgeListener();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.RemoteBroker }
     * 
     */
    public DtoCompositeDemandForwardingBridge.RemoteBroker createDtoCompositeDemandForwardingBridgeRemoteBroker() {
        return new DtoCompositeDemandForwardingBridge.RemoteBroker();
    }

    /**
     * Create an instance of {@link DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations }
     * 
     */
    public DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations createDtoCompositeDemandForwardingBridgeStaticallyIncludedDestinations() {
        return new DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoDefaultIOExceptionHandler.BrokerService }
     * 
     */
    public DtoDefaultIOExceptionHandler.BrokerService createDtoDefaultIOExceptionHandlerBrokerService() {
        return new DtoDefaultIOExceptionHandler.BrokerService();
    }

    /**
     * Create an instance of {@link DtoBlobJDBCAdapter.Statements }
     * 
     */
    public DtoBlobJDBCAdapter.Statements createDtoBlobJDBCAdapterStatements() {
        return new DtoBlobJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoCachedMessageGroupMapFactory }
     * 
     */
    public DtoCachedMessageGroupMapFactory createDtoCachedMessageGroupMapFactory() {
        return new DtoCachedMessageGroupMapFactory();
    }

    /**
     * Create an instance of {@link DtoAuthorizationMap.AuthorizationEntries }
     * 
     */
    public DtoAuthorizationMap.AuthorizationEntries createDtoAuthorizationMapAuthorizationEntries() {
        return new DtoAuthorizationMap.AuthorizationEntries();
    }

    /**
     * Create an instance of {@link DtoAuthorizationMap.DefaultEntry }
     * 
     */
    public DtoAuthorizationMap.DefaultEntry createDtoAuthorizationMapDefaultEntry() {
        return new DtoAuthorizationMap.DefaultEntry();
    }

    /**
     * Create an instance of {@link DtoAuthorizationMap.Entries }
     * 
     */
    public DtoAuthorizationMap.Entries createDtoAuthorizationMapEntries() {
        return new DtoAuthorizationMap.Entries();
    }

    /**
     * Create an instance of {@link DtoAuthorizationMap.TempDestinationAuthorizationEntry }
     * 
     */
    public DtoAuthorizationMap.TempDestinationAuthorizationEntry createDtoAuthorizationMapTempDestinationAuthorizationEntry() {
        return new DtoAuthorizationMap.TempDestinationAuthorizationEntry();
    }

    /**
     * Create an instance of {@link DtoOracleJDBCAdapter.Statements }
     * 
     */
    public DtoOracleJDBCAdapter.Statements createDtoOracleJDBCAdapterStatements() {
        return new DtoOracleJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoVmCursor }
     * 
     */
    public DtoVmCursor createDtoVmCursor() {
        return new DtoVmCursor();
    }

    /**
     * Create an instance of {@link DtoMemoryUsage.Executor }
     * 
     */
    public DtoMemoryUsage.Executor createDtoMemoryUsageExecutor() {
        return new DtoMemoryUsage.Executor();
    }

    /**
     * Create an instance of {@link DtoMemoryUsage.Limiter }
     * 
     */
    public DtoMemoryUsage.Limiter createDtoMemoryUsageLimiter() {
        return new DtoMemoryUsage.Limiter();
    }

    /**
     * Create an instance of {@link DtoMemoryUsage.Parent }
     * 
     */
    public DtoMemoryUsage.Parent createDtoMemoryUsageParent() {
        return new DtoMemoryUsage.Parent();
    }

    /**
     * Create an instance of {@link DtoHsqldbJdbcAdapter.Statements }
     * 
     */
    public DtoHsqldbJdbcAdapter.Statements createDtoHsqldbJdbcAdapterStatements() {
        return new DtoHsqldbJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoStoreUsage.Executor }
     * 
     */
    public DtoStoreUsage.Executor createDtoStoreUsageExecutor() {
        return new DtoStoreUsage.Executor();
    }

    /**
     * Create an instance of {@link DtoStoreUsage.Limiter }
     * 
     */
    public DtoStoreUsage.Limiter createDtoStoreUsageLimiter() {
        return new DtoStoreUsage.Limiter();
    }

    /**
     * Create an instance of {@link DtoStoreUsage.Parent }
     * 
     */
    public DtoStoreUsage.Parent createDtoStoreUsageParent() {
        return new DtoStoreUsage.Parent();
    }

    /**
     * Create an instance of {@link DtoStoreUsage.Store }
     * 
     */
    public DtoStoreUsage.Store createDtoStoreUsageStore() {
        return new DtoStoreUsage.Store();
    }

    /**
     * Create an instance of {@link DtoLoggingBrokerPlugin.AdminConnectionContext }
     * 
     */
    public DtoLoggingBrokerPlugin.AdminConnectionContext createDtoLoggingBrokerPluginAdminConnectionContext() {
        return new DtoLoggingBrokerPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoLoggingBrokerPlugin.Next }
     * 
     */
    public DtoLoggingBrokerPlugin.Next createDtoLoggingBrokerPluginNext() {
        return new DtoLoggingBrokerPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin.Address }
     * 
     */
    public DtoMulticastTraceBrokerPlugin.Address createDtoMulticastTraceBrokerPluginAddress() {
        return new DtoMulticastTraceBrokerPlugin.Address();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin.AdminConnectionContext }
     * 
     */
    public DtoMulticastTraceBrokerPlugin.AdminConnectionContext createDtoMulticastTraceBrokerPluginAdminConnectionContext() {
        return new DtoMulticastTraceBrokerPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin.Next }
     * 
     */
    public DtoMulticastTraceBrokerPlugin.Next createDtoMulticastTraceBrokerPluginNext() {
        return new DtoMulticastTraceBrokerPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin.WireFormat }
     * 
     */
    public DtoMulticastTraceBrokerPlugin.WireFormat createDtoMulticastTraceBrokerPluginWireFormat() {
        return new DtoMulticastTraceBrokerPlugin.WireFormat();
    }

    /**
     * Create an instance of {@link DtoMulticastTraceBrokerPlugin.WireFormatFactory }
     * 
     */
    public DtoMulticastTraceBrokerPlugin.WireFormatFactory createDtoMulticastTraceBrokerPluginWireFormatFactory() {
        return new DtoMulticastTraceBrokerPlugin.WireFormatFactory();
    }

    /**
     * Create an instance of {@link DtoTimeStampingBrokerPlugin.AdminConnectionContext }
     * 
     */
    public DtoTimeStampingBrokerPlugin.AdminConnectionContext createDtoTimeStampingBrokerPluginAdminConnectionContext() {
        return new DtoTimeStampingBrokerPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoTimeStampingBrokerPlugin.Next }
     * 
     */
    public DtoTimeStampingBrokerPlugin.Next createDtoTimeStampingBrokerPluginNext() {
        return new DtoTimeStampingBrokerPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoRoundRobinDispatchPolicy }
     * 
     */
    public DtoRoundRobinDispatchPolicy createDtoRoundRobinDispatchPolicy() {
        return new DtoRoundRobinDispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoLeaseLockerIOExceptionHandler.BrokerService }
     * 
     */
    public DtoLeaseLockerIOExceptionHandler.BrokerService createDtoLeaseLockerIOExceptionHandlerBrokerService() {
        return new DtoLeaseLockerIOExceptionHandler.BrokerService();
    }

    /**
     * Create an instance of {@link DtoLevelDB.BrokerService }
     * 
     */
    public DtoLevelDB.BrokerService createDtoLevelDBBrokerService() {
        return new DtoLevelDB.BrokerService();
    }

    /**
     * Create an instance of {@link DtoLevelDB.Locker }
     * 
     */
    public DtoLevelDB.Locker createDtoLevelDBLocker() {
        return new DtoLevelDB.Locker();
    }

    /**
     * Create an instance of {@link DtoLevelDB.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoLevelDB.ScheduledThreadPoolExecutor createDtoLevelDBScheduledThreadPoolExecutor() {
        return new DtoLevelDB.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoLevelDB.TransactionIdTransformer }
     * 
     */
    public DtoLevelDB.TransactionIdTransformer createDtoLevelDBTransactionIdTransformer() {
        return new DtoLevelDB.TransactionIdTransformer();
    }

    /**
     * Create an instance of {@link DtoLevelDB.UsageManager }
     * 
     */
    public DtoLevelDB.UsageManager createDtoLevelDBUsageManager() {
        return new DtoLevelDB.UsageManager();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.Adapter }
     * 
     */
    public DtoJdbcPersistenceAdapter.Adapter createDtoJdbcPersistenceAdapterAdapter() {
        return new DtoJdbcPersistenceAdapter.Adapter();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.BrokerService }
     * 
     */
    public DtoJdbcPersistenceAdapter.BrokerService createDtoJdbcPersistenceAdapterBrokerService() {
        return new DtoJdbcPersistenceAdapter.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.DataSource }
     * 
     */
    public DtoJdbcPersistenceAdapter.DataSource createDtoJdbcPersistenceAdapterDataSource() {
        return new DtoJdbcPersistenceAdapter.DataSource();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.DatabaseLocker }
     * 
     */
    public DtoJdbcPersistenceAdapter.DatabaseLocker createDtoJdbcPersistenceAdapterDatabaseLocker() {
        return new DtoJdbcPersistenceAdapter.DatabaseLocker();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.Ds }
     * 
     */
    public DtoJdbcPersistenceAdapter.Ds createDtoJdbcPersistenceAdapterDs() {
        return new DtoJdbcPersistenceAdapter.Ds();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.LockDataSource }
     * 
     */
    public DtoJdbcPersistenceAdapter.LockDataSource createDtoJdbcPersistenceAdapterLockDataSource() {
        return new DtoJdbcPersistenceAdapter.LockDataSource();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.Locker }
     * 
     */
    public DtoJdbcPersistenceAdapter.Locker createDtoJdbcPersistenceAdapterLocker() {
        return new DtoJdbcPersistenceAdapter.Locker();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor createDtoJdbcPersistenceAdapterScheduledThreadPoolExecutor() {
        return new DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.Statements }
     * 
     */
    public DtoJdbcPersistenceAdapter.Statements createDtoJdbcPersistenceAdapterStatements() {
        return new DtoJdbcPersistenceAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.UsageManager }
     * 
     */
    public DtoJdbcPersistenceAdapter.UsageManager createDtoJdbcPersistenceAdapterUsageManager() {
        return new DtoJdbcPersistenceAdapter.UsageManager();
    }

    /**
     * Create an instance of {@link DtoJdbcPersistenceAdapter.WireFormat }
     * 
     */
    public DtoJdbcPersistenceAdapter.WireFormat createDtoJdbcPersistenceAdapterWireFormat() {
        return new DtoJdbcPersistenceAdapter.WireFormat();
    }

    /**
     * Create an instance of {@link DtoTransactDatabaseLocker.DataSource }
     * 
     */
    public DtoTransactDatabaseLocker.DataSource createDtoTransactDatabaseLockerDataSource() {
        return new DtoTransactDatabaseLocker.DataSource();
    }

    /**
     * Create an instance of {@link DtoTransactDatabaseLocker.ExceptionHandler }
     * 
     */
    public DtoTransactDatabaseLocker.ExceptionHandler createDtoTransactDatabaseLockerExceptionHandler() {
        return new DtoTransactDatabaseLocker.ExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoTransactDatabaseLocker.Lockable }
     * 
     */
    public DtoTransactDatabaseLocker.Lockable createDtoTransactDatabaseLockerLockable() {
        return new DtoTransactDatabaseLocker.Lockable();
    }

    /**
     * Create an instance of {@link DtoTransactDatabaseLocker.Statements }
     * 
     */
    public DtoTransactDatabaseLocker.Statements createDtoTransactDatabaseLockerStatements() {
        return new DtoTransactDatabaseLocker.Statements();
    }

    /**
     * Create an instance of {@link DtoForcePersistencyModeBrokerPlugin }
     * 
     */
    public DtoForcePersistencyModeBrokerPlugin createDtoForcePersistencyModeBrokerPlugin() {
        return new DtoForcePersistencyModeBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoFixedSizedSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoFixedSizedSubscriptionRecoveryPolicy.Broker createDtoFixedSizedSubscriptionRecoveryPolicyBroker() {
        return new DtoFixedSizedSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoFixedSizedSubscriptionRecoveryPolicy.Buffer }
     * 
     */
    public DtoFixedSizedSubscriptionRecoveryPolicy.Buffer createDtoFixedSizedSubscriptionRecoveryPolicyBuffer() {
        return new DtoFixedSizedSubscriptionRecoveryPolicy.Buffer();
    }

    /**
     * Create an instance of {@link DtoTempQueue.CompositeDestinations }
     * 
     */
    public DtoTempQueue.CompositeDestinations createDtoTempQueueCompositeDestinations() {
        return new DtoTempQueue.CompositeDestinations();
    }

    /**
     * Create an instance of {@link DtoTempQueue.Connection }
     * 
     */
    public DtoTempQueue.Connection createDtoTempQueueConnection() {
        return new DtoTempQueue.Connection();
    }

    /**
     * Create an instance of {@link DtoTempQueue.Properties }
     * 
     */
    public DtoTempQueue.Properties createDtoTempQueueProperties() {
        return new DtoTempQueue.Properties();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthenticationPlugin.UserGroups }
     * 
     */
    public DtoSimpleAuthenticationPlugin.UserGroups createDtoSimpleAuthenticationPluginUserGroups() {
        return new DtoSimpleAuthenticationPlugin.UserGroups();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthenticationPlugin.UserPasswords }
     * 
     */
    public DtoSimpleAuthenticationPlugin.UserPasswords createDtoSimpleAuthenticationPluginUserPasswords() {
        return new DtoSimpleAuthenticationPlugin.UserPasswords();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthenticationPlugin.Users }
     * 
     */
    public DtoSimpleAuthenticationPlugin.Users createDtoSimpleAuthenticationPluginUsers() {
        return new DtoSimpleAuthenticationPlugin.Users();
    }

    /**
     * Create an instance of {@link DtoPriorityNetworkDispatchPolicy }
     * 
     */
    public DtoPriorityNetworkDispatchPolicy createDtoPriorityNetworkDispatchPolicy() {
        return new DtoPriorityNetworkDispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoJDBCIOExceptionHandler.BrokerService }
     * 
     */
    public DtoJDBCIOExceptionHandler.BrokerService createDtoJDBCIOExceptionHandlerBrokerService() {
        return new DtoJDBCIOExceptionHandler.BrokerService();
    }

    /**
     * Create an instance of {@link DtoVmQueueCursor }
     * 
     */
    public DtoVmQueueCursor createDtoVmQueueCursor() {
        return new DtoVmQueueCursor();
    }

    /**
     * Create an instance of {@link DtoDefaultUsageCapacity }
     * 
     */
    public DtoDefaultUsageCapacity createDtoDefaultUsageCapacity() {
        return new DtoDefaultUsageCapacity();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.Adapter }
     * 
     */
    public DtoSystemUsage.Adapter createDtoSystemUsageAdapter() {
        return new DtoSystemUsage.Adapter();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.Executor }
     * 
     */
    public DtoSystemUsage.Executor createDtoSystemUsageExecutor() {
        return new DtoSystemUsage.Executor();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.JobSchedulerStore }
     * 
     */
    public DtoSystemUsage.JobSchedulerStore createDtoSystemUsageJobSchedulerStore() {
        return new DtoSystemUsage.JobSchedulerStore();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.JobSchedulerUsage }
     * 
     */
    public DtoSystemUsage.JobSchedulerUsage createDtoSystemUsageJobSchedulerUsage() {
        return new DtoSystemUsage.JobSchedulerUsage();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.MemoryUsage }
     * 
     */
    public DtoSystemUsage.MemoryUsage createDtoSystemUsageMemoryUsage() {
        return new DtoSystemUsage.MemoryUsage();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.Parent }
     * 
     */
    public DtoSystemUsage.Parent createDtoSystemUsageParent() {
        return new DtoSystemUsage.Parent();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.StoreUsage }
     * 
     */
    public DtoSystemUsage.StoreUsage createDtoSystemUsageStoreUsage() {
        return new DtoSystemUsage.StoreUsage();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.TempStore }
     * 
     */
    public DtoSystemUsage.TempStore createDtoSystemUsageTempStore() {
        return new DtoSystemUsage.TempStore();
    }

    /**
     * Create an instance of {@link DtoSystemUsage.TempUsage }
     * 
     */
    public DtoSystemUsage.TempUsage createDtoSystemUsageTempUsage() {
        return new DtoSystemUsage.TempUsage();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.BlobTransferPolicy }
     * 
     */
    public DtoXaConnectionFactory.BlobTransferPolicy createDtoXaConnectionFactoryBlobTransferPolicy() {
        return new DtoXaConnectionFactory.BlobTransferPolicy();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.ClientIdGenerator }
     * 
     */
    public DtoXaConnectionFactory.ClientIdGenerator createDtoXaConnectionFactoryClientIdGenerator() {
        return new DtoXaConnectionFactory.ClientIdGenerator();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.ClientInternalExceptionListener }
     * 
     */
    public DtoXaConnectionFactory.ClientInternalExceptionListener createDtoXaConnectionFactoryClientInternalExceptionListener() {
        return new DtoXaConnectionFactory.ClientInternalExceptionListener();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.ConnectionIdGenerator }
     * 
     */
    public DtoXaConnectionFactory.ConnectionIdGenerator createDtoXaConnectionFactoryConnectionIdGenerator() {
        return new DtoXaConnectionFactory.ConnectionIdGenerator();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.ExceptionListener }
     * 
     */
    public DtoXaConnectionFactory.ExceptionListener createDtoXaConnectionFactoryExceptionListener() {
        return new DtoXaConnectionFactory.ExceptionListener();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.PrefetchPolicy }
     * 
     */
    public DtoXaConnectionFactory.PrefetchPolicy createDtoXaConnectionFactoryPrefetchPolicy() {
        return new DtoXaConnectionFactory.PrefetchPolicy();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.Properties }
     * 
     */
    public DtoXaConnectionFactory.Properties createDtoXaConnectionFactoryProperties() {
        return new DtoXaConnectionFactory.Properties();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.RedeliveryPolicy }
     * 
     */
    public DtoXaConnectionFactory.RedeliveryPolicy createDtoXaConnectionFactoryRedeliveryPolicy() {
        return new DtoXaConnectionFactory.RedeliveryPolicy();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.RedeliveryPolicyMap }
     * 
     */
    public DtoXaConnectionFactory.RedeliveryPolicyMap createDtoXaConnectionFactoryRedeliveryPolicyMap() {
        return new DtoXaConnectionFactory.RedeliveryPolicyMap();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.RejectedTaskHandler }
     * 
     */
    public DtoXaConnectionFactory.RejectedTaskHandler createDtoXaConnectionFactoryRejectedTaskHandler() {
        return new DtoXaConnectionFactory.RejectedTaskHandler();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.SessionTaskRunner }
     * 
     */
    public DtoXaConnectionFactory.SessionTaskRunner createDtoXaConnectionFactorySessionTaskRunner() {
        return new DtoXaConnectionFactory.SessionTaskRunner();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.Transformer }
     * 
     */
    public DtoXaConnectionFactory.Transformer createDtoXaConnectionFactoryTransformer() {
        return new DtoXaConnectionFactory.Transformer();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.TransportListener }
     * 
     */
    public DtoXaConnectionFactory.TransportListener createDtoXaConnectionFactoryTransportListener() {
        return new DtoXaConnectionFactory.TransportListener();
    }

    /**
     * Create an instance of {@link DtoXaConnectionFactory.TrustedPackages }
     * 
     */
    public DtoXaConnectionFactory.TrustedPackages createDtoXaConnectionFactoryTrustedPackages() {
        return new DtoXaConnectionFactory.TrustedPackages();
    }

    /**
     * Create an instance of {@link DtoAbortSlowConsumerStrategy.BrokerService }
     * 
     */
    public DtoAbortSlowConsumerStrategy.BrokerService createDtoAbortSlowConsumerStrategyBrokerService() {
        return new DtoAbortSlowConsumerStrategy.BrokerService();
    }

    /**
     * Create an instance of {@link DtoProxyConnector.Server }
     * 
     */
    public DtoProxyConnector.Server createDtoProxyConnectorServer() {
        return new DtoProxyConnector.Server();
    }

    /**
     * Create an instance of {@link DtoCamelEndpointLoader.CamelContext }
     * 
     */
    public DtoCamelEndpointLoader.CamelContext createDtoCamelEndpointLoaderCamelContext() {
        return new DtoCamelEndpointLoader.CamelContext();
    }

    /**
     * Create an instance of {@link DtoCamelEndpointLoader.Component }
     * 
     */
    public DtoCamelEndpointLoader.Component createDtoCamelEndpointLoaderComponent() {
        return new DtoCamelEndpointLoader.Component();
    }

    /**
     * Create an instance of {@link DtoCamelEndpointLoader.Source }
     * 
     */
    public DtoCamelEndpointLoader.Source createDtoCamelEndpointLoaderSource() {
        return new DtoCamelEndpointLoader.Source();
    }

    /**
     * Create an instance of {@link DtoAuthorizationEntry.AdminACLs }
     * 
     */
    public DtoAuthorizationEntry.AdminACLs createDtoAuthorizationEntryAdminACLs() {
        return new DtoAuthorizationEntry.AdminACLs();
    }

    /**
     * Create an instance of {@link DtoAuthorizationEntry.Destination }
     * 
     */
    public DtoAuthorizationEntry.Destination createDtoAuthorizationEntryDestination() {
        return new DtoAuthorizationEntry.Destination();
    }

    /**
     * Create an instance of {@link DtoAuthorizationEntry.ReadACLs }
     * 
     */
    public DtoAuthorizationEntry.ReadACLs createDtoAuthorizationEntryReadACLs() {
        return new DtoAuthorizationEntry.ReadACLs();
    }

    /**
     * Create an instance of {@link DtoAuthorizationEntry.WriteACLs }
     * 
     */
    public DtoAuthorizationEntry.WriteACLs createDtoAuthorizationEntryWriteACLs() {
        return new DtoAuthorizationEntry.WriteACLs();
    }

    /**
     * Create an instance of {@link DtoIndividualDeadLetterStrategy }
     * 
     */
    public DtoIndividualDeadLetterStrategy createDtoIndividualDeadLetterStrategy() {
        return new DtoIndividualDeadLetterStrategy();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.BrokerService }
     * 
     */
    public DtoJournalPersistenceAdapter.BrokerService createDtoJournalPersistenceAdapterBrokerService() {
        return new DtoJournalPersistenceAdapter.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.Journal }
     * 
     */
    public DtoJournalPersistenceAdapter.Journal createDtoJournalPersistenceAdapterJournal() {
        return new DtoJournalPersistenceAdapter.Journal();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.LongTermPersistence }
     * 
     */
    public DtoJournalPersistenceAdapter.LongTermPersistence createDtoJournalPersistenceAdapterLongTermPersistence() {
        return new DtoJournalPersistenceAdapter.LongTermPersistence();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.PersistenceAdapter }
     * 
     */
    public DtoJournalPersistenceAdapter.PersistenceAdapter createDtoJournalPersistenceAdapterPersistenceAdapter() {
        return new DtoJournalPersistenceAdapter.PersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.TaskRunnerFactory }
     * 
     */
    public DtoJournalPersistenceAdapter.TaskRunnerFactory createDtoJournalPersistenceAdapterTaskRunnerFactory() {
        return new DtoJournalPersistenceAdapter.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapter.UsageManager }
     * 
     */
    public DtoJournalPersistenceAdapter.UsageManager createDtoJournalPersistenceAdapterUsageManager() {
        return new DtoJournalPersistenceAdapter.UsageManager();
    }

    /**
     * Create an instance of {@link DtoPolicyMap.DefaultEntry }
     * 
     */
    public DtoPolicyMap.DefaultEntry createDtoPolicyMapDefaultEntry() {
        return new DtoPolicyMap.DefaultEntry();
    }

    /**
     * Create an instance of {@link DtoPolicyMap.Entries }
     * 
     */
    public DtoPolicyMap.Entries createDtoPolicyMapEntries() {
        return new DtoPolicyMap.Entries();
    }

    /**
     * Create an instance of {@link DtoPolicyMap.PolicyEntries }
     * 
     */
    public DtoPolicyMap.PolicyEntries createDtoPolicyMapPolicyEntries() {
        return new DtoPolicyMap.PolicyEntries();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.Adapter }
     * 
     */
    public DtoJournaledJDBC.Adapter createDtoJournaledJDBCAdapter() {
        return new DtoJournaledJDBC.Adapter();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.BrokerService }
     * 
     */
    public DtoJournaledJDBC.BrokerService createDtoJournaledJDBCBrokerService() {
        return new DtoJournaledJDBC.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.DataSource }
     * 
     */
    public DtoJournaledJDBC.DataSource createDtoJournaledJDBCDataSource() {
        return new DtoJournaledJDBC.DataSource();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.JdbcAdapter }
     * 
     */
    public DtoJournaledJDBC.JdbcAdapter createDtoJournaledJDBCJdbcAdapter() {
        return new DtoJournaledJDBC.JdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.Journal }
     * 
     */
    public DtoJournaledJDBC.Journal createDtoJournaledJDBCJournal() {
        return new DtoJournaledJDBC.Journal();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.Locker }
     * 
     */
    public DtoJournaledJDBC.Locker createDtoJournaledJDBCLocker() {
        return new DtoJournaledJDBC.Locker();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoJournaledJDBC.ScheduledThreadPoolExecutor createDtoJournaledJDBCScheduledThreadPoolExecutor() {
        return new DtoJournaledJDBC.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.Statements }
     * 
     */
    public DtoJournaledJDBC.Statements createDtoJournaledJDBCStatements() {
        return new DtoJournaledJDBC.Statements();
    }

    /**
     * Create an instance of {@link DtoJournaledJDBC.TaskRunnerFactory }
     * 
     */
    public DtoJournaledJDBC.TaskRunnerFactory createDtoJournaledJDBCTaskRunnerFactory() {
        return new DtoJournaledJDBC.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoDestinationDotFilePlugin }
     * 
     */
    public DtoDestinationDotFilePlugin createDtoDestinationDotFilePlugin() {
        return new DtoDestinationDotFilePlugin();
    }

    /**
     * Create an instance of {@link DtoVirtualTopic }
     * 
     */
    public DtoVirtualTopic createDtoVirtualTopic() {
        return new DtoVirtualTopic();
    }

    /**
     * Create an instance of {@link DtoReplicatedLevelDB.BrokerService }
     * 
     */
    public DtoReplicatedLevelDB.BrokerService createDtoReplicatedLevelDBBrokerService() {
        return new DtoReplicatedLevelDB.BrokerService();
    }

    /**
     * Create an instance of {@link DtoReplicatedLevelDB.Locker }
     * 
     */
    public DtoReplicatedLevelDB.Locker createDtoReplicatedLevelDBLocker() {
        return new DtoReplicatedLevelDB.Locker();
    }

    /**
     * Create an instance of {@link DtoReplicatedLevelDB.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoReplicatedLevelDB.ScheduledThreadPoolExecutor createDtoReplicatedLevelDBScheduledThreadPoolExecutor() {
        return new DtoReplicatedLevelDB.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoReplicatedLevelDB.UsageManager }
     * 
     */
    public DtoReplicatedLevelDB.UsageManager createDtoReplicatedLevelDBUsageManager() {
        return new DtoReplicatedLevelDB.UsageManager();
    }

    /**
     * Create an instance of {@link DtoSharedFileLocker.Lockable }
     * 
     */
    public DtoSharedFileLocker.Lockable createDtoSharedFileLockerLockable() {
        return new DtoSharedFileLocker.Lockable();
    }

    /**
     * Create an instance of {@link DtoStoreCursor }
     * 
     */
    public DtoStoreCursor createDtoStoreCursor() {
        return new DtoStoreCursor();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin.Address }
     * 
     */
    public DtoUdpTraceBrokerPlugin.Address createDtoUdpTraceBrokerPluginAddress() {
        return new DtoUdpTraceBrokerPlugin.Address();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin.AdminConnectionContext }
     * 
     */
    public DtoUdpTraceBrokerPlugin.AdminConnectionContext createDtoUdpTraceBrokerPluginAdminConnectionContext() {
        return new DtoUdpTraceBrokerPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin.Next }
     * 
     */
    public DtoUdpTraceBrokerPlugin.Next createDtoUdpTraceBrokerPluginNext() {
        return new DtoUdpTraceBrokerPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin.WireFormat }
     * 
     */
    public DtoUdpTraceBrokerPlugin.WireFormat createDtoUdpTraceBrokerPluginWireFormat() {
        return new DtoUdpTraceBrokerPlugin.WireFormat();
    }

    /**
     * Create an instance of {@link DtoUdpTraceBrokerPlugin.WireFormatFactory }
     * 
     */
    public DtoUdpTraceBrokerPlugin.WireFormatFactory createDtoUdpTraceBrokerPluginWireFormatFactory() {
        return new DtoUdpTraceBrokerPlugin.WireFormatFactory();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.Consumer }
     * 
     */
    public DtoOutboundTopicBridge.Consumer createDtoOutboundTopicBridgeConsumer() {
        return new DtoOutboundTopicBridge.Consumer();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.ConsumerConnection }
     * 
     */
    public DtoOutboundTopicBridge.ConsumerConnection createDtoOutboundTopicBridgeConsumerConnection() {
        return new DtoOutboundTopicBridge.ConsumerConnection();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.ConsumerTopic }
     * 
     */
    public DtoOutboundTopicBridge.ConsumerTopic createDtoOutboundTopicBridgeConsumerTopic() {
        return new DtoOutboundTopicBridge.ConsumerTopic();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.JmsConnector }
     * 
     */
    public DtoOutboundTopicBridge.JmsConnector createDtoOutboundTopicBridgeJmsConnector() {
        return new DtoOutboundTopicBridge.JmsConnector();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.JmsMessageConvertor }
     * 
     */
    public DtoOutboundTopicBridge.JmsMessageConvertor createDtoOutboundTopicBridgeJmsMessageConvertor() {
        return new DtoOutboundTopicBridge.JmsMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.ProducerConnection }
     * 
     */
    public DtoOutboundTopicBridge.ProducerConnection createDtoOutboundTopicBridgeProducerConnection() {
        return new DtoOutboundTopicBridge.ProducerConnection();
    }

    /**
     * Create an instance of {@link DtoOutboundTopicBridge.ProducerTopic }
     * 
     */
    public DtoOutboundTopicBridge.ProducerTopic createDtoOutboundTopicBridgeProducerTopic() {
        return new DtoOutboundTopicBridge.ProducerTopic();
    }

    /**
     * Create an instance of {@link DtoConstantPendingMessageLimitStrategy }
     * 
     */
    public DtoConstantPendingMessageLimitStrategy createDtoConstantPendingMessageLimitStrategy() {
        return new DtoConstantPendingMessageLimitStrategy();
    }

    /**
     * Create an instance of {@link DtoMirroredQueue.BrokerService }
     * 
     */
    public DtoMirroredQueue.BrokerService createDtoMirroredQueueBrokerService() {
        return new DtoMirroredQueue.BrokerService();
    }

    /**
     * Create an instance of {@link DtoCompositeQueue.ForwardTo }
     * 
     */
    public DtoCompositeQueue.ForwardTo createDtoCompositeQueueForwardTo() {
        return new DtoCompositeQueue.ForwardTo();
    }

    /**
     * Create an instance of {@link DtoForcePersistencyModeBroker.AdminConnectionContext }
     * 
     */
    public DtoForcePersistencyModeBroker.AdminConnectionContext createDtoForcePersistencyModeBrokerAdminConnectionContext() {
        return new DtoForcePersistencyModeBroker.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoForcePersistencyModeBroker.Next }
     * 
     */
    public DtoForcePersistencyModeBroker.Next createDtoForcePersistencyModeBrokerNext() {
        return new DtoForcePersistencyModeBroker.Next();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.Consumer }
     * 
     */
    public DtoInboundQueueBridge.Consumer createDtoInboundQueueBridgeConsumer() {
        return new DtoInboundQueueBridge.Consumer();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.ConsumerConnection }
     * 
     */
    public DtoInboundQueueBridge.ConsumerConnection createDtoInboundQueueBridgeConsumerConnection() {
        return new DtoInboundQueueBridge.ConsumerConnection();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.ConsumerQueue }
     * 
     */
    public DtoInboundQueueBridge.ConsumerQueue createDtoInboundQueueBridgeConsumerQueue() {
        return new DtoInboundQueueBridge.ConsumerQueue();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.JmsConnector }
     * 
     */
    public DtoInboundQueueBridge.JmsConnector createDtoInboundQueueBridgeJmsConnector() {
        return new DtoInboundQueueBridge.JmsConnector();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.JmsMessageConvertor }
     * 
     */
    public DtoInboundQueueBridge.JmsMessageConvertor createDtoInboundQueueBridgeJmsMessageConvertor() {
        return new DtoInboundQueueBridge.JmsMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.ProducerConnection }
     * 
     */
    public DtoInboundQueueBridge.ProducerConnection createDtoInboundQueueBridgeProducerConnection() {
        return new DtoInboundQueueBridge.ProducerConnection();
    }

    /**
     * Create an instance of {@link DtoInboundQueueBridge.ProducerQueue }
     * 
     */
    public DtoInboundQueueBridge.ProducerQueue createDtoInboundQueueBridgeProducerQueue() {
        return new DtoInboundQueueBridge.ProducerQueue();
    }

    /**
     * Create an instance of {@link DtoCompositeTopic.ForwardTo }
     * 
     */
    public DtoCompositeTopic.ForwardTo createDtoCompositeTopicForwardTo() {
        return new DtoCompositeTopic.ForwardTo();
    }

    /**
     * Create an instance of {@link DtoFixedCountSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoFixedCountSubscriptionRecoveryPolicy.Broker createDtoFixedCountSubscriptionRecoveryPolicyBroker() {
        return new DtoFixedCountSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoFilteredDestination.Destination }
     * 
     */
    public DtoFilteredDestination.Destination createDtoFilteredDestinationDestination() {
        return new DtoFilteredDestination.Destination();
    }

    /**
     * Create an instance of {@link DtoFilteredDestination.Filter }
     * 
     */
    public DtoFilteredDestination.Filter createDtoFilteredDestinationFilter() {
        return new DtoFilteredDestination.Filter();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicy.Destination }
     * 
     */
    public DtoRedeliveryPolicy.Destination createDtoRedeliveryPolicyDestination() {
        return new DtoRedeliveryPolicy.Destination();
    }

    /**
     * Create an instance of {@link DtoQueryBasedSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoQueryBasedSubscriptionRecoveryPolicy.Broker createDtoQueryBasedSubscriptionRecoveryPolicyBroker() {
        return new DtoQueryBasedSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoQueryBasedSubscriptionRecoveryPolicy.Query }
     * 
     */
    public DtoQueryBasedSubscriptionRecoveryPolicy.Query createDtoQueryBasedSubscriptionRecoveryPolicyQuery() {
        return new DtoQueryBasedSubscriptionRecoveryPolicy.Query();
    }

    /**
     * Create an instance of {@link DtoSimpleMessageGroupMapFactory }
     * 
     */
    public DtoSimpleMessageGroupMapFactory createDtoSimpleMessageGroupMapFactory() {
        return new DtoSimpleMessageGroupMapFactory();
    }

    /**
     * Create an instance of {@link DtoDiscarding.DeadLetterQueue }
     * 
     */
    public DtoDiscarding.DeadLetterQueue createDtoDiscardingDeadLetterQueue() {
        return new DtoDiscarding.DeadLetterQueue();
    }

    /**
     * Create an instance of {@link DtoTempTopic.CompositeDestinations }
     * 
     */
    public DtoTempTopic.CompositeDestinations createDtoTempTopicCompositeDestinations() {
        return new DtoTempTopic.CompositeDestinations();
    }

    /**
     * Create an instance of {@link DtoTempTopic.Connection }
     * 
     */
    public DtoTempTopic.Connection createDtoTempTopicConnection() {
        return new DtoTempTopic.Connection();
    }

    /**
     * Create an instance of {@link DtoTempTopic.Properties }
     * 
     */
    public DtoTempTopic.Properties createDtoTempTopicProperties() {
        return new DtoTempTopic.Properties();
    }

    /**
     * Create an instance of {@link DtoDestinationPathSeparatorPlugin.AdminConnectionContext }
     * 
     */
    public DtoDestinationPathSeparatorPlugin.AdminConnectionContext createDtoDestinationPathSeparatorPluginAdminConnectionContext() {
        return new DtoDestinationPathSeparatorPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoDestinationPathSeparatorPlugin.Next }
     * 
     */
    public DtoDestinationPathSeparatorPlugin.Next createDtoDestinationPathSeparatorPluginNext() {
        return new DtoDestinationPathSeparatorPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoBroker.AdminView }
     * 
     */
    public DtoBroker.AdminView createDtoBrokerAdminView() {
        return new DtoBroker.AdminView();
    }

    /**
     * Create an instance of {@link DtoBroker.BrokerContext }
     * 
     */
    public DtoBroker.BrokerContext createDtoBrokerBrokerContext() {
        return new DtoBroker.BrokerContext();
    }

    /**
     * Create an instance of {@link DtoBroker.ConsumerSystemUsage }
     * 
     */
    public DtoBroker.ConsumerSystemUsage createDtoBrokerConsumerSystemUsage() {
        return new DtoBroker.ConsumerSystemUsage();
    }

    /**
     * Create an instance of {@link DtoBroker.DestinationFactory }
     * 
     */
    public DtoBroker.DestinationFactory createDtoBrokerDestinationFactory() {
        return new DtoBroker.DestinationFactory();
    }

    /**
     * Create an instance of {@link DtoBroker.DestinationInterceptors }
     * 
     */
    public DtoBroker.DestinationInterceptors createDtoBrokerDestinationInterceptors() {
        return new DtoBroker.DestinationInterceptors();
    }

    /**
     * Create an instance of {@link DtoBroker.DestinationPolicy }
     * 
     */
    public DtoBroker.DestinationPolicy createDtoBrokerDestinationPolicy() {
        return new DtoBroker.DestinationPolicy();
    }

    /**
     * Create an instance of {@link DtoBroker.Destinations }
     * 
     */
    public DtoBroker.Destinations createDtoBrokerDestinations() {
        return new DtoBroker.Destinations();
    }

    /**
     * Create an instance of {@link DtoBroker.IoExceptionHandler }
     * 
     */
    public DtoBroker.IoExceptionHandler createDtoBrokerIoExceptionHandler() {
        return new DtoBroker.IoExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoBroker.JmsBridgeConnectors }
     * 
     */
    public DtoBroker.JmsBridgeConnectors createDtoBrokerJmsBridgeConnectors() {
        return new DtoBroker.JmsBridgeConnectors();
    }

    /**
     * Create an instance of {@link DtoBroker.JobSchedulerStore }
     * 
     */
    public DtoBroker.JobSchedulerStore createDtoBrokerJobSchedulerStore() {
        return new DtoBroker.JobSchedulerStore();
    }

    /**
     * Create an instance of {@link DtoBroker.ManagementContext }
     * 
     */
    public DtoBroker.ManagementContext createDtoBrokerManagementContext() {
        return new DtoBroker.ManagementContext();
    }

    /**
     * Create an instance of {@link DtoBroker.MessageAuthorizationPolicy }
     * 
     */
    public DtoBroker.MessageAuthorizationPolicy createDtoBrokerMessageAuthorizationPolicy() {
        return new DtoBroker.MessageAuthorizationPolicy();
    }

    /**
     * Create an instance of {@link DtoBroker.NetworkConnectorURIs }
     * 
     */
    public DtoBroker.NetworkConnectorURIs createDtoBrokerNetworkConnectorURIs() {
        return new DtoBroker.NetworkConnectorURIs();
    }

    /**
     * Create an instance of {@link DtoBroker.NetworkConnectors }
     * 
     */
    public DtoBroker.NetworkConnectors createDtoBrokerNetworkConnectors() {
        return new DtoBroker.NetworkConnectors();
    }

    /**
     * Create an instance of {@link DtoBroker.PersistenceAdapter }
     * 
     */
    public DtoBroker.PersistenceAdapter createDtoBrokerPersistenceAdapter() {
        return new DtoBroker.PersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoBroker.PersistenceFactory }
     * 
     */
    public DtoBroker.PersistenceFactory createDtoBrokerPersistenceFactory() {
        return new DtoBroker.PersistenceFactory();
    }

    /**
     * Create an instance of {@link DtoBroker.PersistenceTaskRunnerFactory }
     * 
     */
    public DtoBroker.PersistenceTaskRunnerFactory createDtoBrokerPersistenceTaskRunnerFactory() {
        return new DtoBroker.PersistenceTaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoBroker.Plugins }
     * 
     */
    public DtoBroker.Plugins createDtoBrokerPlugins() {
        return new DtoBroker.Plugins();
    }

    /**
     * Create an instance of {@link DtoBroker.ProducerSystemUsage }
     * 
     */
    public DtoBroker.ProducerSystemUsage createDtoBrokerProducerSystemUsage() {
        return new DtoBroker.ProducerSystemUsage();
    }

    /**
     * Create an instance of {@link DtoBroker.ProxyConnectors }
     * 
     */
    public DtoBroker.ProxyConnectors createDtoBrokerProxyConnectors() {
        return new DtoBroker.ProxyConnectors();
    }

    /**
     * Create an instance of {@link DtoBroker.RegionBroker }
     * 
     */
    public DtoBroker.RegionBroker createDtoBrokerRegionBroker() {
        return new DtoBroker.RegionBroker();
    }

    /**
     * Create an instance of {@link DtoBroker.Services }
     * 
     */
    public DtoBroker.Services createDtoBrokerServices() {
        return new DtoBroker.Services();
    }

    /**
     * Create an instance of {@link DtoBroker.ShutdownHooks }
     * 
     */
    public DtoBroker.ShutdownHooks createDtoBrokerShutdownHooks() {
        return new DtoBroker.ShutdownHooks();
    }

    /**
     * Create an instance of {@link DtoBroker.SslContext }
     * 
     */
    public DtoBroker.SslContext createDtoBrokerSslContext() {
        return new DtoBroker.SslContext();
    }

    /**
     * Create an instance of {@link DtoBroker.StartException }
     * 
     */
    public DtoBroker.StartException createDtoBrokerStartException() {
        return new DtoBroker.StartException();
    }

    /**
     * Create an instance of {@link DtoBroker.SystemUsage }
     * 
     */
    public DtoBroker.SystemUsage createDtoBrokerSystemUsage() {
        return new DtoBroker.SystemUsage();
    }

    /**
     * Create an instance of {@link DtoBroker.TaskRunnerFactory }
     * 
     */
    public DtoBroker.TaskRunnerFactory createDtoBrokerTaskRunnerFactory() {
        return new DtoBroker.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoBroker.TempDataStore }
     * 
     */
    public DtoBroker.TempDataStore createDtoBrokerTempDataStore() {
        return new DtoBroker.TempDataStore();
    }

    /**
     * Create an instance of {@link DtoBroker.TransportConnectorURIs }
     * 
     */
    public DtoBroker.TransportConnectorURIs createDtoBrokerTransportConnectorURIs() {
        return new DtoBroker.TransportConnectorURIs();
    }

    /**
     * Create an instance of {@link DtoBroker.TransportConnectors }
     * 
     */
    public DtoBroker.TransportConnectors createDtoBrokerTransportConnectors() {
        return new DtoBroker.TransportConnectors();
    }

    /**
     * Create an instance of {@link DtoDestinationEntry.Destination }
     * 
     */
    public DtoDestinationEntry.Destination createDtoDestinationEntryDestination() {
        return new DtoDestinationEntry.Destination();
    }

    /**
     * Create an instance of {@link DtoDestinationEntry.Value }
     * 
     */
    public DtoDestinationEntry.Value createDtoDestinationEntryValue() {
        return new DtoDestinationEntry.Value();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthorizationMap.AdminACLs }
     * 
     */
    public DtoSimpleAuthorizationMap.AdminACLs createDtoSimpleAuthorizationMapAdminACLs() {
        return new DtoSimpleAuthorizationMap.AdminACLs();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthorizationMap.ReadACLs }
     * 
     */
    public DtoSimpleAuthorizationMap.ReadACLs createDtoSimpleAuthorizationMapReadACLs() {
        return new DtoSimpleAuthorizationMap.ReadACLs();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry }
     * 
     */
    public DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry createDtoSimpleAuthorizationMapTempDestinationAuthorizationEntry() {
        return new DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry();
    }

    /**
     * Create an instance of {@link DtoSimpleAuthorizationMap.WriteACLs }
     * 
     */
    public DtoSimpleAuthorizationMap.WriteACLs createDtoSimpleAuthorizationMapWriteACLs() {
        return new DtoSimpleAuthorizationMap.WriteACLs();
    }

    /**
     * Create an instance of {@link DtoAbortSlowAckConsumerStrategy.BrokerService }
     * 
     */
    public DtoAbortSlowAckConsumerStrategy.BrokerService createDtoAbortSlowAckConsumerStrategyBrokerService() {
        return new DtoAbortSlowAckConsumerStrategy.BrokerService();
    }

    /**
     * Create an instance of {@link DtoMessageGroupHashBucketFactory }
     * 
     */
    public DtoMessageGroupHashBucketFactory createDtoMessageGroupHashBucketFactory() {
        return new DtoMessageGroupHashBucketFactory();
    }

    /**
     * Create an instance of {@link DtoMaxdbJdbcAdapter.Statements }
     * 
     */
    public DtoMaxdbJdbcAdapter.Statements createDtoMaxdbJdbcAdapterStatements() {
        return new DtoMaxdbJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoStrictOrderDispatchPolicy }
     * 
     */
    public DtoStrictOrderDispatchPolicy createDtoStrictOrderDispatchPolicy() {
        return new DtoStrictOrderDispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoTimedSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoTimedSubscriptionRecoveryPolicy.Broker createDtoTimedSubscriptionRecoveryPolicyBroker() {
        return new DtoTimedSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.Consumer }
     * 
     */
    public DtoInboundTopicBridge.Consumer createDtoInboundTopicBridgeConsumer() {
        return new DtoInboundTopicBridge.Consumer();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.ConsumerConnection }
     * 
     */
    public DtoInboundTopicBridge.ConsumerConnection createDtoInboundTopicBridgeConsumerConnection() {
        return new DtoInboundTopicBridge.ConsumerConnection();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.ConsumerTopic }
     * 
     */
    public DtoInboundTopicBridge.ConsumerTopic createDtoInboundTopicBridgeConsumerTopic() {
        return new DtoInboundTopicBridge.ConsumerTopic();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.JmsConnector }
     * 
     */
    public DtoInboundTopicBridge.JmsConnector createDtoInboundTopicBridgeJmsConnector() {
        return new DtoInboundTopicBridge.JmsConnector();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.JmsMessageConvertor }
     * 
     */
    public DtoInboundTopicBridge.JmsMessageConvertor createDtoInboundTopicBridgeJmsMessageConvertor() {
        return new DtoInboundTopicBridge.JmsMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.ProducerConnection }
     * 
     */
    public DtoInboundTopicBridge.ProducerConnection createDtoInboundTopicBridgeProducerConnection() {
        return new DtoInboundTopicBridge.ProducerConnection();
    }

    /**
     * Create an instance of {@link DtoInboundTopicBridge.ProducerTopic }
     * 
     */
    public DtoInboundTopicBridge.ProducerTopic createDtoInboundTopicBridgeProducerTopic() {
        return new DtoInboundTopicBridge.ProducerTopic();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.BlobTransferPolicy }
     * 
     */
    public DtoConnectionFactory.BlobTransferPolicy createDtoConnectionFactoryBlobTransferPolicy() {
        return new DtoConnectionFactory.BlobTransferPolicy();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.ClientIdGenerator }
     * 
     */
    public DtoConnectionFactory.ClientIdGenerator createDtoConnectionFactoryClientIdGenerator() {
        return new DtoConnectionFactory.ClientIdGenerator();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.ClientInternalExceptionListener }
     * 
     */
    public DtoConnectionFactory.ClientInternalExceptionListener createDtoConnectionFactoryClientInternalExceptionListener() {
        return new DtoConnectionFactory.ClientInternalExceptionListener();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.ConnectionIdGenerator }
     * 
     */
    public DtoConnectionFactory.ConnectionIdGenerator createDtoConnectionFactoryConnectionIdGenerator() {
        return new DtoConnectionFactory.ConnectionIdGenerator();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.ExceptionListener }
     * 
     */
    public DtoConnectionFactory.ExceptionListener createDtoConnectionFactoryExceptionListener() {
        return new DtoConnectionFactory.ExceptionListener();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.PrefetchPolicy }
     * 
     */
    public DtoConnectionFactory.PrefetchPolicy createDtoConnectionFactoryPrefetchPolicy() {
        return new DtoConnectionFactory.PrefetchPolicy();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.Properties }
     * 
     */
    public DtoConnectionFactory.Properties createDtoConnectionFactoryProperties() {
        return new DtoConnectionFactory.Properties();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.RedeliveryPolicy }
     * 
     */
    public DtoConnectionFactory.RedeliveryPolicy createDtoConnectionFactoryRedeliveryPolicy() {
        return new DtoConnectionFactory.RedeliveryPolicy();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.RedeliveryPolicyMap }
     * 
     */
    public DtoConnectionFactory.RedeliveryPolicyMap createDtoConnectionFactoryRedeliveryPolicyMap() {
        return new DtoConnectionFactory.RedeliveryPolicyMap();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.RejectedTaskHandler }
     * 
     */
    public DtoConnectionFactory.RejectedTaskHandler createDtoConnectionFactoryRejectedTaskHandler() {
        return new DtoConnectionFactory.RejectedTaskHandler();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.SessionTaskRunner }
     * 
     */
    public DtoConnectionFactory.SessionTaskRunner createDtoConnectionFactorySessionTaskRunner() {
        return new DtoConnectionFactory.SessionTaskRunner();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.Transformer }
     * 
     */
    public DtoConnectionFactory.Transformer createDtoConnectionFactoryTransformer() {
        return new DtoConnectionFactory.Transformer();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.TransportListener }
     * 
     */
    public DtoConnectionFactory.TransportListener createDtoConnectionFactoryTransportListener() {
        return new DtoConnectionFactory.TransportListener();
    }

    /**
     * Create an instance of {@link DtoConnectionFactory.TrustedPackages }
     * 
     */
    public DtoConnectionFactory.TrustedPackages createDtoConnectionFactoryTrustedPackages() {
        return new DtoConnectionFactory.TrustedPackages();
    }

    /**
     * Create an instance of {@link DtoDestinationsPlugin.AdminConnectionContext }
     * 
     */
    public DtoDestinationsPlugin.AdminConnectionContext createDtoDestinationsPluginAdminConnectionContext() {
        return new DtoDestinationsPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoDestinationsPlugin.Next }
     * 
     */
    public DtoDestinationsPlugin.Next createDtoDestinationsPluginNext() {
        return new DtoDestinationsPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.BrokerInfo }
     * 
     */
    public DtoTransportConnector.BrokerInfo createDtoTransportConnectorBrokerInfo() {
        return new DtoTransportConnector.BrokerInfo();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.BrokerService }
     * 
     */
    public DtoTransportConnector.BrokerService createDtoTransportConnectorBrokerService() {
        return new DtoTransportConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.DiscoveryAgent }
     * 
     */
    public DtoTransportConnector.DiscoveryAgent createDtoTransportConnectorDiscoveryAgent() {
        return new DtoTransportConnector.DiscoveryAgent();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.MessageAuthorizationPolicy }
     * 
     */
    public DtoTransportConnector.MessageAuthorizationPolicy createDtoTransportConnectorMessageAuthorizationPolicy() {
        return new DtoTransportConnector.MessageAuthorizationPolicy();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.PublishedAddressPolicy }
     * 
     */
    public DtoTransportConnector.PublishedAddressPolicy createDtoTransportConnectorPublishedAddressPolicy() {
        return new DtoTransportConnector.PublishedAddressPolicy();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.Server }
     * 
     */
    public DtoTransportConnector.Server createDtoTransportConnectorServer() {
        return new DtoTransportConnector.Server();
    }

    /**
     * Create an instance of {@link DtoTransportConnector.TaskRunnerFactory }
     * 
     */
    public DtoTransportConnector.TaskRunnerFactory createDtoTransportConnectorTaskRunnerFactory() {
        return new DtoTransportConnector.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoSimpleDispatchPolicy }
     * 
     */
    public DtoSimpleDispatchPolicy createDtoSimpleDispatchPolicy() {
        return new DtoSimpleDispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.BrokerService }
     * 
     */
    public DtoDemandForwardingBridge.BrokerService createDtoDemandForwardingBridgeBrokerService() {
        return new DtoDemandForwardingBridge.BrokerService();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.Configuration }
     * 
     */
    public DtoDemandForwardingBridge.Configuration createDtoDemandForwardingBridgeConfiguration() {
        return new DtoDemandForwardingBridge.Configuration();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.DurableDestinations }
     * 
     */
    public DtoDemandForwardingBridge.DurableDestinations createDtoDemandForwardingBridgeDurableDestinations() {
        return new DtoDemandForwardingBridge.DurableDestinations();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.DynamicallyIncludedDestinations }
     * 
     */
    public DtoDemandForwardingBridge.DynamicallyIncludedDestinations createDtoDemandForwardingBridgeDynamicallyIncludedDestinations() {
        return new DtoDemandForwardingBridge.DynamicallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.ExcludedDestinations }
     * 
     */
    public DtoDemandForwardingBridge.ExcludedDestinations createDtoDemandForwardingBridgeExcludedDestinations() {
        return new DtoDemandForwardingBridge.ExcludedDestinations();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.LocalBroker }
     * 
     */
    public DtoDemandForwardingBridge.LocalBroker createDtoDemandForwardingBridgeLocalBroker() {
        return new DtoDemandForwardingBridge.LocalBroker();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.NetworkBridgeListener }
     * 
     */
    public DtoDemandForwardingBridge.NetworkBridgeListener createDtoDemandForwardingBridgeNetworkBridgeListener() {
        return new DtoDemandForwardingBridge.NetworkBridgeListener();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.RemoteBroker }
     * 
     */
    public DtoDemandForwardingBridge.RemoteBroker createDtoDemandForwardingBridgeRemoteBroker() {
        return new DtoDemandForwardingBridge.RemoteBroker();
    }

    /**
     * Create an instance of {@link DtoDemandForwardingBridge.StaticallyIncludedDestinations }
     * 
     */
    public DtoDemandForwardingBridge.StaticallyIncludedDestinations createDtoDemandForwardingBridgeStaticallyIncludedDestinations() {
        return new DtoDemandForwardingBridge.StaticallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoBrokerService.AdminView }
     * 
     */
    public DtoBrokerService.AdminView createDtoBrokerServiceAdminView() {
        return new DtoBrokerService.AdminView();
    }

    /**
     * Create an instance of {@link DtoBrokerService.BrokerContext }
     * 
     */
    public DtoBrokerService.BrokerContext createDtoBrokerServiceBrokerContext() {
        return new DtoBrokerService.BrokerContext();
    }

    /**
     * Create an instance of {@link DtoBrokerService.ConsumerSystemUsage }
     * 
     */
    public DtoBrokerService.ConsumerSystemUsage createDtoBrokerServiceConsumerSystemUsage() {
        return new DtoBrokerService.ConsumerSystemUsage();
    }

    /**
     * Create an instance of {@link DtoBrokerService.DestinationFactory }
     * 
     */
    public DtoBrokerService.DestinationFactory createDtoBrokerServiceDestinationFactory() {
        return new DtoBrokerService.DestinationFactory();
    }

    /**
     * Create an instance of {@link DtoBrokerService.DestinationInterceptors }
     * 
     */
    public DtoBrokerService.DestinationInterceptors createDtoBrokerServiceDestinationInterceptors() {
        return new DtoBrokerService.DestinationInterceptors();
    }

    /**
     * Create an instance of {@link DtoBrokerService.DestinationPolicy }
     * 
     */
    public DtoBrokerService.DestinationPolicy createDtoBrokerServiceDestinationPolicy() {
        return new DtoBrokerService.DestinationPolicy();
    }

    /**
     * Create an instance of {@link DtoBrokerService.Destinations }
     * 
     */
    public DtoBrokerService.Destinations createDtoBrokerServiceDestinations() {
        return new DtoBrokerService.Destinations();
    }

    /**
     * Create an instance of {@link DtoBrokerService.IoExceptionHandler }
     * 
     */
    public DtoBrokerService.IoExceptionHandler createDtoBrokerServiceIoExceptionHandler() {
        return new DtoBrokerService.IoExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoBrokerService.JmsBridgeConnectors }
     * 
     */
    public DtoBrokerService.JmsBridgeConnectors createDtoBrokerServiceJmsBridgeConnectors() {
        return new DtoBrokerService.JmsBridgeConnectors();
    }

    /**
     * Create an instance of {@link DtoBrokerService.JobSchedulerStore }
     * 
     */
    public DtoBrokerService.JobSchedulerStore createDtoBrokerServiceJobSchedulerStore() {
        return new DtoBrokerService.JobSchedulerStore();
    }

    /**
     * Create an instance of {@link DtoBrokerService.ManagementContext }
     * 
     */
    public DtoBrokerService.ManagementContext createDtoBrokerServiceManagementContext() {
        return new DtoBrokerService.ManagementContext();
    }

    /**
     * Create an instance of {@link DtoBrokerService.MessageAuthorizationPolicy }
     * 
     */
    public DtoBrokerService.MessageAuthorizationPolicy createDtoBrokerServiceMessageAuthorizationPolicy() {
        return new DtoBrokerService.MessageAuthorizationPolicy();
    }

    /**
     * Create an instance of {@link DtoBrokerService.NetworkConnectorURIs }
     * 
     */
    public DtoBrokerService.NetworkConnectorURIs createDtoBrokerServiceNetworkConnectorURIs() {
        return new DtoBrokerService.NetworkConnectorURIs();
    }

    /**
     * Create an instance of {@link DtoBrokerService.NetworkConnectors }
     * 
     */
    public DtoBrokerService.NetworkConnectors createDtoBrokerServiceNetworkConnectors() {
        return new DtoBrokerService.NetworkConnectors();
    }

    /**
     * Create an instance of {@link DtoBrokerService.PersistenceAdapter }
     * 
     */
    public DtoBrokerService.PersistenceAdapter createDtoBrokerServicePersistenceAdapter() {
        return new DtoBrokerService.PersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoBrokerService.PersistenceFactory }
     * 
     */
    public DtoBrokerService.PersistenceFactory createDtoBrokerServicePersistenceFactory() {
        return new DtoBrokerService.PersistenceFactory();
    }

    /**
     * Create an instance of {@link DtoBrokerService.PersistenceTaskRunnerFactory }
     * 
     */
    public DtoBrokerService.PersistenceTaskRunnerFactory createDtoBrokerServicePersistenceTaskRunnerFactory() {
        return new DtoBrokerService.PersistenceTaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoBrokerService.Plugins }
     * 
     */
    public DtoBrokerService.Plugins createDtoBrokerServicePlugins() {
        return new DtoBrokerService.Plugins();
    }

    /**
     * Create an instance of {@link DtoBrokerService.ProducerSystemUsage }
     * 
     */
    public DtoBrokerService.ProducerSystemUsage createDtoBrokerServiceProducerSystemUsage() {
        return new DtoBrokerService.ProducerSystemUsage();
    }

    /**
     * Create an instance of {@link DtoBrokerService.ProxyConnectors }
     * 
     */
    public DtoBrokerService.ProxyConnectors createDtoBrokerServiceProxyConnectors() {
        return new DtoBrokerService.ProxyConnectors();
    }

    /**
     * Create an instance of {@link DtoBrokerService.RegionBroker }
     * 
     */
    public DtoBrokerService.RegionBroker createDtoBrokerServiceRegionBroker() {
        return new DtoBrokerService.RegionBroker();
    }

    /**
     * Create an instance of {@link DtoBrokerService.Services }
     * 
     */
    public DtoBrokerService.Services createDtoBrokerServiceServices() {
        return new DtoBrokerService.Services();
    }

    /**
     * Create an instance of {@link DtoBrokerService.ShutdownHooks }
     * 
     */
    public DtoBrokerService.ShutdownHooks createDtoBrokerServiceShutdownHooks() {
        return new DtoBrokerService.ShutdownHooks();
    }

    /**
     * Create an instance of {@link DtoBrokerService.SslContext }
     * 
     */
    public DtoBrokerService.SslContext createDtoBrokerServiceSslContext() {
        return new DtoBrokerService.SslContext();
    }

    /**
     * Create an instance of {@link DtoBrokerService.StartException }
     * 
     */
    public DtoBrokerService.StartException createDtoBrokerServiceStartException() {
        return new DtoBrokerService.StartException();
    }

    /**
     * Create an instance of {@link DtoBrokerService.SystemUsage }
     * 
     */
    public DtoBrokerService.SystemUsage createDtoBrokerServiceSystemUsage() {
        return new DtoBrokerService.SystemUsage();
    }

    /**
     * Create an instance of {@link DtoBrokerService.TaskRunnerFactory }
     * 
     */
    public DtoBrokerService.TaskRunnerFactory createDtoBrokerServiceTaskRunnerFactory() {
        return new DtoBrokerService.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoBrokerService.TempDataStore }
     * 
     */
    public DtoBrokerService.TempDataStore createDtoBrokerServiceTempDataStore() {
        return new DtoBrokerService.TempDataStore();
    }

    /**
     * Create an instance of {@link DtoBrokerService.TransportConnectorURIs }
     * 
     */
    public DtoBrokerService.TransportConnectorURIs createDtoBrokerServiceTransportConnectorURIs() {
        return new DtoBrokerService.TransportConnectorURIs();
    }

    /**
     * Create an instance of {@link DtoBrokerService.TransportConnectors }
     * 
     */
    public DtoBrokerService.TransportConnectors createDtoBrokerServiceTransportConnectors() {
        return new DtoBrokerService.TransportConnectors();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.BrokerService }
     * 
     */
    public DtoJmsQueueConnector.BrokerService createDtoJmsQueueConnectorBrokerService() {
        return new DtoJmsQueueConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.InboundMessageConvertor }
     * 
     */
    public DtoJmsQueueConnector.InboundMessageConvertor createDtoJmsQueueConnectorInboundMessageConvertor() {
        return new DtoJmsQueueConnector.InboundMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.InboundQueueBridges }
     * 
     */
    public DtoJmsQueueConnector.InboundQueueBridges createDtoJmsQueueConnectorInboundQueueBridges() {
        return new DtoJmsQueueConnector.InboundQueueBridges();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.LocalQueueConnection }
     * 
     */
    public DtoJmsQueueConnector.LocalQueueConnection createDtoJmsQueueConnectorLocalQueueConnection() {
        return new DtoJmsQueueConnector.LocalQueueConnection();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.LocalQueueConnectionFactory }
     * 
     */
    public DtoJmsQueueConnector.LocalQueueConnectionFactory createDtoJmsQueueConnectorLocalQueueConnectionFactory() {
        return new DtoJmsQueueConnector.LocalQueueConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.OutboundMessageConvertor }
     * 
     */
    public DtoJmsQueueConnector.OutboundMessageConvertor createDtoJmsQueueConnectorOutboundMessageConvertor() {
        return new DtoJmsQueueConnector.OutboundMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.OutboundQueueBridges }
     * 
     */
    public DtoJmsQueueConnector.OutboundQueueBridges createDtoJmsQueueConnectorOutboundQueueBridges() {
        return new DtoJmsQueueConnector.OutboundQueueBridges();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.OutboundQueueConnection }
     * 
     */
    public DtoJmsQueueConnector.OutboundQueueConnection createDtoJmsQueueConnectorOutboundQueueConnection() {
        return new DtoJmsQueueConnector.OutboundQueueConnection();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.OutboundQueueConnectionFactory }
     * 
     */
    public DtoJmsQueueConnector.OutboundQueueConnectionFactory createDtoJmsQueueConnectorOutboundQueueConnectionFactory() {
        return new DtoJmsQueueConnector.OutboundQueueConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoJmsQueueConnector.ReconnectionPolicy }
     * 
     */
    public DtoJmsQueueConnector.ReconnectionPolicy createDtoJmsQueueConnectorReconnectionPolicy() {
        return new DtoJmsQueueConnector.ReconnectionPolicy();
    }

    /**
     * Create an instance of {@link DtoQueue.CompositeDestinations }
     * 
     */
    public DtoQueue.CompositeDestinations createDtoQueueCompositeDestinations() {
        return new DtoQueue.CompositeDestinations();
    }

    /**
     * Create an instance of {@link DtoQueue.Properties }
     * 
     */
    public DtoQueue.Properties createDtoQueueProperties() {
        return new DtoQueue.Properties();
    }

    /**
     * Create an instance of {@link DtoTraceBrokerPathPlugin.AdminConnectionContext }
     * 
     */
    public DtoTraceBrokerPathPlugin.AdminConnectionContext createDtoTraceBrokerPathPluginAdminConnectionContext() {
        return new DtoTraceBrokerPathPlugin.AdminConnectionContext();
    }

    /**
     * Create an instance of {@link DtoTraceBrokerPathPlugin.Next }
     * 
     */
    public DtoTraceBrokerPathPlugin.Next createDtoTraceBrokerPathPluginNext() {
        return new DtoTraceBrokerPathPlugin.Next();
    }

    /**
     * Create an instance of {@link DtoReconnectionPolicy }
     * 
     */
    public DtoReconnectionPolicy createDtoReconnectionPolicy() {
        return new DtoReconnectionPolicy();
    }

    /**
     * Create an instance of {@link DtoJaasCertificateAuthenticationPlugin }
     * 
     */
    public DtoJaasCertificateAuthenticationPlugin createDtoJaasCertificateAuthenticationPlugin() {
        return new DtoJaasCertificateAuthenticationPlugin();
    }

    /**
     * Create an instance of {@link DtoCamelRoutesBrokerPlugin }
     * 
     */
    public DtoCamelRoutesBrokerPlugin createDtoCamelRoutesBrokerPlugin() {
        return new DtoCamelRoutesBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicyMap.DefaultEntry }
     * 
     */
    public DtoRedeliveryPolicyMap.DefaultEntry createDtoRedeliveryPolicyMapDefaultEntry() {
        return new DtoRedeliveryPolicyMap.DefaultEntry();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicyMap.Entries }
     * 
     */
    public DtoRedeliveryPolicyMap.Entries createDtoRedeliveryPolicyMapEntries() {
        return new DtoRedeliveryPolicyMap.Entries();
    }

    /**
     * Create an instance of {@link DtoRedeliveryPolicyMap.RedeliveryPolicyEntries }
     * 
     */
    public DtoRedeliveryPolicyMap.RedeliveryPolicyEntries createDtoRedeliveryPolicyMapRedeliveryPolicyEntries() {
        return new DtoRedeliveryPolicyMap.RedeliveryPolicyEntries();
    }

    /**
     * Create an instance of {@link DtoNoSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoNoSubscriptionRecoveryPolicy.Broker createDtoNoSubscriptionRecoveryPolicyBroker() {
        return new DtoNoSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoTransactJdbcAdapter.Statements }
     * 
     */
    public DtoTransactJdbcAdapter.Statements createDtoTransactJdbcAdapterStatements() {
        return new DtoTransactJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoKahaDB.BrokerService }
     * 
     */
    public DtoKahaDB.BrokerService createDtoKahaDBBrokerService() {
        return new DtoKahaDB.BrokerService();
    }

    /**
     * Create an instance of {@link DtoKahaDB.Locker }
     * 
     */
    public DtoKahaDB.Locker createDtoKahaDBLocker() {
        return new DtoKahaDB.Locker();
    }

    /**
     * Create an instance of {@link DtoKahaDB.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoKahaDB.ScheduledThreadPoolExecutor createDtoKahaDBScheduledThreadPoolExecutor() {
        return new DtoKahaDB.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoKahaDB.TransactionIdTransformer }
     * 
     */
    public DtoKahaDB.TransactionIdTransformer createDtoKahaDBTransactionIdTransformer() {
        return new DtoKahaDB.TransactionIdTransformer();
    }

    /**
     * Create an instance of {@link DtoKahaDB.UsageManager }
     * 
     */
    public DtoKahaDB.UsageManager createDtoKahaDBUsageManager() {
        return new DtoKahaDB.UsageManager();
    }

    /**
     * Create an instance of {@link DtoJaasDualAuthenticationPlugin }
     * 
     */
    public DtoJaasDualAuthenticationPlugin createDtoJaasDualAuthenticationPlugin() {
        return new DtoJaasDualAuthenticationPlugin();
    }

    /**
     * Create an instance of {@link DtoManagementContext.MBeanServer }
     * 
     */
    public DtoManagementContext.MBeanServer createDtoManagementContextMBeanServer() {
        return new DtoManagementContext.MBeanServer();
    }

    /**
     * Create an instance of {@link DtoManagementContext.Environment }
     * 
     */
    public DtoManagementContext.Environment createDtoManagementContextEnvironment() {
        return new DtoManagementContext.Environment();
    }

    /**
     * Create an instance of {@link DtoManagementContext.Server }
     * 
     */
    public DtoManagementContext.Server createDtoManagementContextServer() {
        return new DtoManagementContext.Server();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.BridgeFactory }
     * 
     */
    public DtoNetworkConnector.BridgeFactory createDtoNetworkConnectorBridgeFactory() {
        return new DtoNetworkConnector.BridgeFactory();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.BrokerService }
     * 
     */
    public DtoNetworkConnector.BrokerService createDtoNetworkConnectorBrokerService() {
        return new DtoNetworkConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.ConnectionFilter }
     * 
     */
    public DtoNetworkConnector.ConnectionFilter createDtoNetworkConnectorConnectionFilter() {
        return new DtoNetworkConnector.ConnectionFilter();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.DiscoveryAgent }
     * 
     */
    public DtoNetworkConnector.DiscoveryAgent createDtoNetworkConnectorDiscoveryAgent() {
        return new DtoNetworkConnector.DiscoveryAgent();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.DurableDestinations }
     * 
     */
    public DtoNetworkConnector.DurableDestinations createDtoNetworkConnectorDurableDestinations() {
        return new DtoNetworkConnector.DurableDestinations();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.DynamicallyIncludedDestinations }
     * 
     */
    public DtoNetworkConnector.DynamicallyIncludedDestinations createDtoNetworkConnectorDynamicallyIncludedDestinations() {
        return new DtoNetworkConnector.DynamicallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.ExcludedDestinations }
     * 
     */
    public DtoNetworkConnector.ExcludedDestinations createDtoNetworkConnectorExcludedDestinations() {
        return new DtoNetworkConnector.ExcludedDestinations();
    }

    /**
     * Create an instance of {@link DtoNetworkConnector.StaticallyIncludedDestinations }
     * 
     */
    public DtoNetworkConnector.StaticallyIncludedDestinations createDtoNetworkConnectorStaticallyIncludedDestinations() {
        return new DtoNetworkConnector.StaticallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoDiscardingDLQBrokerPlugin }
     * 
     */
    public DtoDiscardingDLQBrokerPlugin createDtoDiscardingDLQBrokerPlugin() {
        return new DtoDiscardingDLQBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoVirtualSelectorCacheBrokerPlugin }
     * 
     */
    public DtoVirtualSelectorCacheBrokerPlugin createDtoVirtualSelectorCacheBrokerPlugin() {
        return new DtoVirtualSelectorCacheBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoDefaultNetworkBridgeFilterFactory }
     * 
     */
    public DtoDefaultNetworkBridgeFilterFactory createDtoDefaultNetworkBridgeFilterFactory() {
        return new DtoDefaultNetworkBridgeFilterFactory();
    }

    /**
     * Create an instance of {@link DtoLDAPAuthorizationMap.Context }
     * 
     */
    public DtoLDAPAuthorizationMap.Context createDtoLDAPAuthorizationMapContext() {
        return new DtoLDAPAuthorizationMap.Context();
    }

    /**
     * Create an instance of {@link DtoLDAPAuthorizationMap.Options }
     * 
     */
    public DtoLDAPAuthorizationMap.Options createDtoLDAPAuthorizationMapOptions() {
        return new DtoLDAPAuthorizationMap.Options();
    }

    /**
     * Create an instance of {@link DtoLDAPAuthorizationMap.QueueSearchMatchingFormat }
     * 
     */
    public DtoLDAPAuthorizationMap.QueueSearchMatchingFormat createDtoLDAPAuthorizationMapQueueSearchMatchingFormat() {
        return new DtoLDAPAuthorizationMap.QueueSearchMatchingFormat();
    }

    /**
     * Create an instance of {@link DtoLDAPAuthorizationMap.TopicSearchMatchingFormat }
     * 
     */
    public DtoLDAPAuthorizationMap.TopicSearchMatchingFormat createDtoLDAPAuthorizationMapTopicSearchMatchingFormat() {
        return new DtoLDAPAuthorizationMap.TopicSearchMatchingFormat();
    }

    /**
     * Create an instance of {@link DtoLeaseDatabaseLocker.DataSource }
     * 
     */
    public DtoLeaseDatabaseLocker.DataSource createDtoLeaseDatabaseLockerDataSource() {
        return new DtoLeaseDatabaseLocker.DataSource();
    }

    /**
     * Create an instance of {@link DtoLeaseDatabaseLocker.Lockable }
     * 
     */
    public DtoLeaseDatabaseLocker.Lockable createDtoLeaseDatabaseLockerLockable() {
        return new DtoLeaseDatabaseLocker.Lockable();
    }

    /**
     * Create an instance of {@link DtoLeaseDatabaseLocker.Statements }
     * 
     */
    public DtoLeaseDatabaseLocker.Statements createDtoLeaseDatabaseLockerStatements() {
        return new DtoLeaseDatabaseLocker.Statements();
    }

    /**
     * Create an instance of {@link DtoVmDurableCursor }
     * 
     */
    public DtoVmDurableCursor createDtoVmDurableCursor() {
        return new DtoVmDurableCursor();
    }

    /**
     * Create an instance of {@link DtoSslContext.SSLContext }
     * 
     */
    public DtoSslContext.SSLContext createDtoSslContextSSLContext() {
        return new DtoSslContext.SSLContext();
    }

    /**
     * Create an instance of {@link DtoSslContext.KeyManagers }
     * 
     */
    public DtoSslContext.KeyManagers createDtoSslContextKeyManagers() {
        return new DtoSslContext.KeyManagers();
    }

    /**
     * Create an instance of {@link DtoSslContext.SecureRandom }
     * 
     */
    public DtoSslContext.SecureRandom createDtoSslContextSecureRandom() {
        return new DtoSslContext.SecureRandom();
    }

    /**
     * Create an instance of {@link DtoSslContext.TrustManagers }
     * 
     */
    public DtoSslContext.TrustManagers createDtoSslContextTrustManagers() {
        return new DtoSslContext.TrustManagers();
    }

    /**
     * Create an instance of {@link DtoPooledConnectionFactory.ConnectionFactory }
     * 
     */
    public DtoPooledConnectionFactory.ConnectionFactory createDtoPooledConnectionFactoryConnectionFactory() {
        return new DtoPooledConnectionFactory.ConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoPooledConnectionFactory.TransactionManager }
     * 
     */
    public DtoPooledConnectionFactory.TransactionManager createDtoPooledConnectionFactoryTransactionManager() {
        return new DtoPooledConnectionFactory.TransactionManager();
    }

    /**
     * Create an instance of {@link DtoPrefetchRatePendingMessageLimitStrategy }
     * 
     */
    public DtoPrefetchRatePendingMessageLimitStrategy createDtoPrefetchRatePendingMessageLimitStrategy() {
        return new DtoPrefetchRatePendingMessageLimitStrategy();
    }

    /**
     * Create an instance of {@link DtoQueueDispatchSelector.Destination }
     * 
     */
    public DtoQueueDispatchSelector.Destination createDtoQueueDispatchSelectorDestination() {
        return new DtoQueueDispatchSelector.Destination();
    }

    /**
     * Create an instance of {@link DtoQueueDispatchSelector.ExclusiveConsumer }
     * 
     */
    public DtoQueueDispatchSelector.ExclusiveConsumer createDtoQueueDispatchSelectorExclusiveConsumer() {
        return new DtoQueueDispatchSelector.ExclusiveConsumer();
    }

    /**
     * Create an instance of {@link DtoStoreDurableSubscriberCursor }
     * 
     */
    public DtoStoreDurableSubscriberCursor createDtoStoreDurableSubscriberCursor() {
        return new DtoStoreDurableSubscriberCursor();
    }

    /**
     * Create an instance of {@link DtoDb2JDBCAdapter.Statements }
     * 
     */
    public DtoDb2JDBCAdapter.Statements createDtoDb2JDBCAdapterStatements() {
        return new DtoDb2JDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoForwardingBridge.LocalBroker }
     * 
     */
    public DtoForwardingBridge.LocalBroker createDtoForwardingBridgeLocalBroker() {
        return new DtoForwardingBridge.LocalBroker();
    }

    /**
     * Create an instance of {@link DtoForwardingBridge.NetworkBridgeFailedListener }
     * 
     */
    public DtoForwardingBridge.NetworkBridgeFailedListener createDtoForwardingBridgeNetworkBridgeFailedListener() {
        return new DtoForwardingBridge.NetworkBridgeFailedListener();
    }

    /**
     * Create an instance of {@link DtoForwardingBridge.RemoteBroker }
     * 
     */
    public DtoForwardingBridge.RemoteBroker createDtoForwardingBridgeRemoteBroker() {
        return new DtoForwardingBridge.RemoteBroker();
    }

    /**
     * Create an instance of {@link DtoTempDestinationAuthorizationEntry.AdminACLs }
     * 
     */
    public DtoTempDestinationAuthorizationEntry.AdminACLs createDtoTempDestinationAuthorizationEntryAdminACLs() {
        return new DtoTempDestinationAuthorizationEntry.AdminACLs();
    }

    /**
     * Create an instance of {@link DtoTempDestinationAuthorizationEntry.Destination }
     * 
     */
    public DtoTempDestinationAuthorizationEntry.Destination createDtoTempDestinationAuthorizationEntryDestination() {
        return new DtoTempDestinationAuthorizationEntry.Destination();
    }

    /**
     * Create an instance of {@link DtoTempDestinationAuthorizationEntry.ReadACLs }
     * 
     */
    public DtoTempDestinationAuthorizationEntry.ReadACLs createDtoTempDestinationAuthorizationEntryReadACLs() {
        return new DtoTempDestinationAuthorizationEntry.ReadACLs();
    }

    /**
     * Create an instance of {@link DtoTempDestinationAuthorizationEntry.WriteACLs }
     * 
     */
    public DtoTempDestinationAuthorizationEntry.WriteACLs createDtoTempDestinationAuthorizationEntryWriteACLs() {
        return new DtoTempDestinationAuthorizationEntry.WriteACLs();
    }

    /**
     * Create an instance of {@link DtoTopic.CompositeDestinations }
     * 
     */
    public DtoTopic.CompositeDestinations createDtoTopicCompositeDestinations() {
        return new DtoTopic.CompositeDestinations();
    }

    /**
     * Create an instance of {@link DtoTopic.Properties }
     * 
     */
    public DtoTopic.Properties createDtoTopicProperties() {
        return new DtoTopic.Properties();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.Consumer }
     * 
     */
    public DtoOutboundQueueBridge.Consumer createDtoOutboundQueueBridgeConsumer() {
        return new DtoOutboundQueueBridge.Consumer();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.ConsumerConnection }
     * 
     */
    public DtoOutboundQueueBridge.ConsumerConnection createDtoOutboundQueueBridgeConsumerConnection() {
        return new DtoOutboundQueueBridge.ConsumerConnection();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.ConsumerQueue }
     * 
     */
    public DtoOutboundQueueBridge.ConsumerQueue createDtoOutboundQueueBridgeConsumerQueue() {
        return new DtoOutboundQueueBridge.ConsumerQueue();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.JmsConnector }
     * 
     */
    public DtoOutboundQueueBridge.JmsConnector createDtoOutboundQueueBridgeJmsConnector() {
        return new DtoOutboundQueueBridge.JmsConnector();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.JmsMessageConvertor }
     * 
     */
    public DtoOutboundQueueBridge.JmsMessageConvertor createDtoOutboundQueueBridgeJmsMessageConvertor() {
        return new DtoOutboundQueueBridge.JmsMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.ProducerConnection }
     * 
     */
    public DtoOutboundQueueBridge.ProducerConnection createDtoOutboundQueueBridgeProducerConnection() {
        return new DtoOutboundQueueBridge.ProducerConnection();
    }

    /**
     * Create an instance of {@link DtoOutboundQueueBridge.ProducerQueue }
     * 
     */
    public DtoOutboundQueueBridge.ProducerQueue createDtoOutboundQueueBridgeProducerQueue() {
        return new DtoOutboundQueueBridge.ProducerQueue();
    }

    /**
     * Create an instance of {@link DtoConditionalNetworkBridgeFilterFactory }
     * 
     */
    public DtoConditionalNetworkBridgeFilterFactory createDtoConditionalNetworkBridgeFilterFactory() {
        return new DtoConditionalNetworkBridgeFilterFactory();
    }

    /**
     * Create an instance of {@link DtoLastImageSubscriptionRecoveryPolicy.Broker }
     * 
     */
    public DtoLastImageSubscriptionRecoveryPolicy.Broker createDtoLastImageSubscriptionRecoveryPolicyBroker() {
        return new DtoLastImageSubscriptionRecoveryPolicy.Broker();
    }

    /**
     * Create an instance of {@link DtoUniquePropertyMessageEvictionStrategy }
     * 
     */
    public DtoUniquePropertyMessageEvictionStrategy createDtoUniquePropertyMessageEvictionStrategy() {
        return new DtoUniquePropertyMessageEvictionStrategy();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.Bridge }
     * 
     */
    public DtoMulticastNetworkConnector.Bridge createDtoMulticastNetworkConnectorBridge() {
        return new DtoMulticastNetworkConnector.Bridge();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.BridgeFactory }
     * 
     */
    public DtoMulticastNetworkConnector.BridgeFactory createDtoMulticastNetworkConnectorBridgeFactory() {
        return new DtoMulticastNetworkConnector.BridgeFactory();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.BrokerService }
     * 
     */
    public DtoMulticastNetworkConnector.BrokerService createDtoMulticastNetworkConnectorBrokerService() {
        return new DtoMulticastNetworkConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.ConnectionFilter }
     * 
     */
    public DtoMulticastNetworkConnector.ConnectionFilter createDtoMulticastNetworkConnectorConnectionFilter() {
        return new DtoMulticastNetworkConnector.ConnectionFilter();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.DurableDestinations }
     * 
     */
    public DtoMulticastNetworkConnector.DurableDestinations createDtoMulticastNetworkConnectorDurableDestinations() {
        return new DtoMulticastNetworkConnector.DurableDestinations();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.DynamicallyIncludedDestinations }
     * 
     */
    public DtoMulticastNetworkConnector.DynamicallyIncludedDestinations createDtoMulticastNetworkConnectorDynamicallyIncludedDestinations() {
        return new DtoMulticastNetworkConnector.DynamicallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.ExcludedDestinations }
     * 
     */
    public DtoMulticastNetworkConnector.ExcludedDestinations createDtoMulticastNetworkConnectorExcludedDestinations() {
        return new DtoMulticastNetworkConnector.ExcludedDestinations();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.LocalTransport }
     * 
     */
    public DtoMulticastNetworkConnector.LocalTransport createDtoMulticastNetworkConnectorLocalTransport() {
        return new DtoMulticastNetworkConnector.LocalTransport();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.RemoteTransport }
     * 
     */
    public DtoMulticastNetworkConnector.RemoteTransport createDtoMulticastNetworkConnectorRemoteTransport() {
        return new DtoMulticastNetworkConnector.RemoteTransport();
    }

    /**
     * Create an instance of {@link DtoMulticastNetworkConnector.StaticallyIncludedDestinations }
     * 
     */
    public DtoMulticastNetworkConnector.StaticallyIncludedDestinations createDtoMulticastNetworkConnectorStaticallyIncludedDestinations() {
        return new DtoMulticastNetworkConnector.StaticallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoSimpleDispatchSelector.Destination }
     * 
     */
    public DtoSimpleDispatchSelector.Destination createDtoSimpleDispatchSelectorDestination() {
        return new DtoSimpleDispatchSelector.Destination();
    }

    /**
     * Create an instance of {@link DtoCachedLDAPAuthorizationMap }
     * 
     */
    public DtoCachedLDAPAuthorizationMap createDtoCachedLDAPAuthorizationMap() {
        return new DtoCachedLDAPAuthorizationMap();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.DeadLetterStrategy }
     * 
     */
    public DtoPolicyEntry.DeadLetterStrategy createDtoPolicyEntryDeadLetterStrategy() {
        return new DtoPolicyEntry.DeadLetterStrategy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.Destination }
     * 
     */
    public DtoPolicyEntry.Destination createDtoPolicyEntryDestination() {
        return new DtoPolicyEntry.Destination();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.DispatchPolicy }
     * 
     */
    public DtoPolicyEntry.DispatchPolicy createDtoPolicyEntryDispatchPolicy() {
        return new DtoPolicyEntry.DispatchPolicy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.MessageEvictionStrategy }
     * 
     */
    public DtoPolicyEntry.MessageEvictionStrategy createDtoPolicyEntryMessageEvictionStrategy() {
        return new DtoPolicyEntry.MessageEvictionStrategy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.MessageGroupMapFactory }
     * 
     */
    public DtoPolicyEntry.MessageGroupMapFactory createDtoPolicyEntryMessageGroupMapFactory() {
        return new DtoPolicyEntry.MessageGroupMapFactory();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.NetworkBridgeFilterFactory }
     * 
     */
    public DtoPolicyEntry.NetworkBridgeFilterFactory createDtoPolicyEntryNetworkBridgeFilterFactory() {
        return new DtoPolicyEntry.NetworkBridgeFilterFactory();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.PendingDurableSubscriberPolicy }
     * 
     */
    public DtoPolicyEntry.PendingDurableSubscriberPolicy createDtoPolicyEntryPendingDurableSubscriberPolicy() {
        return new DtoPolicyEntry.PendingDurableSubscriberPolicy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.PendingMessageLimitStrategy }
     * 
     */
    public DtoPolicyEntry.PendingMessageLimitStrategy createDtoPolicyEntryPendingMessageLimitStrategy() {
        return new DtoPolicyEntry.PendingMessageLimitStrategy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.PendingQueuePolicy }
     * 
     */
    public DtoPolicyEntry.PendingQueuePolicy createDtoPolicyEntryPendingQueuePolicy() {
        return new DtoPolicyEntry.PendingQueuePolicy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.PendingSubscriberPolicy }
     * 
     */
    public DtoPolicyEntry.PendingSubscriberPolicy createDtoPolicyEntryPendingSubscriberPolicy() {
        return new DtoPolicyEntry.PendingSubscriberPolicy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.SlowConsumerStrategy }
     * 
     */
    public DtoPolicyEntry.SlowConsumerStrategy createDtoPolicyEntrySlowConsumerStrategy() {
        return new DtoPolicyEntry.SlowConsumerStrategy();
    }

    /**
     * Create an instance of {@link DtoPolicyEntry.SubscriptionRecoveryPolicy }
     * 
     */
    public DtoPolicyEntry.SubscriptionRecoveryPolicy createDtoPolicyEntrySubscriptionRecoveryPolicy() {
        return new DtoPolicyEntry.SubscriptionRecoveryPolicy();
    }

    /**
     * Create an instance of {@link DtoImageBasedJDBCAdaptor.Statements }
     * 
     */
    public DtoImageBasedJDBCAdaptor.Statements createDtoImageBasedJDBCAdaptorStatements() {
        return new DtoImageBasedJDBCAdaptor.Statements();
    }

    /**
     * Create an instance of {@link DtoFileDurableSubscriberCursor }
     * 
     */
    public DtoFileDurableSubscriberCursor createDtoFileDurableSubscriberCursor() {
        return new DtoFileDurableSubscriberCursor();
    }

    /**
     * Create an instance of {@link DtoDefaultJDBCAdapter.Statements }
     * 
     */
    public DtoDefaultJDBCAdapter.Statements createDtoDefaultJDBCAdapterStatements() {
        return new DtoDefaultJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoAuthenticationUser }
     * 
     */
    public DtoAuthenticationUser createDtoAuthenticationUser() {
        return new DtoAuthenticationUser();
    }

    /**
     * Create an instance of {@link DtoUsageCapacity }
     * 
     */
    public DtoUsageCapacity createDtoUsageCapacity() {
        return new DtoUsageCapacity();
    }

    /**
     * Create an instance of {@link DtoStatements.CreateLockSchemaStatements }
     * 
     */
    public DtoStatements.CreateLockSchemaStatements createDtoStatementsCreateLockSchemaStatements() {
        return new DtoStatements.CreateLockSchemaStatements();
    }

    /**
     * Create an instance of {@link DtoStatements.CreateSchemaStatements }
     * 
     */
    public DtoStatements.CreateSchemaStatements createDtoStatementsCreateSchemaStatements() {
        return new DtoStatements.CreateSchemaStatements();
    }

    /**
     * Create an instance of {@link DtoStatements.DropSchemaStatements }
     * 
     */
    public DtoStatements.DropSchemaStatements createDtoStatementsDropSchemaStatements() {
        return new DtoStatements.DropSchemaStatements();
    }

    /**
     * Create an instance of {@link DtoStatisticsBrokerPlugin }
     * 
     */
    public DtoStatisticsBrokerPlugin createDtoStatisticsBrokerPlugin() {
        return new DtoStatisticsBrokerPlugin();
    }

    /**
     * Create an instance of {@link DtoFileQueueCursor }
     * 
     */
    public DtoFileQueueCursor createDtoFileQueueCursor() {
        return new DtoFileQueueCursor();
    }

    /**
     * Create an instance of {@link DtoSharedDeadLetterStrategy.DeadLetterQueue }
     * 
     */
    public DtoSharedDeadLetterStrategy.DeadLetterQueue createDtoSharedDeadLetterStrategyDeadLetterQueue() {
        return new DtoSharedDeadLetterStrategy.DeadLetterQueue();
    }

    /**
     * Create an instance of {@link DtoTempUsage.Executor }
     * 
     */
    public DtoTempUsage.Executor createDtoTempUsageExecutor() {
        return new DtoTempUsage.Executor();
    }

    /**
     * Create an instance of {@link DtoTempUsage.Limiter }
     * 
     */
    public DtoTempUsage.Limiter createDtoTempUsageLimiter() {
        return new DtoTempUsage.Limiter();
    }

    /**
     * Create an instance of {@link DtoTempUsage.Parent }
     * 
     */
    public DtoTempUsage.Parent createDtoTempUsageParent() {
        return new DtoTempUsage.Parent();
    }

    /**
     * Create an instance of {@link DtoTempUsage.Store }
     * 
     */
    public DtoTempUsage.Store createDtoTempUsageStore() {
        return new DtoTempUsage.Store();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.BrokerService }
     * 
     */
    public DtoMKahaDB.BrokerService createDtoMKahaDBBrokerService() {
        return new DtoMKahaDB.BrokerService();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.FilteredPersistenceAdapters }
     * 
     */
    public DtoMKahaDB.FilteredPersistenceAdapters createDtoMKahaDBFilteredPersistenceAdapters() {
        return new DtoMKahaDB.FilteredPersistenceAdapters();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.Locker }
     * 
     */
    public DtoMKahaDB.Locker createDtoMKahaDBLocker() {
        return new DtoMKahaDB.Locker();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoMKahaDB.ScheduledThreadPoolExecutor createDtoMKahaDBScheduledThreadPoolExecutor() {
        return new DtoMKahaDB.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.TransactionStore }
     * 
     */
    public DtoMKahaDB.TransactionStore createDtoMKahaDBTransactionStore() {
        return new DtoMKahaDB.TransactionStore();
    }

    /**
     * Create an instance of {@link DtoMKahaDB.UsageManager }
     * 
     */
    public DtoMKahaDB.UsageManager createDtoMKahaDBUsageManager() {
        return new DtoMKahaDB.UsageManager();
    }

    /**
     * Create an instance of {@link DtoFileCursor }
     * 
     */
    public DtoFileCursor createDtoFileCursor() {
        return new DtoFileCursor();
    }

    /**
     * Create an instance of {@link DtoAxionJDBCAdapter.Statements }
     * 
     */
    public DtoAxionJDBCAdapter.Statements createDtoAxionJDBCAdapterStatements() {
        return new DtoAxionJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoTaskRunnerFactory.Executor }
     * 
     */
    public DtoTaskRunnerFactory.Executor createDtoTaskRunnerFactoryExecutor() {
        return new DtoTaskRunnerFactory.Executor();
    }

    /**
     * Create an instance of {@link DtoTaskRunnerFactory.RejectedTaskHandler }
     * 
     */
    public DtoTaskRunnerFactory.RejectedTaskHandler createDtoTaskRunnerFactoryRejectedTaskHandler() {
        return new DtoTaskRunnerFactory.RejectedTaskHandler();
    }

    /**
     * Create an instance of {@link DtoTaskRunnerFactory.ThreadClassLoader }
     * 
     */
    public DtoTaskRunnerFactory.ThreadClassLoader createDtoTaskRunnerFactoryThreadClassLoader() {
        return new DtoTaskRunnerFactory.ThreadClassLoader();
    }

    /**
     * Create an instance of {@link DtoConnectionDotFilePlugin }
     * 
     */
    public DtoConnectionDotFilePlugin createDtoConnectionDotFilePlugin() {
        return new DtoConnectionDotFilePlugin();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.BridgeFactory }
     * 
     */
    public DtoLdapNetworkConnector.BridgeFactory createDtoLdapNetworkConnectorBridgeFactory() {
        return new DtoLdapNetworkConnector.BridgeFactory();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.BrokerService }
     * 
     */
    public DtoLdapNetworkConnector.BrokerService createDtoLdapNetworkConnectorBrokerService() {
        return new DtoLdapNetworkConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.ConnectionFilter }
     * 
     */
    public DtoLdapNetworkConnector.ConnectionFilter createDtoLdapNetworkConnectorConnectionFilter() {
        return new DtoLdapNetworkConnector.ConnectionFilter();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.DurableDestinations }
     * 
     */
    public DtoLdapNetworkConnector.DurableDestinations createDtoLdapNetworkConnectorDurableDestinations() {
        return new DtoLdapNetworkConnector.DurableDestinations();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.DynamicallyIncludedDestinations }
     * 
     */
    public DtoLdapNetworkConnector.DynamicallyIncludedDestinations createDtoLdapNetworkConnectorDynamicallyIncludedDestinations() {
        return new DtoLdapNetworkConnector.DynamicallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.ExcludedDestinations }
     * 
     */
    public DtoLdapNetworkConnector.ExcludedDestinations createDtoLdapNetworkConnectorExcludedDestinations() {
        return new DtoLdapNetworkConnector.ExcludedDestinations();
    }

    /**
     * Create an instance of {@link DtoLdapNetworkConnector.StaticallyIncludedDestinations }
     * 
     */
    public DtoLdapNetworkConnector.StaticallyIncludedDestinations createDtoLdapNetworkConnectorStaticallyIncludedDestinations() {
        return new DtoLdapNetworkConnector.StaticallyIncludedDestinations();
    }

    /**
     * Create an instance of {@link DtoMemoryPersistenceAdapter.UsageManager }
     * 
     */
    public DtoMemoryPersistenceAdapter.UsageManager createDtoMemoryPersistenceAdapterUsageManager() {
        return new DtoMemoryPersistenceAdapter.UsageManager();
    }

    /**
     * Create an instance of {@link DtoOldestMessageEvictionStrategy }
     * 
     */
    public DtoOldestMessageEvictionStrategy createDtoOldestMessageEvictionStrategy() {
        return new DtoOldestMessageEvictionStrategy();
    }

    /**
     * Create an instance of {@link DtoDatabaseLocker.DataSource }
     * 
     */
    public DtoDatabaseLocker.DataSource createDtoDatabaseLockerDataSource() {
        return new DtoDatabaseLocker.DataSource();
    }

    /**
     * Create an instance of {@link DtoDatabaseLocker.ExceptionHandler }
     * 
     */
    public DtoDatabaseLocker.ExceptionHandler createDtoDatabaseLockerExceptionHandler() {
        return new DtoDatabaseLocker.ExceptionHandler();
    }

    /**
     * Create an instance of {@link DtoDatabaseLocker.Lockable }
     * 
     */
    public DtoDatabaseLocker.Lockable createDtoDatabaseLockerLockable() {
        return new DtoDatabaseLocker.Lockable();
    }

    /**
     * Create an instance of {@link DtoDatabaseLocker.Statements }
     * 
     */
    public DtoDatabaseLocker.Statements createDtoDatabaseLockerStatements() {
        return new DtoDatabaseLocker.Statements();
    }

    /**
     * Create an instance of {@link DtoVirtualDestinationInterceptor.VirtualDestinations }
     * 
     */
    public DtoVirtualDestinationInterceptor.VirtualDestinations createDtoVirtualDestinationInterceptorVirtualDestinations() {
        return new DtoVirtualDestinationInterceptor.VirtualDestinations();
    }

    /**
     * Create an instance of {@link DtoPostgresqlJdbcAdapter.Statements }
     * 
     */
    public DtoPostgresqlJdbcAdapter.Statements createDtoPostgresqlJdbcAdapterStatements() {
        return new DtoPostgresqlJdbcAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoOldestMessageWithLowestPriorityEvictionStrategy }
     * 
     */
    public DtoOldestMessageWithLowestPriorityEvictionStrategy createDtoOldestMessageWithLowestPriorityEvictionStrategy() {
        return new DtoOldestMessageWithLowestPriorityEvictionStrategy();
    }

    /**
     * Create an instance of {@link DtoOracleBlobJDBCAdapter.Statements }
     * 
     */
    public DtoOracleBlobJDBCAdapter.Statements createDtoOracleBlobJDBCAdapterStatements() {
        return new DtoOracleBlobJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoPartitionBrokerPlugin.Config }
     * 
     */
    public DtoPartitionBrokerPlugin.Config createDtoPartitionBrokerPluginConfig() {
        return new DtoPartitionBrokerPlugin.Config();
    }

    /**
     * Create an instance of {@link DtoStreamJDBCAdapter.Statements }
     * 
     */
    public DtoStreamJDBCAdapter.Statements createDtoStreamJDBCAdapterStatements() {
        return new DtoStreamJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoBytesJDBCAdapter.Statements }
     * 
     */
    public DtoBytesJDBCAdapter.Statements createDtoBytesJDBCAdapterStatements() {
        return new DtoBytesJDBCAdapter.Statements();
    }

    /**
     * Create an instance of {@link DtoRuntimeConfigurationPlugin }
     * 
     */
    public DtoRuntimeConfigurationPlugin createDtoRuntimeConfigurationPlugin() {
        return new DtoRuntimeConfigurationPlugin();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB.Adapter }
     * 
     */
    public DtoFilteredKahaDB.Adapter createDtoFilteredKahaDBAdapter() {
        return new DtoFilteredKahaDB.Adapter();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB.Destination }
     * 
     */
    public DtoFilteredKahaDB.Destination createDtoFilteredKahaDBDestination() {
        return new DtoFilteredKahaDB.Destination();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB.PersistenceAdapter }
     * 
     */
    public DtoFilteredKahaDB.PersistenceAdapter createDtoFilteredKahaDBPersistenceAdapter() {
        return new DtoFilteredKahaDB.PersistenceAdapter();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB.Template }
     * 
     */
    public DtoFilteredKahaDB.Template createDtoFilteredKahaDBTemplate() {
        return new DtoFilteredKahaDB.Template();
    }

    /**
     * Create an instance of {@link DtoFilteredKahaDB.Usage }
     * 
     */
    public DtoFilteredKahaDB.Usage createDtoFilteredKahaDBUsage() {
        return new DtoFilteredKahaDB.Usage();
    }

    /**
     * Create an instance of {@link DtoJaasAuthenticationPlugin }
     * 
     */
    public DtoJaasAuthenticationPlugin createDtoJaasAuthenticationPlugin() {
        return new DtoJaasAuthenticationPlugin();
    }

    /**
     * Create an instance of {@link DtoSimpleJmsMessageConvertor.Connection }
     * 
     */
    public DtoSimpleJmsMessageConvertor.Connection createDtoSimpleJmsMessageConvertorConnection() {
        return new DtoSimpleJmsMessageConvertor.Connection();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.Adapter }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.Adapter createDtoJournalPersistenceAdapterFactoryAdapter() {
        return new DtoJournalPersistenceAdapterFactory.Adapter();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.BrokerService }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.BrokerService createDtoJournalPersistenceAdapterFactoryBrokerService() {
        return new DtoJournalPersistenceAdapterFactory.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.DataSource }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.DataSource createDtoJournalPersistenceAdapterFactoryDataSource() {
        return new DtoJournalPersistenceAdapterFactory.DataSource();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.JdbcAdapter }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.JdbcAdapter createDtoJournalPersistenceAdapterFactoryJdbcAdapter() {
        return new DtoJournalPersistenceAdapterFactory.JdbcAdapter();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.Journal }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.Journal createDtoJournalPersistenceAdapterFactoryJournal() {
        return new DtoJournalPersistenceAdapterFactory.Journal();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.Locker }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.Locker createDtoJournalPersistenceAdapterFactoryLocker() {
        return new DtoJournalPersistenceAdapterFactory.Locker();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor createDtoJournalPersistenceAdapterFactoryScheduledThreadPoolExecutor() {
        return new DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.Statements }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.Statements createDtoJournalPersistenceAdapterFactoryStatements() {
        return new DtoJournalPersistenceAdapterFactory.Statements();
    }

    /**
     * Create an instance of {@link DtoJournalPersistenceAdapterFactory.TaskRunnerFactory }
     * 
     */
    public DtoJournalPersistenceAdapterFactory.TaskRunnerFactory createDtoJournalPersistenceAdapterFactoryTaskRunnerFactory() {
        return new DtoJournalPersistenceAdapterFactory.TaskRunnerFactory();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.BrokerService }
     * 
     */
    public DtoJmsTopicConnector.BrokerService createDtoJmsTopicConnectorBrokerService() {
        return new DtoJmsTopicConnector.BrokerService();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.InboundMessageConvertor }
     * 
     */
    public DtoJmsTopicConnector.InboundMessageConvertor createDtoJmsTopicConnectorInboundMessageConvertor() {
        return new DtoJmsTopicConnector.InboundMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.InboundTopicBridges }
     * 
     */
    public DtoJmsTopicConnector.InboundTopicBridges createDtoJmsTopicConnectorInboundTopicBridges() {
        return new DtoJmsTopicConnector.InboundTopicBridges();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.LocalTopicConnection }
     * 
     */
    public DtoJmsTopicConnector.LocalTopicConnection createDtoJmsTopicConnectorLocalTopicConnection() {
        return new DtoJmsTopicConnector.LocalTopicConnection();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.LocalTopicConnectionFactory }
     * 
     */
    public DtoJmsTopicConnector.LocalTopicConnectionFactory createDtoJmsTopicConnectorLocalTopicConnectionFactory() {
        return new DtoJmsTopicConnector.LocalTopicConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.OutboundMessageConvertor }
     * 
     */
    public DtoJmsTopicConnector.OutboundMessageConvertor createDtoJmsTopicConnectorOutboundMessageConvertor() {
        return new DtoJmsTopicConnector.OutboundMessageConvertor();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.OutboundTopicBridges }
     * 
     */
    public DtoJmsTopicConnector.OutboundTopicBridges createDtoJmsTopicConnectorOutboundTopicBridges() {
        return new DtoJmsTopicConnector.OutboundTopicBridges();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.OutboundTopicConnection }
     * 
     */
    public DtoJmsTopicConnector.OutboundTopicConnection createDtoJmsTopicConnectorOutboundTopicConnection() {
        return new DtoJmsTopicConnector.OutboundTopicConnection();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.OutboundTopicConnectionFactory }
     * 
     */
    public DtoJmsTopicConnector.OutboundTopicConnectionFactory createDtoJmsTopicConnectorOutboundTopicConnectionFactory() {
        return new DtoJmsTopicConnector.OutboundTopicConnectionFactory();
    }

    /**
     * Create an instance of {@link DtoJmsTopicConnector.ReconnectionPolicy }
     * 
     */
    public DtoJmsTopicConnector.ReconnectionPolicy createDtoJmsTopicConnectorReconnectionPolicy() {
        return new DtoJmsTopicConnector.ReconnectionPolicy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPListStoreImpl.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoPListStoreImpl.class)
    public JAXBElement<DtoPListStoreImpl.BrokerService> createDtoPListStoreImplBrokerService(DtoPListStoreImpl.BrokerService value) {
        return new JAXBElement<DtoPListStoreImpl.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoPListStoreImpl.BrokerService.class, DtoPListStoreImpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempUsage.Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "store", scope = DtoTempUsage.class)
    public JAXBElement<DtoTempUsage.Store> createDtoTempUsageStore(DtoTempUsage.Store value) {
        return new JAXBElement<DtoTempUsage.Store>(_DtoTempUsageStore_QNAME, DtoTempUsage.Store.class, DtoTempUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempUsage.Parent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "parent", scope = DtoTempUsage.class)
    public JAXBElement<DtoTempUsage.Parent> createDtoTempUsageParent(DtoTempUsage.Parent value) {
        return new JAXBElement<DtoTempUsage.Parent>(_DtoTempUsageParent_QNAME, DtoTempUsage.Parent.class, DtoTempUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempUsage.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoTempUsage.class)
    public JAXBElement<DtoTempUsage.Executor> createDtoTempUsageExecutor(DtoTempUsage.Executor value) {
        return new JAXBElement<DtoTempUsage.Executor>(_DtoTempUsageExecutor_QNAME, DtoTempUsage.Executor.class, DtoTempUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempUsage.Limiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "limiter", scope = DtoTempUsage.class)
    public JAXBElement<DtoTempUsage.Limiter> createDtoTempUsageLimiter(DtoTempUsage.Limiter value) {
        return new JAXBElement<DtoTempUsage.Limiter>(_DtoTempUsageLimiter_QNAME, DtoTempUsage.Limiter.class, DtoTempUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RejectedTaskHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "rejectedTaskHandler", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.RejectedTaskHandler> createDtoXaConnectionFactoryRejectedTaskHandler(DtoXaConnectionFactory.RejectedTaskHandler value) {
        return new JAXBElement<DtoXaConnectionFactory.RejectedTaskHandler>(_DtoXaConnectionFactoryRejectedTaskHandler_QNAME, DtoXaConnectionFactory.RejectedTaskHandler.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.SessionTaskRunner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "sessionTaskRunner", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.SessionTaskRunner> createDtoXaConnectionFactorySessionTaskRunner(DtoXaConnectionFactory.SessionTaskRunner value) {
        return new JAXBElement<DtoXaConnectionFactory.SessionTaskRunner>(_DtoXaConnectionFactorySessionTaskRunner_QNAME, DtoXaConnectionFactory.SessionTaskRunner.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ConnectionIdGenerator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionIdGenerator", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.ConnectionIdGenerator> createDtoXaConnectionFactoryConnectionIdGenerator(DtoXaConnectionFactory.ConnectionIdGenerator value) {
        return new JAXBElement<DtoXaConnectionFactory.ConnectionIdGenerator>(_DtoXaConnectionFactoryConnectionIdGenerator_QNAME, DtoXaConnectionFactory.ConnectionIdGenerator.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.Properties> createDtoXaConnectionFactoryProperties(DtoXaConnectionFactory.Properties value) {
        return new JAXBElement<DtoXaConnectionFactory.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoXaConnectionFactory.Properties.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.BlobTransferPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "blobTransferPolicy", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.BlobTransferPolicy> createDtoXaConnectionFactoryBlobTransferPolicy(DtoXaConnectionFactory.BlobTransferPolicy value) {
        return new JAXBElement<DtoXaConnectionFactory.BlobTransferPolicy>(_DtoXaConnectionFactoryBlobTransferPolicy_QNAME, DtoXaConnectionFactory.BlobTransferPolicy.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ExceptionListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "exceptionListener", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.ExceptionListener> createDtoXaConnectionFactoryExceptionListener(DtoXaConnectionFactory.ExceptionListener value) {
        return new JAXBElement<DtoXaConnectionFactory.ExceptionListener>(_DtoXaConnectionFactoryExceptionListener_QNAME, DtoXaConnectionFactory.ExceptionListener.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ClientIdGenerator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "clientIdGenerator", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.ClientIdGenerator> createDtoXaConnectionFactoryClientIdGenerator(DtoXaConnectionFactory.ClientIdGenerator value) {
        return new JAXBElement<DtoXaConnectionFactory.ClientIdGenerator>(_DtoXaConnectionFactoryClientIdGenerator_QNAME, DtoXaConnectionFactory.ClientIdGenerator.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.TrustedPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "trustedPackages", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.TrustedPackages> createDtoXaConnectionFactoryTrustedPackages(DtoXaConnectionFactory.TrustedPackages value) {
        return new JAXBElement<DtoXaConnectionFactory.TrustedPackages>(_DtoXaConnectionFactoryTrustedPackages_QNAME, DtoXaConnectionFactory.TrustedPackages.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.TransportListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportListener", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.TransportListener> createDtoXaConnectionFactoryTransportListener(DtoXaConnectionFactory.TransportListener value) {
        return new JAXBElement<DtoXaConnectionFactory.TransportListener>(_DtoXaConnectionFactoryTransportListener_QNAME, DtoXaConnectionFactory.TransportListener.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.PrefetchPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "prefetchPolicy", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.PrefetchPolicy> createDtoXaConnectionFactoryPrefetchPolicy(DtoXaConnectionFactory.PrefetchPolicy value) {
        return new JAXBElement<DtoXaConnectionFactory.PrefetchPolicy>(_DtoXaConnectionFactoryPrefetchPolicy_QNAME, DtoXaConnectionFactory.PrefetchPolicy.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.Transformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transformer", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.Transformer> createDtoXaConnectionFactoryTransformer(DtoXaConnectionFactory.Transformer value) {
        return new JAXBElement<DtoXaConnectionFactory.Transformer>(_DtoXaConnectionFactoryTransformer_QNAME, DtoXaConnectionFactory.Transformer.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.ClientInternalExceptionListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "clientInternalExceptionListener", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.ClientInternalExceptionListener> createDtoXaConnectionFactoryClientInternalExceptionListener(DtoXaConnectionFactory.ClientInternalExceptionListener value) {
        return new JAXBElement<DtoXaConnectionFactory.ClientInternalExceptionListener>(_DtoXaConnectionFactoryClientInternalExceptionListener_QNAME, DtoXaConnectionFactory.ClientInternalExceptionListener.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RedeliveryPolicyMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicyMap", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.RedeliveryPolicyMap> createDtoXaConnectionFactoryRedeliveryPolicyMap(DtoXaConnectionFactory.RedeliveryPolicyMap value) {
        return new JAXBElement<DtoXaConnectionFactory.RedeliveryPolicyMap>(_DtoXaConnectionFactoryRedeliveryPolicyMap_QNAME, DtoXaConnectionFactory.RedeliveryPolicyMap.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoXaConnectionFactory.RedeliveryPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicy", scope = DtoXaConnectionFactory.class)
    public JAXBElement<DtoXaConnectionFactory.RedeliveryPolicy> createDtoXaConnectionFactoryRedeliveryPolicy(DtoXaConnectionFactory.RedeliveryPolicy value) {
        return new JAXBElement<DtoXaConnectionFactory.RedeliveryPolicy>(_DtoXaConnectionFactoryRedeliveryPolicy_QNAME, DtoXaConnectionFactory.RedeliveryPolicy.class, DtoXaConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.JobSchedulerStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jobSchedulerStore", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.JobSchedulerStore> createDtoSystemUsageJobSchedulerStore(DtoSystemUsage.JobSchedulerStore value) {
        return new JAXBElement<DtoSystemUsage.JobSchedulerStore>(_DtoSystemUsageJobSchedulerStore_QNAME, DtoSystemUsage.JobSchedulerStore.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.TempStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempStore", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.TempStore> createDtoSystemUsageTempStore(DtoSystemUsage.TempStore value) {
        return new JAXBElement<DtoSystemUsage.TempStore>(_DtoSystemUsageTempStore_QNAME, DtoSystemUsage.TempStore.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.TempUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempUsage", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.TempUsage> createDtoSystemUsageTempUsage(DtoSystemUsage.TempUsage value) {
        return new JAXBElement<DtoSystemUsage.TempUsage>(_DtoSystemUsageTempUsage_QNAME, DtoSystemUsage.TempUsage.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.Adapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adapter", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.Adapter> createDtoSystemUsageAdapter(DtoSystemUsage.Adapter value) {
        return new JAXBElement<DtoSystemUsage.Adapter>(_DtoSystemUsageAdapter_QNAME, DtoSystemUsage.Adapter.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.MemoryUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "memoryUsage", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.MemoryUsage> createDtoSystemUsageMemoryUsage(DtoSystemUsage.MemoryUsage value) {
        return new JAXBElement<DtoSystemUsage.MemoryUsage>(_DtoSystemUsageMemoryUsage_QNAME, DtoSystemUsage.MemoryUsage.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.Parent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "parent", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.Parent> createDtoSystemUsageParent(DtoSystemUsage.Parent value) {
        return new JAXBElement<DtoSystemUsage.Parent>(_DtoTempUsageParent_QNAME, DtoSystemUsage.Parent.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.Executor> createDtoSystemUsageExecutor(DtoSystemUsage.Executor value) {
        return new JAXBElement<DtoSystemUsage.Executor>(_DtoTempUsageExecutor_QNAME, DtoSystemUsage.Executor.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.JobSchedulerUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jobSchedulerUsage", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.JobSchedulerUsage> createDtoSystemUsageJobSchedulerUsage(DtoSystemUsage.JobSchedulerUsage value) {
        return new JAXBElement<DtoSystemUsage.JobSchedulerUsage>(_DtoSystemUsageJobSchedulerUsage_QNAME, DtoSystemUsage.JobSchedulerUsage.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSystemUsage.StoreUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "storeUsage", scope = DtoSystemUsage.class)
    public JAXBElement<DtoSystemUsage.StoreUsage> createDtoSystemUsageStoreUsage(DtoSystemUsage.StoreUsage value) {
        return new JAXBElement<DtoSystemUsage.StoreUsage>(_DtoSystemUsageStoreUsage_QNAME, DtoSystemUsage.StoreUsage.class, DtoSystemUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleJmsMessageConvertor.Connection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connection", scope = DtoSimpleJmsMessageConvertor.class)
    public JAXBElement<DtoSimpleJmsMessageConvertor.Connection> createDtoSimpleJmsMessageConvertorConnection(DtoSimpleJmsMessageConvertor.Connection value) {
        return new JAXBElement<DtoSimpleJmsMessageConvertor.Connection>(_DtoSimpleJmsMessageConvertorConnection_QNAME, DtoSimpleJmsMessageConvertor.Connection.class, DtoSimpleJmsMessageConvertor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.ProducerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerConnection", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.ProducerConnection> createDtoInboundQueueBridgeProducerConnection(DtoInboundQueueBridge.ProducerConnection value) {
        return new JAXBElement<DtoInboundQueueBridge.ProducerConnection>(_DtoInboundQueueBridgeProducerConnection_QNAME, DtoInboundQueueBridge.ProducerConnection.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.Consumer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumer", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.Consumer> createDtoInboundQueueBridgeConsumer(DtoInboundQueueBridge.Consumer value) {
        return new JAXBElement<DtoInboundQueueBridge.Consumer>(_DtoInboundQueueBridgeConsumer_QNAME, DtoInboundQueueBridge.Consumer.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.ConsumerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerConnection", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.ConsumerConnection> createDtoInboundQueueBridgeConsumerConnection(DtoInboundQueueBridge.ConsumerConnection value) {
        return new JAXBElement<DtoInboundQueueBridge.ConsumerConnection>(_DtoInboundQueueBridgeConsumerConnection_QNAME, DtoInboundQueueBridge.ConsumerConnection.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.ConsumerQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerQueue", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.ConsumerQueue> createDtoInboundQueueBridgeConsumerQueue(DtoInboundQueueBridge.ConsumerQueue value) {
        return new JAXBElement<DtoInboundQueueBridge.ConsumerQueue>(_DtoInboundQueueBridgeConsumerQueue_QNAME, DtoInboundQueueBridge.ConsumerQueue.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.JmsMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsMessageConvertor", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.JmsMessageConvertor> createDtoInboundQueueBridgeJmsMessageConvertor(DtoInboundQueueBridge.JmsMessageConvertor value) {
        return new JAXBElement<DtoInboundQueueBridge.JmsMessageConvertor>(_DtoInboundQueueBridgeJmsMessageConvertor_QNAME, DtoInboundQueueBridge.JmsMessageConvertor.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.ProducerQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerQueue", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.ProducerQueue> createDtoInboundQueueBridgeProducerQueue(DtoInboundQueueBridge.ProducerQueue value) {
        return new JAXBElement<DtoInboundQueueBridge.ProducerQueue>(_DtoInboundQueueBridgeProducerQueue_QNAME, DtoInboundQueueBridge.ProducerQueue.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundQueueBridge.JmsConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsConnector", scope = DtoInboundQueueBridge.class)
    public JAXBElement<DtoInboundQueueBridge.JmsConnector> createDtoInboundQueueBridgeJmsConnector(DtoInboundQueueBridge.JmsConnector value) {
        return new JAXBElement<DtoInboundQueueBridge.JmsConnector>(_DtoInboundQueueBridgeJmsConnector_QNAME, DtoInboundQueueBridge.JmsConnector.class, DtoInboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNoSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoNoSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoNoSubscriptionRecoveryPolicy.Broker> createDtoNoSubscriptionRecoveryPolicyBroker(DtoNoSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoNoSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoNoSubscriptionRecoveryPolicy.Broker.class, DtoNoSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoVirtualDestinationInterceptor.VirtualDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "virtualDestinations", scope = DtoVirtualDestinationInterceptor.class)
    public JAXBElement<DtoVirtualDestinationInterceptor.VirtualDestinations> createDtoVirtualDestinationInterceptorVirtualDestinations(DtoVirtualDestinationInterceptor.VirtualDestinations value) {
        return new JAXBElement<DtoVirtualDestinationInterceptor.VirtualDestinations>(_DtoVirtualDestinationInterceptorVirtualDestinations_QNAME, DtoVirtualDestinationInterceptor.VirtualDestinations.class, DtoVirtualDestinationInterceptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoRedeliveryPlugin.class)
    public JAXBElement<DtoRedeliveryPlugin.AdminConnectionContext> createDtoRedeliveryPluginAdminConnectionContext(DtoRedeliveryPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoRedeliveryPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoRedeliveryPlugin.AdminConnectionContext.class, DtoRedeliveryPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoRedeliveryPlugin.class)
    public JAXBElement<DtoRedeliveryPlugin.Next> createDtoRedeliveryPluginNext(DtoRedeliveryPlugin.Next value) {
        return new JAXBElement<DtoRedeliveryPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoRedeliveryPlugin.Next.class, DtoRedeliveryPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPlugin.RedeliveryPolicyMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicyMap", scope = DtoRedeliveryPlugin.class)
    public JAXBElement<DtoRedeliveryPlugin.RedeliveryPolicyMap> createDtoRedeliveryPluginRedeliveryPolicyMap(DtoRedeliveryPlugin.RedeliveryPolicyMap value) {
        return new JAXBElement<DtoRedeliveryPlugin.RedeliveryPolicyMap>(_DtoXaConnectionFactoryRedeliveryPolicyMap_QNAME, DtoRedeliveryPlugin.RedeliveryPolicyMap.class, DtoRedeliveryPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ProducerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerConnection", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.ProducerConnection> createDtoOutboundTopicBridgeProducerConnection(DtoOutboundTopicBridge.ProducerConnection value) {
        return new JAXBElement<DtoOutboundTopicBridge.ProducerConnection>(_DtoInboundQueueBridgeProducerConnection_QNAME, DtoOutboundTopicBridge.ProducerConnection.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ProducerTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerTopic", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.ProducerTopic> createDtoOutboundTopicBridgeProducerTopic(DtoOutboundTopicBridge.ProducerTopic value) {
        return new JAXBElement<DtoOutboundTopicBridge.ProducerTopic>(_DtoOutboundTopicBridgeProducerTopic_QNAME, DtoOutboundTopicBridge.ProducerTopic.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.Consumer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumer", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.Consumer> createDtoOutboundTopicBridgeConsumer(DtoOutboundTopicBridge.Consumer value) {
        return new JAXBElement<DtoOutboundTopicBridge.Consumer>(_DtoInboundQueueBridgeConsumer_QNAME, DtoOutboundTopicBridge.Consumer.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ConsumerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerConnection", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.ConsumerConnection> createDtoOutboundTopicBridgeConsumerConnection(DtoOutboundTopicBridge.ConsumerConnection value) {
        return new JAXBElement<DtoOutboundTopicBridge.ConsumerConnection>(_DtoInboundQueueBridgeConsumerConnection_QNAME, DtoOutboundTopicBridge.ConsumerConnection.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.JmsMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsMessageConvertor", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.JmsMessageConvertor> createDtoOutboundTopicBridgeJmsMessageConvertor(DtoOutboundTopicBridge.JmsMessageConvertor value) {
        return new JAXBElement<DtoOutboundTopicBridge.JmsMessageConvertor>(_DtoInboundQueueBridgeJmsMessageConvertor_QNAME, DtoOutboundTopicBridge.JmsMessageConvertor.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.ConsumerTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerTopic", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.ConsumerTopic> createDtoOutboundTopicBridgeConsumerTopic(DtoOutboundTopicBridge.ConsumerTopic value) {
        return new JAXBElement<DtoOutboundTopicBridge.ConsumerTopic>(_DtoOutboundTopicBridgeConsumerTopic_QNAME, DtoOutboundTopicBridge.ConsumerTopic.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundTopicBridge.JmsConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsConnector", scope = DtoOutboundTopicBridge.class)
    public JAXBElement<DtoOutboundTopicBridge.JmsConnector> createDtoOutboundTopicBridgeJmsConnector(DtoOutboundTopicBridge.JmsConnector value) {
        return new JAXBElement<DtoOutboundTopicBridge.JmsConnector>(_DtoInboundQueueBridgeJmsConnector_QNAME, DtoOutboundTopicBridge.JmsConnector.class, DtoOutboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMaxdbJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoMaxdbJdbcAdapter.class)
    public JAXBElement<DtoMaxdbJdbcAdapter.Statements> createDtoMaxdbJdbcAdapterStatements(DtoMaxdbJdbcAdapter.Statements value) {
        return new JAXBElement<DtoMaxdbJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoMaxdbJdbcAdapter.Statements.class, DtoMaxdbJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceTaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceTaskRunnerFactory", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.PersistenceTaskRunnerFactory> createDtoBrokerPersistenceTaskRunnerFactory(DtoBroker.PersistenceTaskRunnerFactory value) {
        return new JAXBElement<DtoBroker.PersistenceTaskRunnerFactory>(_DtoBrokerPersistenceTaskRunnerFactory_QNAME, DtoBroker.PersistenceTaskRunnerFactory.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.DestinationInterceptors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationInterceptors", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.DestinationInterceptors> createDtoBrokerDestinationInterceptors(DtoBroker.DestinationInterceptors value) {
        return new JAXBElement<DtoBroker.DestinationInterceptors>(_DtoBrokerDestinationInterceptors_QNAME, DtoBroker.DestinationInterceptors.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.MessageAuthorizationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "messageAuthorizationPolicy", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.MessageAuthorizationPolicy> createDtoBrokerMessageAuthorizationPolicy(DtoBroker.MessageAuthorizationPolicy value) {
        return new JAXBElement<DtoBroker.MessageAuthorizationPolicy>(_DtoBrokerMessageAuthorizationPolicy_QNAME, DtoBroker.MessageAuthorizationPolicy.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.NetworkConnectorURIs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkConnectorURIs", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.NetworkConnectorURIs> createDtoBrokerNetworkConnectorURIs(DtoBroker.NetworkConnectorURIs value) {
        return new JAXBElement<DtoBroker.NetworkConnectorURIs>(_DtoBrokerNetworkConnectorURIs_QNAME, DtoBroker.NetworkConnectorURIs.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.TransportConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportConnectors", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.TransportConnectors> createDtoBrokerTransportConnectors(DtoBroker.TransportConnectors value) {
        return new JAXBElement<DtoBroker.TransportConnectors>(_DtoBrokerTransportConnectors_QNAME, DtoBroker.TransportConnectors.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.StartException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "startException", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.StartException> createDtoBrokerStartException(DtoBroker.StartException value) {
        return new JAXBElement<DtoBroker.StartException>(_DtoBrokerStartException_QNAME, DtoBroker.StartException.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.NetworkConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkConnectors", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.NetworkConnectors> createDtoBrokerNetworkConnectors(DtoBroker.NetworkConnectors value) {
        return new JAXBElement<DtoBroker.NetworkConnectors>(_DtoBrokerNetworkConnectors_QNAME, DtoBroker.NetworkConnectors.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.RegionBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "regionBroker", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.RegionBroker> createDtoBrokerRegionBroker(DtoBroker.RegionBroker value) {
        return new JAXBElement<DtoBroker.RegionBroker>(_DtoBrokerRegionBroker_QNAME, DtoBroker.RegionBroker.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.TempDataStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempDataStore", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.TempDataStore> createDtoBrokerTempDataStore(DtoBroker.TempDataStore value) {
        return new JAXBElement<DtoBroker.TempDataStore>(_DtoBrokerTempDataStore_QNAME, DtoBroker.TempDataStore.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.JobSchedulerStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jobSchedulerStore", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.JobSchedulerStore> createDtoBrokerJobSchedulerStore(DtoBroker.JobSchedulerStore value) {
        return new JAXBElement<DtoBroker.JobSchedulerStore>(_DtoSystemUsageJobSchedulerStore_QNAME, DtoBroker.JobSchedulerStore.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.Services }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "services", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.Services> createDtoBrokerServices(DtoBroker.Services value) {
        return new JAXBElement<DtoBroker.Services>(_DtoBrokerServices_QNAME, DtoBroker.Services.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.SslContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "sslContext", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.SslContext> createDtoBrokerSslContext(DtoBroker.SslContext value) {
        return new JAXBElement<DtoBroker.SslContext>(_DtoBrokerSslContext_QNAME, DtoBroker.SslContext.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.ShutdownHooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "shutdownHooks", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.ShutdownHooks> createDtoBrokerShutdownHooks(DtoBroker.ShutdownHooks value) {
        return new JAXBElement<DtoBroker.ShutdownHooks>(_DtoBrokerShutdownHooks_QNAME, DtoBroker.ShutdownHooks.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.JmsBridgeConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsBridgeConnectors", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.JmsBridgeConnectors> createDtoBrokerJmsBridgeConnectors(DtoBroker.JmsBridgeConnectors value) {
        return new JAXBElement<DtoBroker.JmsBridgeConnectors>(_DtoBrokerJmsBridgeConnectors_QNAME, DtoBroker.JmsBridgeConnectors.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.Destinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinations", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.Destinations> createDtoBrokerDestinations(DtoBroker.Destinations value) {
        return new JAXBElement<DtoBroker.Destinations>(_DtoBrokerDestinations_QNAME, DtoBroker.Destinations.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.TransportConnectorURIs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportConnectorURIs", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.TransportConnectorURIs> createDtoBrokerTransportConnectorURIs(DtoBroker.TransportConnectorURIs value) {
        return new JAXBElement<DtoBroker.TransportConnectorURIs>(_DtoBrokerTransportConnectorURIs_QNAME, DtoBroker.TransportConnectorURIs.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.AdminView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminView", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.AdminView> createDtoBrokerAdminView(DtoBroker.AdminView value) {
        return new JAXBElement<DtoBroker.AdminView>(_DtoBrokerAdminView_QNAME, DtoBroker.AdminView.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceAdapter", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.PersistenceAdapter> createDtoBrokerPersistenceAdapter(DtoBroker.PersistenceAdapter value) {
        return new JAXBElement<DtoBroker.PersistenceAdapter>(_DtoBrokerPersistenceAdapter_QNAME, DtoBroker.PersistenceAdapter.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.ProducerSystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerSystemUsage", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.ProducerSystemUsage> createDtoBrokerProducerSystemUsage(DtoBroker.ProducerSystemUsage value) {
        return new JAXBElement<DtoBroker.ProducerSystemUsage>(_DtoBrokerProducerSystemUsage_QNAME, DtoBroker.ProducerSystemUsage.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.ManagementContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "managementContext", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.ManagementContext> createDtoBrokerManagementContext(DtoBroker.ManagementContext value) {
        return new JAXBElement<DtoBroker.ManagementContext>(_DtoBrokerManagementContext_QNAME, DtoBroker.ManagementContext.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.ProxyConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "proxyConnectors", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.ProxyConnectors> createDtoBrokerProxyConnectors(DtoBroker.ProxyConnectors value) {
        return new JAXBElement<DtoBroker.ProxyConnectors>(_DtoBrokerProxyConnectors_QNAME, DtoBroker.ProxyConnectors.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.TaskRunnerFactory> createDtoBrokerTaskRunnerFactory(DtoBroker.TaskRunnerFactory value) {
        return new JAXBElement<DtoBroker.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoBroker.TaskRunnerFactory.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.ConsumerSystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerSystemUsage", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.ConsumerSystemUsage> createDtoBrokerConsumerSystemUsage(DtoBroker.ConsumerSystemUsage value) {
        return new JAXBElement<DtoBroker.ConsumerSystemUsage>(_DtoBrokerConsumerSystemUsage_QNAME, DtoBroker.ConsumerSystemUsage.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.IoExceptionHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "ioExceptionHandler", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.IoExceptionHandler> createDtoBrokerIoExceptionHandler(DtoBroker.IoExceptionHandler value) {
        return new JAXBElement<DtoBroker.IoExceptionHandler>(_DtoBrokerIoExceptionHandler_QNAME, DtoBroker.IoExceptionHandler.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.DestinationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationPolicy", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.DestinationPolicy> createDtoBrokerDestinationPolicy(DtoBroker.DestinationPolicy value) {
        return new JAXBElement<DtoBroker.DestinationPolicy>(_DtoBrokerDestinationPolicy_QNAME, DtoBroker.DestinationPolicy.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.BrokerContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerContext", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.BrokerContext> createDtoBrokerBrokerContext(DtoBroker.BrokerContext value) {
        return new JAXBElement<DtoBroker.BrokerContext>(_DtoBrokerBrokerContext_QNAME, DtoBroker.BrokerContext.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.SystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "systemUsage", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.SystemUsage> createDtoBrokerSystemUsage(DtoBroker.SystemUsage value) {
        return new JAXBElement<DtoBroker.SystemUsage>(_DtoBrokerSystemUsage_QNAME, DtoBroker.SystemUsage.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.PersistenceFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceFactory", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.PersistenceFactory> createDtoBrokerPersistenceFactory(DtoBroker.PersistenceFactory value) {
        return new JAXBElement<DtoBroker.PersistenceFactory>(_DtoBrokerPersistenceFactory_QNAME, DtoBroker.PersistenceFactory.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.Plugins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "plugins", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.Plugins> createDtoBrokerPlugins(DtoBroker.Plugins value) {
        return new JAXBElement<DtoBroker.Plugins>(_DtoBrokerPlugins_QNAME, DtoBroker.Plugins.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBroker.DestinationFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationFactory", scope = DtoBroker.class)
    public JAXBElement<DtoBroker.DestinationFactory> createDtoBrokerDestinationFactory(DtoBroker.DestinationFactory value) {
        return new JAXBElement<DtoBroker.DestinationFactory>(_DtoBrokerDestinationFactory_QNAME, DtoBroker.DestinationFactory.class, DtoBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.RejectedTaskHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "rejectedTaskHandler", scope = DtoTaskRunnerFactory.class)
    public JAXBElement<DtoTaskRunnerFactory.RejectedTaskHandler> createDtoTaskRunnerFactoryRejectedTaskHandler(DtoTaskRunnerFactory.RejectedTaskHandler value) {
        return new JAXBElement<DtoTaskRunnerFactory.RejectedTaskHandler>(_DtoXaConnectionFactoryRejectedTaskHandler_QNAME, DtoTaskRunnerFactory.RejectedTaskHandler.class, DtoTaskRunnerFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.ThreadClassLoader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "threadClassLoader", scope = DtoTaskRunnerFactory.class)
    public JAXBElement<DtoTaskRunnerFactory.ThreadClassLoader> createDtoTaskRunnerFactoryThreadClassLoader(DtoTaskRunnerFactory.ThreadClassLoader value) {
        return new JAXBElement<DtoTaskRunnerFactory.ThreadClassLoader>(_DtoTaskRunnerFactoryThreadClassLoader_QNAME, DtoTaskRunnerFactory.ThreadClassLoader.class, DtoTaskRunnerFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTaskRunnerFactory.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoTaskRunnerFactory.class)
    public JAXBElement<DtoTaskRunnerFactory.Executor> createDtoTaskRunnerFactoryExecutor(DtoTaskRunnerFactory.Executor value) {
        return new JAXBElement<DtoTaskRunnerFactory.Executor>(_DtoTempUsageExecutor_QNAME, DtoTaskRunnerFactory.Executor.class, DtoTaskRunnerFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSharedDeadLetterStrategy.DeadLetterQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "deadLetterQueue", scope = DtoSharedDeadLetterStrategy.class)
    public JAXBElement<DtoSharedDeadLetterStrategy.DeadLetterQueue> createDtoSharedDeadLetterStrategyDeadLetterQueue(DtoSharedDeadLetterStrategy.DeadLetterQueue value) {
        return new JAXBElement<DtoSharedDeadLetterStrategy.DeadLetterQueue>(_DtoSharedDeadLetterStrategyDeadLetterQueue_QNAME, DtoSharedDeadLetterStrategy.DeadLetterQueue.class, DtoSharedDeadLetterStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransactJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoTransactJdbcAdapter.class)
    public JAXBElement<DtoTransactJdbcAdapter.Statements> createDtoTransactJdbcAdapterStatements(DtoTransactJdbcAdapter.Statements value) {
        return new JAXBElement<DtoTransactJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoTransactJdbcAdapter.Statements.class, DtoTransactJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoManagementContext.MBeanServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "MBeanServer", scope = DtoManagementContext.class)
    public JAXBElement<DtoManagementContext.MBeanServer> createDtoManagementContextMBeanServer(DtoManagementContext.MBeanServer value) {
        return new JAXBElement<DtoManagementContext.MBeanServer>(_DtoManagementContextMBeanServer_QNAME, DtoManagementContext.MBeanServer.class, DtoManagementContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoManagementContext.Environment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "environment", scope = DtoManagementContext.class)
    public JAXBElement<DtoManagementContext.Environment> createDtoManagementContextEnvironment(DtoManagementContext.Environment value) {
        return new JAXBElement<DtoManagementContext.Environment>(_DtoManagementContextEnvironment_QNAME, DtoManagementContext.Environment.class, DtoManagementContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoManagementContext.Server }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "server", scope = DtoManagementContext.class)
    public JAXBElement<DtoManagementContext.Server> createDtoManagementContextServer(DtoManagementContext.Server value) {
        return new JAXBElement<DtoManagementContext.Server>(_DtoManagementContextServer_QNAME, DtoManagementContext.Server.class, DtoManagementContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDefaultJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoDefaultJDBCAdapter.class)
    public JAXBElement<DtoDefaultJDBCAdapter.Statements> createDtoDefaultJDBCAdapterStatements(DtoDefaultJDBCAdapter.Statements value) {
        return new JAXBElement<DtoDefaultJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoDefaultJDBCAdapter.Statements.class, DtoDefaultJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempQueue.Connection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connection", scope = DtoTempQueue.class)
    public JAXBElement<DtoTempQueue.Connection> createDtoTempQueueConnection(DtoTempQueue.Connection value) {
        return new JAXBElement<DtoTempQueue.Connection>(_DtoSimpleJmsMessageConvertorConnection_QNAME, DtoTempQueue.Connection.class, DtoTempQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempQueue.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoTempQueue.class)
    public JAXBElement<DtoTempQueue.Properties> createDtoTempQueueProperties(DtoTempQueue.Properties value) {
        return new JAXBElement<DtoTempQueue.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoTempQueue.Properties.class, DtoTempQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempQueue.CompositeDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "compositeDestinations", scope = DtoTempQueue.class)
    public JAXBElement<DtoTempQueue.CompositeDestinations> createDtoTempQueueCompositeDestinations(DtoTempQueue.CompositeDestinations value) {
        return new JAXBElement<DtoTempQueue.CompositeDestinations>(_DtoTempQueueCompositeDestinations_QNAME, DtoTempQueue.CompositeDestinations.class, DtoTempQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAxionJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoAxionJDBCAdapter.class)
    public JAXBElement<DtoAxionJDBCAdapter.Statements> createDtoAxionJDBCAdapterStatements(DtoAxionJDBCAdapter.Statements value) {
        return new JAXBElement<DtoAxionJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoAxionJDBCAdapter.Statements.class, DtoAxionJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAbortSlowConsumerStrategy.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoAbortSlowConsumerStrategy.class)
    public JAXBElement<DtoAbortSlowConsumerStrategy.BrokerService> createDtoAbortSlowConsumerStrategyBrokerService(DtoAbortSlowConsumerStrategy.BrokerService value) {
        return new JAXBElement<DtoAbortSlowConsumerStrategy.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoAbortSlowConsumerStrategy.BrokerService.class, DtoAbortSlowConsumerStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoLeaseDatabaseLocker.class)
    public JAXBElement<DtoLeaseDatabaseLocker.Statements> createDtoLeaseDatabaseLockerStatements(DtoLeaseDatabaseLocker.Statements value) {
        return new JAXBElement<DtoLeaseDatabaseLocker.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoLeaseDatabaseLocker.Statements.class, DtoLeaseDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoLeaseDatabaseLocker.class)
    public JAXBElement<DtoLeaseDatabaseLocker.DataSource> createDtoLeaseDatabaseLockerDataSource(DtoLeaseDatabaseLocker.DataSource value) {
        return new JAXBElement<DtoLeaseDatabaseLocker.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoLeaseDatabaseLocker.DataSource.class, DtoLeaseDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLeaseDatabaseLocker.Lockable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "lockable", scope = DtoLeaseDatabaseLocker.class)
    public JAXBElement<DtoLeaseDatabaseLocker.Lockable> createDtoLeaseDatabaseLockerLockable(DtoLeaseDatabaseLocker.Lockable value) {
        return new JAXBElement<DtoLeaseDatabaseLocker.Lockable>(_DtoLeaseDatabaseLockerLockable_QNAME, DtoLeaseDatabaseLocker.Lockable.class, DtoLeaseDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSybaseJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoSybaseJdbcAdapter.class)
    public JAXBElement<DtoSybaseJdbcAdapter.Statements> createDtoSybaseJdbcAdapterStatements(DtoSybaseJdbcAdapter.Statements value) {
        return new JAXBElement<DtoSybaseJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoSybaseJdbcAdapter.Statements.class, DtoSybaseJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.ProducerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerConnection", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.ProducerConnection> createDtoInboundTopicBridgeProducerConnection(DtoInboundTopicBridge.ProducerConnection value) {
        return new JAXBElement<DtoInboundTopicBridge.ProducerConnection>(_DtoInboundQueueBridgeProducerConnection_QNAME, DtoInboundTopicBridge.ProducerConnection.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.ProducerTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerTopic", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.ProducerTopic> createDtoInboundTopicBridgeProducerTopic(DtoInboundTopicBridge.ProducerTopic value) {
        return new JAXBElement<DtoInboundTopicBridge.ProducerTopic>(_DtoOutboundTopicBridgeProducerTopic_QNAME, DtoInboundTopicBridge.ProducerTopic.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.Consumer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumer", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.Consumer> createDtoInboundTopicBridgeConsumer(DtoInboundTopicBridge.Consumer value) {
        return new JAXBElement<DtoInboundTopicBridge.Consumer>(_DtoInboundQueueBridgeConsumer_QNAME, DtoInboundTopicBridge.Consumer.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.ConsumerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerConnection", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.ConsumerConnection> createDtoInboundTopicBridgeConsumerConnection(DtoInboundTopicBridge.ConsumerConnection value) {
        return new JAXBElement<DtoInboundTopicBridge.ConsumerConnection>(_DtoInboundQueueBridgeConsumerConnection_QNAME, DtoInboundTopicBridge.ConsumerConnection.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.JmsMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsMessageConvertor", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.JmsMessageConvertor> createDtoInboundTopicBridgeJmsMessageConvertor(DtoInboundTopicBridge.JmsMessageConvertor value) {
        return new JAXBElement<DtoInboundTopicBridge.JmsMessageConvertor>(_DtoInboundQueueBridgeJmsMessageConvertor_QNAME, DtoInboundTopicBridge.JmsMessageConvertor.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.ConsumerTopic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerTopic", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.ConsumerTopic> createDtoInboundTopicBridgeConsumerTopic(DtoInboundTopicBridge.ConsumerTopic value) {
        return new JAXBElement<DtoInboundTopicBridge.ConsumerTopic>(_DtoOutboundTopicBridgeConsumerTopic_QNAME, DtoInboundTopicBridge.ConsumerTopic.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInboundTopicBridge.JmsConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsConnector", scope = DtoInboundTopicBridge.class)
    public JAXBElement<DtoInboundTopicBridge.JmsConnector> createDtoInboundTopicBridgeJmsConnector(DtoInboundTopicBridge.JmsConnector value) {
        return new JAXBElement<DtoInboundTopicBridge.JmsConnector>(_DtoInboundQueueBridgeJmsConnector_QNAME, DtoInboundTopicBridge.JmsConnector.class, DtoInboundTopicBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoImageBasedJDBCAdaptor.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoImageBasedJDBCAdaptor.class)
    public JAXBElement<DtoImageBasedJDBCAdaptor.Statements> createDtoImageBasedJDBCAdaptorStatements(DtoImageBasedJDBCAdaptor.Statements value) {
        return new JAXBElement<DtoImageBasedJDBCAdaptor.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoImageBasedJDBCAdaptor.Statements.class, DtoImageBasedJDBCAdaptor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFixedSizedSubscriptionRecoveryPolicy.Buffer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "buffer", scope = DtoFixedSizedSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoFixedSizedSubscriptionRecoveryPolicy.Buffer> createDtoFixedSizedSubscriptionRecoveryPolicyBuffer(DtoFixedSizedSubscriptionRecoveryPolicy.Buffer value) {
        return new JAXBElement<DtoFixedSizedSubscriptionRecoveryPolicy.Buffer>(_DtoFixedSizedSubscriptionRecoveryPolicyBuffer_QNAME, DtoFixedSizedSubscriptionRecoveryPolicy.Buffer.class, DtoFixedSizedSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFixedSizedSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoFixedSizedSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoFixedSizedSubscriptionRecoveryPolicy.Broker> createDtoFixedSizedSubscriptionRecoveryPolicyBroker(DtoFixedSizedSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoFixedSizedSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoFixedSizedSubscriptionRecoveryPolicy.Broker.class, DtoFixedSizedSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoUdpTraceBrokerPlugin.WireFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wireFormat", scope = DtoUdpTraceBrokerPlugin.class)
    public JAXBElement<DtoUdpTraceBrokerPlugin.WireFormat> createDtoUdpTraceBrokerPluginWireFormat(DtoUdpTraceBrokerPlugin.WireFormat value) {
        return new JAXBElement<DtoUdpTraceBrokerPlugin.WireFormat>(_DtoUdpTraceBrokerPluginWireFormat_QNAME, DtoUdpTraceBrokerPlugin.WireFormat.class, DtoUdpTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoUdpTraceBrokerPlugin.WireFormatFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wireFormatFactory", scope = DtoUdpTraceBrokerPlugin.class)
    public JAXBElement<DtoUdpTraceBrokerPlugin.WireFormatFactory> createDtoUdpTraceBrokerPluginWireFormatFactory(DtoUdpTraceBrokerPlugin.WireFormatFactory value) {
        return new JAXBElement<DtoUdpTraceBrokerPlugin.WireFormatFactory>(_DtoUdpTraceBrokerPluginWireFormatFactory_QNAME, DtoUdpTraceBrokerPlugin.WireFormatFactory.class, DtoUdpTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoUdpTraceBrokerPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoUdpTraceBrokerPlugin.class)
    public JAXBElement<DtoUdpTraceBrokerPlugin.AdminConnectionContext> createDtoUdpTraceBrokerPluginAdminConnectionContext(DtoUdpTraceBrokerPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoUdpTraceBrokerPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoUdpTraceBrokerPlugin.AdminConnectionContext.class, DtoUdpTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoUdpTraceBrokerPlugin.Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "address", scope = DtoUdpTraceBrokerPlugin.class)
    public JAXBElement<DtoUdpTraceBrokerPlugin.Address> createDtoUdpTraceBrokerPluginAddress(DtoUdpTraceBrokerPlugin.Address value) {
        return new JAXBElement<DtoUdpTraceBrokerPlugin.Address>(_DtoUdpTraceBrokerPluginAddress_QNAME, DtoUdpTraceBrokerPlugin.Address.class, DtoUdpTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoUdpTraceBrokerPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoUdpTraceBrokerPlugin.class)
    public JAXBElement<DtoUdpTraceBrokerPlugin.Next> createDtoUdpTraceBrokerPluginNext(DtoUdpTraceBrokerPlugin.Next value) {
        return new JAXBElement<DtoUdpTraceBrokerPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoUdpTraceBrokerPlugin.Next.class, DtoUdpTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.StaticallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "staticallyIncludedDestinations", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.StaticallyIncludedDestinations> createDtoLdapNetworkConnectorStaticallyIncludedDestinations(DtoLdapNetworkConnector.StaticallyIncludedDestinations value) {
        return new JAXBElement<DtoLdapNetworkConnector.StaticallyIncludedDestinations>(_DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME, DtoLdapNetworkConnector.StaticallyIncludedDestinations.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.BrokerService> createDtoLdapNetworkConnectorBrokerService(DtoLdapNetworkConnector.BrokerService value) {
        return new JAXBElement<DtoLdapNetworkConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoLdapNetworkConnector.BrokerService.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.DurableDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "durableDestinations", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.DurableDestinations> createDtoLdapNetworkConnectorDurableDestinations(DtoLdapNetworkConnector.DurableDestinations value) {
        return new JAXBElement<DtoLdapNetworkConnector.DurableDestinations>(_DtoLdapNetworkConnectorDurableDestinations_QNAME, DtoLdapNetworkConnector.DurableDestinations.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.DynamicallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dynamicallyIncludedDestinations", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.DynamicallyIncludedDestinations> createDtoLdapNetworkConnectorDynamicallyIncludedDestinations(DtoLdapNetworkConnector.DynamicallyIncludedDestinations value) {
        return new JAXBElement<DtoLdapNetworkConnector.DynamicallyIncludedDestinations>(_DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME, DtoLdapNetworkConnector.DynamicallyIncludedDestinations.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.ExcludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "excludedDestinations", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.ExcludedDestinations> createDtoLdapNetworkConnectorExcludedDestinations(DtoLdapNetworkConnector.ExcludedDestinations value) {
        return new JAXBElement<DtoLdapNetworkConnector.ExcludedDestinations>(_DtoLdapNetworkConnectorExcludedDestinations_QNAME, DtoLdapNetworkConnector.ExcludedDestinations.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.BridgeFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "bridgeFactory", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.BridgeFactory> createDtoLdapNetworkConnectorBridgeFactory(DtoLdapNetworkConnector.BridgeFactory value) {
        return new JAXBElement<DtoLdapNetworkConnector.BridgeFactory>(_DtoLdapNetworkConnectorBridgeFactory_QNAME, DtoLdapNetworkConnector.BridgeFactory.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLdapNetworkConnector.ConnectionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionFilter", scope = DtoLdapNetworkConnector.class)
    public JAXBElement<DtoLdapNetworkConnector.ConnectionFilter> createDtoLdapNetworkConnectorConnectionFilter(DtoLdapNetworkConnector.ConnectionFilter value) {
        return new JAXBElement<DtoLdapNetworkConnector.ConnectionFilter>(_DtoLdapNetworkConnectorConnectionFilter_QNAME, DtoLdapNetworkConnector.ConnectionFilter.class, DtoLdapNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRetainedMessageSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoRetainedMessageSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoRetainedMessageSubscriptionRecoveryPolicy.Broker> createDtoRetainedMessageSubscriptionRecoveryPolicyBroker(DtoRetainedMessageSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoRetainedMessageSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoRetainedMessageSubscriptionRecoveryPolicy.Broker.class, DtoRetainedMessageSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wrapped", scope = DtoRetainedMessageSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped> createDtoRetainedMessageSubscriptionRecoveryPolicyWrapped(DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped value) {
        return new JAXBElement<DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped>(_DtoRetainedMessageSubscriptionRecoveryPolicyWrapped_QNAME, DtoRetainedMessageSubscriptionRecoveryPolicy.Wrapped.class, DtoRetainedMessageSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoForwardingBridge.NetworkBridgeFailedListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkBridgeFailedListener", scope = DtoForwardingBridge.class)
    public JAXBElement<DtoForwardingBridge.NetworkBridgeFailedListener> createDtoForwardingBridgeNetworkBridgeFailedListener(DtoForwardingBridge.NetworkBridgeFailedListener value) {
        return new JAXBElement<DtoForwardingBridge.NetworkBridgeFailedListener>(_DtoForwardingBridgeNetworkBridgeFailedListener_QNAME, DtoForwardingBridge.NetworkBridgeFailedListener.class, DtoForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoForwardingBridge.LocalBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localBroker", scope = DtoForwardingBridge.class)
    public JAXBElement<DtoForwardingBridge.LocalBroker> createDtoForwardingBridgeLocalBroker(DtoForwardingBridge.LocalBroker value) {
        return new JAXBElement<DtoForwardingBridge.LocalBroker>(_DtoForwardingBridgeLocalBroker_QNAME, DtoForwardingBridge.LocalBroker.class, DtoForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoForwardingBridge.RemoteBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "remoteBroker", scope = DtoForwardingBridge.class)
    public JAXBElement<DtoForwardingBridge.RemoteBroker> createDtoForwardingBridgeRemoteBroker(DtoForwardingBridge.RemoteBroker value) {
        return new JAXBElement<DtoForwardingBridge.RemoteBroker>(_DtoForwardingBridgeRemoteBroker_QNAME, DtoForwardingBridge.RemoteBroker.class, DtoForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastTraceBrokerPlugin.WireFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wireFormat", scope = DtoMulticastTraceBrokerPlugin.class)
    public JAXBElement<DtoMulticastTraceBrokerPlugin.WireFormat> createDtoMulticastTraceBrokerPluginWireFormat(DtoMulticastTraceBrokerPlugin.WireFormat value) {
        return new JAXBElement<DtoMulticastTraceBrokerPlugin.WireFormat>(_DtoUdpTraceBrokerPluginWireFormat_QNAME, DtoMulticastTraceBrokerPlugin.WireFormat.class, DtoMulticastTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastTraceBrokerPlugin.WireFormatFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wireFormatFactory", scope = DtoMulticastTraceBrokerPlugin.class)
    public JAXBElement<DtoMulticastTraceBrokerPlugin.WireFormatFactory> createDtoMulticastTraceBrokerPluginWireFormatFactory(DtoMulticastTraceBrokerPlugin.WireFormatFactory value) {
        return new JAXBElement<DtoMulticastTraceBrokerPlugin.WireFormatFactory>(_DtoUdpTraceBrokerPluginWireFormatFactory_QNAME, DtoMulticastTraceBrokerPlugin.WireFormatFactory.class, DtoMulticastTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastTraceBrokerPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoMulticastTraceBrokerPlugin.class)
    public JAXBElement<DtoMulticastTraceBrokerPlugin.AdminConnectionContext> createDtoMulticastTraceBrokerPluginAdminConnectionContext(DtoMulticastTraceBrokerPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoMulticastTraceBrokerPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoMulticastTraceBrokerPlugin.AdminConnectionContext.class, DtoMulticastTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastTraceBrokerPlugin.Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "address", scope = DtoMulticastTraceBrokerPlugin.class)
    public JAXBElement<DtoMulticastTraceBrokerPlugin.Address> createDtoMulticastTraceBrokerPluginAddress(DtoMulticastTraceBrokerPlugin.Address value) {
        return new JAXBElement<DtoMulticastTraceBrokerPlugin.Address>(_DtoUdpTraceBrokerPluginAddress_QNAME, DtoMulticastTraceBrokerPlugin.Address.class, DtoMulticastTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastTraceBrokerPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoMulticastTraceBrokerPlugin.class)
    public JAXBElement<DtoMulticastTraceBrokerPlugin.Next> createDtoMulticastTraceBrokerPluginNext(DtoMulticastTraceBrokerPlugin.Next value) {
        return new JAXBElement<DtoMulticastTraceBrokerPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoMulticastTraceBrokerPlugin.Next.class, DtoMulticastTraceBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeQueue.ForwardTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "forwardTo", scope = DtoCompositeQueue.class)
    public JAXBElement<DtoCompositeQueue.ForwardTo> createDtoCompositeQueueForwardTo(DtoCompositeQueue.ForwardTo value) {
        return new JAXBElement<DtoCompositeQueue.ForwardTo>(_DtoCompositeQueueForwardTo_QNAME, DtoCompositeQueue.ForwardTo.class, DtoCompositeQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationEntry.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoDestinationEntry.class)
    public JAXBElement<DtoDestinationEntry.Destination> createDtoDestinationEntryDestination(DtoDestinationEntry.Destination value) {
        return new JAXBElement<DtoDestinationEntry.Destination>(_DtoDestinationEntryDestination_QNAME, DtoDestinationEntry.Destination.class, DtoDestinationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationEntry.Value }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "value", scope = DtoDestinationEntry.class)
    public JAXBElement<DtoDestinationEntry.Value> createDtoDestinationEntryValue(DtoDestinationEntry.Value value) {
        return new JAXBElement<DtoDestinationEntry.Value>(_DtoDestinationEntryValue_QNAME, DtoDestinationEntry.Value.class, DtoDestinationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleDispatchSelector.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoSimpleDispatchSelector.class)
    public JAXBElement<DtoSimpleDispatchSelector.Destination> createDtoSimpleDispatchSelectorDestination(DtoSimpleDispatchSelector.Destination value) {
        return new JAXBElement<DtoSimpleDispatchSelector.Destination>(_DtoDestinationEntryDestination_QNAME, DtoSimpleDispatchSelector.Destination.class, DtoSimpleDispatchSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueueDispatchSelector.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoQueueDispatchSelector.class)
    public JAXBElement<DtoQueueDispatchSelector.Destination> createDtoQueueDispatchSelectorDestination(DtoQueueDispatchSelector.Destination value) {
        return new JAXBElement<DtoQueueDispatchSelector.Destination>(_DtoDestinationEntryDestination_QNAME, DtoQueueDispatchSelector.Destination.class, DtoQueueDispatchSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueueDispatchSelector.ExclusiveConsumer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "exclusiveConsumer", scope = DtoQueueDispatchSelector.class)
    public JAXBElement<DtoQueueDispatchSelector.ExclusiveConsumer> createDtoQueueDispatchSelectorExclusiveConsumer(DtoQueueDispatchSelector.ExclusiveConsumer value) {
        return new JAXBElement<DtoQueueDispatchSelector.ExclusiveConsumer>(_DtoQueueDispatchSelectorExclusiveConsumer_QNAME, DtoQueueDispatchSelector.ExclusiveConsumer.class, DtoQueueDispatchSelector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.Users }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "users", scope = DtoSimpleAuthenticationPlugin.class)
    public JAXBElement<DtoSimpleAuthenticationPlugin.Users> createDtoSimpleAuthenticationPluginUsers(DtoSimpleAuthenticationPlugin.Users value) {
        return new JAXBElement<DtoSimpleAuthenticationPlugin.Users>(_DtoSimpleAuthenticationPluginUsers_QNAME, DtoSimpleAuthenticationPlugin.Users.class, DtoSimpleAuthenticationPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.UserPasswords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "userPasswords", scope = DtoSimpleAuthenticationPlugin.class)
    public JAXBElement<DtoSimpleAuthenticationPlugin.UserPasswords> createDtoSimpleAuthenticationPluginUserPasswords(DtoSimpleAuthenticationPlugin.UserPasswords value) {
        return new JAXBElement<DtoSimpleAuthenticationPlugin.UserPasswords>(_DtoSimpleAuthenticationPluginUserPasswords_QNAME, DtoSimpleAuthenticationPlugin.UserPasswords.class, DtoSimpleAuthenticationPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthenticationPlugin.UserGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "userGroups", scope = DtoSimpleAuthenticationPlugin.class)
    public JAXBElement<DtoSimpleAuthenticationPlugin.UserGroups> createDtoSimpleAuthenticationPluginUserGroups(DtoSimpleAuthenticationPlugin.UserGroups value) {
        return new JAXBElement<DtoSimpleAuthenticationPlugin.UserGroups>(_DtoSimpleAuthenticationPluginUserGroups_QNAME, DtoSimpleAuthenticationPlugin.UserGroups.class, DtoSimpleAuthenticationPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJDBCIOExceptionHandler.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJDBCIOExceptionHandler.class)
    public JAXBElement<DtoJDBCIOExceptionHandler.BrokerService> createDtoJDBCIOExceptionHandlerBrokerService(DtoJDBCIOExceptionHandler.BrokerService value) {
        return new JAXBElement<DtoJDBCIOExceptionHandler.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJDBCIOExceptionHandler.BrokerService.class, DtoJDBCIOExceptionHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeTopic.ForwardTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "forwardTo", scope = DtoCompositeTopic.class)
    public JAXBElement<DtoCompositeTopic.ForwardTo> createDtoCompositeTopicForwardTo(DtoCompositeTopic.ForwardTo value) {
        return new JAXBElement<DtoCompositeTopic.ForwardTo>(_DtoCompositeQueueForwardTo_QNAME, DtoCompositeTopic.ForwardTo.class, DtoCompositeTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempDestinationAuthorizationEntry.WriteACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "writeACLs", scope = DtoTempDestinationAuthorizationEntry.class)
    public JAXBElement<DtoTempDestinationAuthorizationEntry.WriteACLs> createDtoTempDestinationAuthorizationEntryWriteACLs(DtoTempDestinationAuthorizationEntry.WriteACLs value) {
        return new JAXBElement<DtoTempDestinationAuthorizationEntry.WriteACLs>(_DtoTempDestinationAuthorizationEntryWriteACLs_QNAME, DtoTempDestinationAuthorizationEntry.WriteACLs.class, DtoTempDestinationAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempDestinationAuthorizationEntry.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoTempDestinationAuthorizationEntry.class)
    public JAXBElement<DtoTempDestinationAuthorizationEntry.Destination> createDtoTempDestinationAuthorizationEntryDestination(DtoTempDestinationAuthorizationEntry.Destination value) {
        return new JAXBElement<DtoTempDestinationAuthorizationEntry.Destination>(_DtoDestinationEntryDestination_QNAME, DtoTempDestinationAuthorizationEntry.Destination.class, DtoTempDestinationAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempDestinationAuthorizationEntry.ReadACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "readACLs", scope = DtoTempDestinationAuthorizationEntry.class)
    public JAXBElement<DtoTempDestinationAuthorizationEntry.ReadACLs> createDtoTempDestinationAuthorizationEntryReadACLs(DtoTempDestinationAuthorizationEntry.ReadACLs value) {
        return new JAXBElement<DtoTempDestinationAuthorizationEntry.ReadACLs>(_DtoTempDestinationAuthorizationEntryReadACLs_QNAME, DtoTempDestinationAuthorizationEntry.ReadACLs.class, DtoTempDestinationAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempDestinationAuthorizationEntry.AdminACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminACLs", scope = DtoTempDestinationAuthorizationEntry.class)
    public JAXBElement<DtoTempDestinationAuthorizationEntry.AdminACLs> createDtoTempDestinationAuthorizationEntryAdminACLs(DtoTempDestinationAuthorizationEntry.AdminACLs value) {
        return new JAXBElement<DtoTempDestinationAuthorizationEntry.AdminACLs>(_DtoTempDestinationAuthorizationEntryAdminACLs_QNAME, DtoTempDestinationAuthorizationEntry.AdminACLs.class, DtoTempDestinationAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMemoryPersistenceAdapter.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoMemoryPersistenceAdapter.class)
    public JAXBElement<DtoMemoryPersistenceAdapter.UsageManager> createDtoMemoryPersistenceAdapterUsageManager(DtoMemoryPersistenceAdapter.UsageManager value) {
        return new JAXBElement<DtoMemoryPersistenceAdapter.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoMemoryPersistenceAdapter.UsageManager.class, DtoMemoryPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.LocalTopicConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localTopicConnection", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.LocalTopicConnection> createDtoJmsTopicConnectorLocalTopicConnection(DtoJmsTopicConnector.LocalTopicConnection value) {
        return new JAXBElement<DtoJmsTopicConnector.LocalTopicConnection>(_DtoJmsTopicConnectorLocalTopicConnection_QNAME, DtoJmsTopicConnector.LocalTopicConnection.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.OutboundTopicConnectionFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundTopicConnectionFactory", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.OutboundTopicConnectionFactory> createDtoJmsTopicConnectorOutboundTopicConnectionFactory(DtoJmsTopicConnector.OutboundTopicConnectionFactory value) {
        return new JAXBElement<DtoJmsTopicConnector.OutboundTopicConnectionFactory>(_DtoJmsTopicConnectorOutboundTopicConnectionFactory_QNAME, DtoJmsTopicConnector.OutboundTopicConnectionFactory.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.InboundTopicBridges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "inboundTopicBridges", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.InboundTopicBridges> createDtoJmsTopicConnectorInboundTopicBridges(DtoJmsTopicConnector.InboundTopicBridges value) {
        return new JAXBElement<DtoJmsTopicConnector.InboundTopicBridges>(_DtoJmsTopicConnectorInboundTopicBridges_QNAME, DtoJmsTopicConnector.InboundTopicBridges.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.OutboundTopicBridges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundTopicBridges", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.OutboundTopicBridges> createDtoJmsTopicConnectorOutboundTopicBridges(DtoJmsTopicConnector.OutboundTopicBridges value) {
        return new JAXBElement<DtoJmsTopicConnector.OutboundTopicBridges>(_DtoJmsTopicConnectorOutboundTopicBridges_QNAME, DtoJmsTopicConnector.OutboundTopicBridges.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.BrokerService> createDtoJmsTopicConnectorBrokerService(DtoJmsTopicConnector.BrokerService value) {
        return new JAXBElement<DtoJmsTopicConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJmsTopicConnector.BrokerService.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.InboundMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "inboundMessageConvertor", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.InboundMessageConvertor> createDtoJmsTopicConnectorInboundMessageConvertor(DtoJmsTopicConnector.InboundMessageConvertor value) {
        return new JAXBElement<DtoJmsTopicConnector.InboundMessageConvertor>(_DtoJmsTopicConnectorInboundMessageConvertor_QNAME, DtoJmsTopicConnector.InboundMessageConvertor.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.ReconnectionPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "reconnectionPolicy", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.ReconnectionPolicy> createDtoJmsTopicConnectorReconnectionPolicy(DtoJmsTopicConnector.ReconnectionPolicy value) {
        return new JAXBElement<DtoJmsTopicConnector.ReconnectionPolicy>(_DtoJmsTopicConnectorReconnectionPolicy_QNAME, DtoJmsTopicConnector.ReconnectionPolicy.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.OutboundMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundMessageConvertor", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.OutboundMessageConvertor> createDtoJmsTopicConnectorOutboundMessageConvertor(DtoJmsTopicConnector.OutboundMessageConvertor value) {
        return new JAXBElement<DtoJmsTopicConnector.OutboundMessageConvertor>(_DtoJmsTopicConnectorOutboundMessageConvertor_QNAME, DtoJmsTopicConnector.OutboundMessageConvertor.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.LocalTopicConnectionFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localTopicConnectionFactory", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.LocalTopicConnectionFactory> createDtoJmsTopicConnectorLocalTopicConnectionFactory(DtoJmsTopicConnector.LocalTopicConnectionFactory value) {
        return new JAXBElement<DtoJmsTopicConnector.LocalTopicConnectionFactory>(_DtoJmsTopicConnectorLocalTopicConnectionFactory_QNAME, DtoJmsTopicConnector.LocalTopicConnectionFactory.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsTopicConnector.OutboundTopicConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundTopicConnection", scope = DtoJmsTopicConnector.class)
    public JAXBElement<DtoJmsTopicConnector.OutboundTopicConnection> createDtoJmsTopicConnectorOutboundTopicConnection(DtoJmsTopicConnector.OutboundTopicConnection value) {
        return new JAXBElement<DtoJmsTopicConnector.OutboundTopicConnection>(_DtoJmsTopicConnectorOutboundTopicConnection_QNAME, DtoJmsTopicConnector.OutboundTopicConnection.class, DtoJmsTopicConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLastImageSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoLastImageSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoLastImageSubscriptionRecoveryPolicy.Broker> createDtoLastImageSubscriptionRecoveryPolicyBroker(DtoLastImageSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoLastImageSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoLastImageSubscriptionRecoveryPolicy.Broker.class, DtoLastImageSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoProxyConnector.Server }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "server", scope = DtoProxyConnector.class)
    public JAXBElement<DtoProxyConnector.Server> createDtoProxyConnectorServer(DtoProxyConnector.Server value) {
        return new JAXBElement<DtoProxyConnector.Server>(_DtoManagementContextServer_QNAME, DtoProxyConnector.Server.class, DtoProxyConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueryBasedSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoQueryBasedSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoQueryBasedSubscriptionRecoveryPolicy.Broker> createDtoQueryBasedSubscriptionRecoveryPolicyBroker(DtoQueryBasedSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoQueryBasedSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoQueryBasedSubscriptionRecoveryPolicy.Broker.class, DtoQueryBasedSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueryBasedSubscriptionRecoveryPolicy.Query }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "query", scope = DtoQueryBasedSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoQueryBasedSubscriptionRecoveryPolicy.Query> createDtoQueryBasedSubscriptionRecoveryPolicyQuery(DtoQueryBasedSubscriptionRecoveryPolicy.Query value) {
        return new JAXBElement<DtoQueryBasedSubscriptionRecoveryPolicy.Query>(_DtoQueryBasedSubscriptionRecoveryPolicyQuery_QNAME, DtoQueryBasedSubscriptionRecoveryPolicy.Query.class, DtoQueryBasedSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.PublishedAddressPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "publishedAddressPolicy", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.PublishedAddressPolicy> createDtoTransportConnectorPublishedAddressPolicy(DtoTransportConnector.PublishedAddressPolicy value) {
        return new JAXBElement<DtoTransportConnector.PublishedAddressPolicy>(_DtoTransportConnectorPublishedAddressPolicy_QNAME, DtoTransportConnector.PublishedAddressPolicy.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.DiscoveryAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "discoveryAgent", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.DiscoveryAgent> createDtoTransportConnectorDiscoveryAgent(DtoTransportConnector.DiscoveryAgent value) {
        return new JAXBElement<DtoTransportConnector.DiscoveryAgent>(_DtoTransportConnectorDiscoveryAgent_QNAME, DtoTransportConnector.DiscoveryAgent.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.MessageAuthorizationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "messageAuthorizationPolicy", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.MessageAuthorizationPolicy> createDtoTransportConnectorMessageAuthorizationPolicy(DtoTransportConnector.MessageAuthorizationPolicy value) {
        return new JAXBElement<DtoTransportConnector.MessageAuthorizationPolicy>(_DtoBrokerMessageAuthorizationPolicy_QNAME, DtoTransportConnector.MessageAuthorizationPolicy.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.BrokerService> createDtoTransportConnectorBrokerService(DtoTransportConnector.BrokerService value) {
        return new JAXBElement<DtoTransportConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoTransportConnector.BrokerService.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.TaskRunnerFactory> createDtoTransportConnectorTaskRunnerFactory(DtoTransportConnector.TaskRunnerFactory value) {
        return new JAXBElement<DtoTransportConnector.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoTransportConnector.TaskRunnerFactory.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.BrokerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerInfo", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.BrokerInfo> createDtoTransportConnectorBrokerInfo(DtoTransportConnector.BrokerInfo value) {
        return new JAXBElement<DtoTransportConnector.BrokerInfo>(_DtoTransportConnectorBrokerInfo_QNAME, DtoTransportConnector.BrokerInfo.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransportConnector.Server }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "server", scope = DtoTransportConnector.class)
    public JAXBElement<DtoTransportConnector.Server> createDtoTransportConnectorServer(DtoTransportConnector.Server value) {
        return new JAXBElement<DtoTransportConnector.Server>(_DtoManagementContextServer_QNAME, DtoTransportConnector.Server.class, DtoTransportConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingMessageLimitStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "pendingMessageLimitStrategy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.PendingMessageLimitStrategy> createDtoPolicyEntryPendingMessageLimitStrategy(DtoPolicyEntry.PendingMessageLimitStrategy value) {
        return new JAXBElement<DtoPolicyEntry.PendingMessageLimitStrategy>(_DtoPolicyEntryPendingMessageLimitStrategy_QNAME, DtoPolicyEntry.PendingMessageLimitStrategy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingQueuePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "pendingQueuePolicy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.PendingQueuePolicy> createDtoPolicyEntryPendingQueuePolicy(DtoPolicyEntry.PendingQueuePolicy value) {
        return new JAXBElement<DtoPolicyEntry.PendingQueuePolicy>(_DtoPolicyEntryPendingQueuePolicy_QNAME, DtoPolicyEntry.PendingQueuePolicy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.SubscriptionRecoveryPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "subscriptionRecoveryPolicy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.SubscriptionRecoveryPolicy> createDtoPolicyEntrySubscriptionRecoveryPolicy(DtoPolicyEntry.SubscriptionRecoveryPolicy value) {
        return new JAXBElement<DtoPolicyEntry.SubscriptionRecoveryPolicy>(_DtoPolicyEntrySubscriptionRecoveryPolicy_QNAME, DtoPolicyEntry.SubscriptionRecoveryPolicy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.NetworkBridgeFilterFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkBridgeFilterFactory", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.NetworkBridgeFilterFactory> createDtoPolicyEntryNetworkBridgeFilterFactory(DtoPolicyEntry.NetworkBridgeFilterFactory value) {
        return new JAXBElement<DtoPolicyEntry.NetworkBridgeFilterFactory>(_DtoPolicyEntryNetworkBridgeFilterFactory_QNAME, DtoPolicyEntry.NetworkBridgeFilterFactory.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.Destination> createDtoPolicyEntryDestination(DtoPolicyEntry.Destination value) {
        return new JAXBElement<DtoPolicyEntry.Destination>(_DtoDestinationEntryDestination_QNAME, DtoPolicyEntry.Destination.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingDurableSubscriberPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "pendingDurableSubscriberPolicy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.PendingDurableSubscriberPolicy> createDtoPolicyEntryPendingDurableSubscriberPolicy(DtoPolicyEntry.PendingDurableSubscriberPolicy value) {
        return new JAXBElement<DtoPolicyEntry.PendingDurableSubscriberPolicy>(_DtoPolicyEntryPendingDurableSubscriberPolicy_QNAME, DtoPolicyEntry.PendingDurableSubscriberPolicy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.SlowConsumerStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "slowConsumerStrategy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.SlowConsumerStrategy> createDtoPolicyEntrySlowConsumerStrategy(DtoPolicyEntry.SlowConsumerStrategy value) {
        return new JAXBElement<DtoPolicyEntry.SlowConsumerStrategy>(_DtoPolicyEntrySlowConsumerStrategy_QNAME, DtoPolicyEntry.SlowConsumerStrategy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.DeadLetterStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "deadLetterStrategy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.DeadLetterStrategy> createDtoPolicyEntryDeadLetterStrategy(DtoPolicyEntry.DeadLetterStrategy value) {
        return new JAXBElement<DtoPolicyEntry.DeadLetterStrategy>(_DtoPolicyEntryDeadLetterStrategy_QNAME, DtoPolicyEntry.DeadLetterStrategy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.DispatchPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dispatchPolicy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.DispatchPolicy> createDtoPolicyEntryDispatchPolicy(DtoPolicyEntry.DispatchPolicy value) {
        return new JAXBElement<DtoPolicyEntry.DispatchPolicy>(_DtoPolicyEntryDispatchPolicy_QNAME, DtoPolicyEntry.DispatchPolicy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.MessageGroupMapFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "messageGroupMapFactory", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.MessageGroupMapFactory> createDtoPolicyEntryMessageGroupMapFactory(DtoPolicyEntry.MessageGroupMapFactory value) {
        return new JAXBElement<DtoPolicyEntry.MessageGroupMapFactory>(_DtoPolicyEntryMessageGroupMapFactory_QNAME, DtoPolicyEntry.MessageGroupMapFactory.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.PendingSubscriberPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "pendingSubscriberPolicy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.PendingSubscriberPolicy> createDtoPolicyEntryPendingSubscriberPolicy(DtoPolicyEntry.PendingSubscriberPolicy value) {
        return new JAXBElement<DtoPolicyEntry.PendingSubscriberPolicy>(_DtoPolicyEntryPendingSubscriberPolicy_QNAME, DtoPolicyEntry.PendingSubscriberPolicy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyEntry.MessageEvictionStrategy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "messageEvictionStrategy", scope = DtoPolicyEntry.class)
    public JAXBElement<DtoPolicyEntry.MessageEvictionStrategy> createDtoPolicyEntryMessageEvictionStrategy(DtoPolicyEntry.MessageEvictionStrategy value) {
        return new JAXBElement<DtoPolicyEntry.MessageEvictionStrategy>(_DtoPolicyEntryMessageEvictionStrategy_QNAME, DtoPolicyEntry.MessageEvictionStrategy.class, DtoPolicyEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPolicy.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoRedeliveryPolicy.class)
    public JAXBElement<DtoRedeliveryPolicy.Destination> createDtoRedeliveryPolicyDestination(DtoRedeliveryPolicy.Destination value) {
        return new JAXBElement<DtoRedeliveryPolicy.Destination>(_DtoDestinationEntryDestination_QNAME, DtoRedeliveryPolicy.Destination.class, DtoRedeliveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationPathSeparatorPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoDestinationPathSeparatorPlugin.class)
    public JAXBElement<DtoDestinationPathSeparatorPlugin.AdminConnectionContext> createDtoDestinationPathSeparatorPluginAdminConnectionContext(DtoDestinationPathSeparatorPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoDestinationPathSeparatorPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoDestinationPathSeparatorPlugin.AdminConnectionContext.class, DtoDestinationPathSeparatorPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationPathSeparatorPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoDestinationPathSeparatorPlugin.class)
    public JAXBElement<DtoDestinationPathSeparatorPlugin.Next> createDtoDestinationPathSeparatorPluginNext(DtoDestinationPathSeparatorPlugin.Next value) {
        return new JAXBElement<DtoDestinationPathSeparatorPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoDestinationPathSeparatorPlugin.Next.class, DtoDestinationPathSeparatorPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMysqlJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoMysqlJdbcAdapter.class)
    public JAXBElement<DtoMysqlJdbcAdapter.Statements> createDtoMysqlJdbcAdapterStatements(DtoMysqlJdbcAdapter.Statements value) {
        return new JAXBElement<DtoMysqlJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoMysqlJdbcAdapter.Statements.class, DtoMysqlJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationPlugin.Map }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "map", scope = DtoAuthorizationPlugin.class)
    public JAXBElement<DtoAuthorizationPlugin.Map> createDtoAuthorizationPluginMap(DtoAuthorizationPlugin.Map value) {
        return new JAXBElement<DtoAuthorizationPlugin.Map>(_DtoAuthorizationPluginMap_QNAME, DtoAuthorizationPlugin.Map.class, DtoAuthorizationPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.PersistenceTaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceTaskRunnerFactory", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.PersistenceTaskRunnerFactory> createDtoBrokerServicePersistenceTaskRunnerFactory(DtoBrokerService.PersistenceTaskRunnerFactory value) {
        return new JAXBElement<DtoBrokerService.PersistenceTaskRunnerFactory>(_DtoBrokerPersistenceTaskRunnerFactory_QNAME, DtoBrokerService.PersistenceTaskRunnerFactory.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.DestinationInterceptors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationInterceptors", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.DestinationInterceptors> createDtoBrokerServiceDestinationInterceptors(DtoBrokerService.DestinationInterceptors value) {
        return new JAXBElement<DtoBrokerService.DestinationInterceptors>(_DtoBrokerDestinationInterceptors_QNAME, DtoBrokerService.DestinationInterceptors.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.MessageAuthorizationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "messageAuthorizationPolicy", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.MessageAuthorizationPolicy> createDtoBrokerServiceMessageAuthorizationPolicy(DtoBrokerService.MessageAuthorizationPolicy value) {
        return new JAXBElement<DtoBrokerService.MessageAuthorizationPolicy>(_DtoBrokerMessageAuthorizationPolicy_QNAME, DtoBrokerService.MessageAuthorizationPolicy.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.NetworkConnectorURIs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkConnectorURIs", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.NetworkConnectorURIs> createDtoBrokerServiceNetworkConnectorURIs(DtoBrokerService.NetworkConnectorURIs value) {
        return new JAXBElement<DtoBrokerService.NetworkConnectorURIs>(_DtoBrokerNetworkConnectorURIs_QNAME, DtoBrokerService.NetworkConnectorURIs.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.TransportConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportConnectors", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.TransportConnectors> createDtoBrokerServiceTransportConnectors(DtoBrokerService.TransportConnectors value) {
        return new JAXBElement<DtoBrokerService.TransportConnectors>(_DtoBrokerTransportConnectors_QNAME, DtoBrokerService.TransportConnectors.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.StartException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "startException", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.StartException> createDtoBrokerServiceStartException(DtoBrokerService.StartException value) {
        return new JAXBElement<DtoBrokerService.StartException>(_DtoBrokerStartException_QNAME, DtoBrokerService.StartException.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.NetworkConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkConnectors", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.NetworkConnectors> createDtoBrokerServiceNetworkConnectors(DtoBrokerService.NetworkConnectors value) {
        return new JAXBElement<DtoBrokerService.NetworkConnectors>(_DtoBrokerNetworkConnectors_QNAME, DtoBrokerService.NetworkConnectors.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.RegionBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "regionBroker", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.RegionBroker> createDtoBrokerServiceRegionBroker(DtoBrokerService.RegionBroker value) {
        return new JAXBElement<DtoBrokerService.RegionBroker>(_DtoBrokerRegionBroker_QNAME, DtoBrokerService.RegionBroker.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.TempDataStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempDataStore", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.TempDataStore> createDtoBrokerServiceTempDataStore(DtoBrokerService.TempDataStore value) {
        return new JAXBElement<DtoBrokerService.TempDataStore>(_DtoBrokerTempDataStore_QNAME, DtoBrokerService.TempDataStore.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.JobSchedulerStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jobSchedulerStore", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.JobSchedulerStore> createDtoBrokerServiceJobSchedulerStore(DtoBrokerService.JobSchedulerStore value) {
        return new JAXBElement<DtoBrokerService.JobSchedulerStore>(_DtoSystemUsageJobSchedulerStore_QNAME, DtoBrokerService.JobSchedulerStore.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.Services }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "services", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.Services> createDtoBrokerServiceServices(DtoBrokerService.Services value) {
        return new JAXBElement<DtoBrokerService.Services>(_DtoBrokerServices_QNAME, DtoBrokerService.Services.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.SslContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "sslContext", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.SslContext> createDtoBrokerServiceSslContext(DtoBrokerService.SslContext value) {
        return new JAXBElement<DtoBrokerService.SslContext>(_DtoBrokerSslContext_QNAME, DtoBrokerService.SslContext.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.ShutdownHooks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "shutdownHooks", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.ShutdownHooks> createDtoBrokerServiceShutdownHooks(DtoBrokerService.ShutdownHooks value) {
        return new JAXBElement<DtoBrokerService.ShutdownHooks>(_DtoBrokerShutdownHooks_QNAME, DtoBrokerService.ShutdownHooks.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.JmsBridgeConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsBridgeConnectors", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.JmsBridgeConnectors> createDtoBrokerServiceJmsBridgeConnectors(DtoBrokerService.JmsBridgeConnectors value) {
        return new JAXBElement<DtoBrokerService.JmsBridgeConnectors>(_DtoBrokerJmsBridgeConnectors_QNAME, DtoBrokerService.JmsBridgeConnectors.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.Destinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinations", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.Destinations> createDtoBrokerServiceDestinations(DtoBrokerService.Destinations value) {
        return new JAXBElement<DtoBrokerService.Destinations>(_DtoBrokerDestinations_QNAME, DtoBrokerService.Destinations.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.TransportConnectorURIs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportConnectorURIs", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.TransportConnectorURIs> createDtoBrokerServiceTransportConnectorURIs(DtoBrokerService.TransportConnectorURIs value) {
        return new JAXBElement<DtoBrokerService.TransportConnectorURIs>(_DtoBrokerTransportConnectorURIs_QNAME, DtoBrokerService.TransportConnectorURIs.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.AdminView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminView", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.AdminView> createDtoBrokerServiceAdminView(DtoBrokerService.AdminView value) {
        return new JAXBElement<DtoBrokerService.AdminView>(_DtoBrokerAdminView_QNAME, DtoBrokerService.AdminView.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.PersistenceAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceAdapter", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.PersistenceAdapter> createDtoBrokerServicePersistenceAdapter(DtoBrokerService.PersistenceAdapter value) {
        return new JAXBElement<DtoBrokerService.PersistenceAdapter>(_DtoBrokerPersistenceAdapter_QNAME, DtoBrokerService.PersistenceAdapter.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.ProducerSystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerSystemUsage", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.ProducerSystemUsage> createDtoBrokerServiceProducerSystemUsage(DtoBrokerService.ProducerSystemUsage value) {
        return new JAXBElement<DtoBrokerService.ProducerSystemUsage>(_DtoBrokerProducerSystemUsage_QNAME, DtoBrokerService.ProducerSystemUsage.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.ManagementContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "managementContext", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.ManagementContext> createDtoBrokerServiceManagementContext(DtoBrokerService.ManagementContext value) {
        return new JAXBElement<DtoBrokerService.ManagementContext>(_DtoBrokerManagementContext_QNAME, DtoBrokerService.ManagementContext.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.ProxyConnectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "proxyConnectors", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.ProxyConnectors> createDtoBrokerServiceProxyConnectors(DtoBrokerService.ProxyConnectors value) {
        return new JAXBElement<DtoBrokerService.ProxyConnectors>(_DtoBrokerProxyConnectors_QNAME, DtoBrokerService.ProxyConnectors.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.TaskRunnerFactory> createDtoBrokerServiceTaskRunnerFactory(DtoBrokerService.TaskRunnerFactory value) {
        return new JAXBElement<DtoBrokerService.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoBrokerService.TaskRunnerFactory.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.ConsumerSystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerSystemUsage", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.ConsumerSystemUsage> createDtoBrokerServiceConsumerSystemUsage(DtoBrokerService.ConsumerSystemUsage value) {
        return new JAXBElement<DtoBrokerService.ConsumerSystemUsage>(_DtoBrokerConsumerSystemUsage_QNAME, DtoBrokerService.ConsumerSystemUsage.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.IoExceptionHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "ioExceptionHandler", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.IoExceptionHandler> createDtoBrokerServiceIoExceptionHandler(DtoBrokerService.IoExceptionHandler value) {
        return new JAXBElement<DtoBrokerService.IoExceptionHandler>(_DtoBrokerIoExceptionHandler_QNAME, DtoBrokerService.IoExceptionHandler.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.DestinationPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationPolicy", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.DestinationPolicy> createDtoBrokerServiceDestinationPolicy(DtoBrokerService.DestinationPolicy value) {
        return new JAXBElement<DtoBrokerService.DestinationPolicy>(_DtoBrokerDestinationPolicy_QNAME, DtoBrokerService.DestinationPolicy.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.BrokerContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerContext", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.BrokerContext> createDtoBrokerServiceBrokerContext(DtoBrokerService.BrokerContext value) {
        return new JAXBElement<DtoBrokerService.BrokerContext>(_DtoBrokerBrokerContext_QNAME, DtoBrokerService.BrokerContext.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.SystemUsage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "systemUsage", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.SystemUsage> createDtoBrokerServiceSystemUsage(DtoBrokerService.SystemUsage value) {
        return new JAXBElement<DtoBrokerService.SystemUsage>(_DtoBrokerSystemUsage_QNAME, DtoBrokerService.SystemUsage.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.PersistenceFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceFactory", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.PersistenceFactory> createDtoBrokerServicePersistenceFactory(DtoBrokerService.PersistenceFactory value) {
        return new JAXBElement<DtoBrokerService.PersistenceFactory>(_DtoBrokerPersistenceFactory_QNAME, DtoBrokerService.PersistenceFactory.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.Plugins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "plugins", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.Plugins> createDtoBrokerServicePlugins(DtoBrokerService.Plugins value) {
        return new JAXBElement<DtoBrokerService.Plugins>(_DtoBrokerPlugins_QNAME, DtoBrokerService.Plugins.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBrokerService.DestinationFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destinationFactory", scope = DtoBrokerService.class)
    public JAXBElement<DtoBrokerService.DestinationFactory> createDtoBrokerServiceDestinationFactory(DtoBrokerService.DestinationFactory value) {
        return new JAXBElement<DtoBrokerService.DestinationFactory>(_DtoBrokerDestinationFactory_QNAME, DtoBrokerService.DestinationFactory.class, DtoBrokerService.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStoreUsage.Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "store", scope = DtoStoreUsage.class)
    public JAXBElement<DtoStoreUsage.Store> createDtoStoreUsageStore(DtoStoreUsage.Store value) {
        return new JAXBElement<DtoStoreUsage.Store>(_DtoTempUsageStore_QNAME, DtoStoreUsage.Store.class, DtoStoreUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStoreUsage.Parent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "parent", scope = DtoStoreUsage.class)
    public JAXBElement<DtoStoreUsage.Parent> createDtoStoreUsageParent(DtoStoreUsage.Parent value) {
        return new JAXBElement<DtoStoreUsage.Parent>(_DtoTempUsageParent_QNAME, DtoStoreUsage.Parent.class, DtoStoreUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStoreUsage.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoStoreUsage.class)
    public JAXBElement<DtoStoreUsage.Executor> createDtoStoreUsageExecutor(DtoStoreUsage.Executor value) {
        return new JAXBElement<DtoStoreUsage.Executor>(_DtoTempUsageExecutor_QNAME, DtoStoreUsage.Executor.class, DtoStoreUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStoreUsage.Limiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "limiter", scope = DtoStoreUsage.class)
    public JAXBElement<DtoStoreUsage.Limiter> createDtoStoreUsageLimiter(DtoStoreUsage.Limiter value) {
        return new JAXBElement<DtoStoreUsage.Limiter>(_DtoTempUsageLimiter_QNAME, DtoStoreUsage.Limiter.class, DtoStoreUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.StaticallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "staticallyIncludedDestinations", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.StaticallyIncludedDestinations> createDtoNetworkConnectorStaticallyIncludedDestinations(DtoNetworkConnector.StaticallyIncludedDestinations value) {
        return new JAXBElement<DtoNetworkConnector.StaticallyIncludedDestinations>(_DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME, DtoNetworkConnector.StaticallyIncludedDestinations.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DiscoveryAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "discoveryAgent", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.DiscoveryAgent> createDtoNetworkConnectorDiscoveryAgent(DtoNetworkConnector.DiscoveryAgent value) {
        return new JAXBElement<DtoNetworkConnector.DiscoveryAgent>(_DtoTransportConnectorDiscoveryAgent_QNAME, DtoNetworkConnector.DiscoveryAgent.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.BrokerService> createDtoNetworkConnectorBrokerService(DtoNetworkConnector.BrokerService value) {
        return new JAXBElement<DtoNetworkConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoNetworkConnector.BrokerService.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DurableDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "durableDestinations", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.DurableDestinations> createDtoNetworkConnectorDurableDestinations(DtoNetworkConnector.DurableDestinations value) {
        return new JAXBElement<DtoNetworkConnector.DurableDestinations>(_DtoLdapNetworkConnectorDurableDestinations_QNAME, DtoNetworkConnector.DurableDestinations.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.DynamicallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dynamicallyIncludedDestinations", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.DynamicallyIncludedDestinations> createDtoNetworkConnectorDynamicallyIncludedDestinations(DtoNetworkConnector.DynamicallyIncludedDestinations value) {
        return new JAXBElement<DtoNetworkConnector.DynamicallyIncludedDestinations>(_DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME, DtoNetworkConnector.DynamicallyIncludedDestinations.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.ExcludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "excludedDestinations", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.ExcludedDestinations> createDtoNetworkConnectorExcludedDestinations(DtoNetworkConnector.ExcludedDestinations value) {
        return new JAXBElement<DtoNetworkConnector.ExcludedDestinations>(_DtoLdapNetworkConnectorExcludedDestinations_QNAME, DtoNetworkConnector.ExcludedDestinations.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.BridgeFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "bridgeFactory", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.BridgeFactory> createDtoNetworkConnectorBridgeFactory(DtoNetworkConnector.BridgeFactory value) {
        return new JAXBElement<DtoNetworkConnector.BridgeFactory>(_DtoLdapNetworkConnectorBridgeFactory_QNAME, DtoNetworkConnector.BridgeFactory.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoNetworkConnector.ConnectionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionFilter", scope = DtoNetworkConnector.class)
    public JAXBElement<DtoNetworkConnector.ConnectionFilter> createDtoNetworkConnectorConnectionFilter(DtoNetworkConnector.ConnectionFilter value) {
        return new JAXBElement<DtoNetworkConnector.ConnectionFilter>(_DtoLdapNetworkConnectorConnectionFilter_QNAME, DtoNetworkConnector.ConnectionFilter.class, DtoNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStatements.DropSchemaStatements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dropSchemaStatements", scope = DtoStatements.class)
    public JAXBElement<DtoStatements.DropSchemaStatements> createDtoStatementsDropSchemaStatements(DtoStatements.DropSchemaStatements value) {
        return new JAXBElement<DtoStatements.DropSchemaStatements>(_DtoStatementsDropSchemaStatements_QNAME, DtoStatements.DropSchemaStatements.class, DtoStatements.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStatements.CreateSchemaStatements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "createSchemaStatements", scope = DtoStatements.class)
    public JAXBElement<DtoStatements.CreateSchemaStatements> createDtoStatementsCreateSchemaStatements(DtoStatements.CreateSchemaStatements value) {
        return new JAXBElement<DtoStatements.CreateSchemaStatements>(_DtoStatementsCreateSchemaStatements_QNAME, DtoStatements.CreateSchemaStatements.class, DtoStatements.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStatements.CreateLockSchemaStatements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "createLockSchemaStatements", scope = DtoStatements.class)
    public JAXBElement<DtoStatements.CreateLockSchemaStatements> createDtoStatementsCreateLockSchemaStatements(DtoStatements.CreateLockSchemaStatements value) {
        return new JAXBElement<DtoStatements.CreateLockSchemaStatements>(_DtoStatementsCreateLockSchemaStatements_QNAME, DtoStatements.CreateLockSchemaStatements.class, DtoStatements.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoHsqldbJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoHsqldbJdbcAdapter.class)
    public JAXBElement<DtoHsqldbJdbcAdapter.Statements> createDtoHsqldbJdbcAdapterStatements(DtoHsqldbJdbcAdapter.Statements value) {
        return new JAXBElement<DtoHsqldbJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoHsqldbJdbcAdapter.Statements.class, DtoHsqldbJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCamelEndpointLoader.Source }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "source", scope = DtoCamelEndpointLoader.class)
    public JAXBElement<DtoCamelEndpointLoader.Source> createDtoCamelEndpointLoaderSource(DtoCamelEndpointLoader.Source value) {
        return new JAXBElement<DtoCamelEndpointLoader.Source>(_DtoCamelEndpointLoaderSource_QNAME, DtoCamelEndpointLoader.Source.class, DtoCamelEndpointLoader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCamelEndpointLoader.Component }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "component", scope = DtoCamelEndpointLoader.class)
    public JAXBElement<DtoCamelEndpointLoader.Component> createDtoCamelEndpointLoaderComponent(DtoCamelEndpointLoader.Component value) {
        return new JAXBElement<DtoCamelEndpointLoader.Component>(_DtoCamelEndpointLoaderComponent_QNAME, DtoCamelEndpointLoader.Component.class, DtoCamelEndpointLoader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCamelEndpointLoader.CamelContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "camelContext", scope = DtoCamelEndpointLoader.class)
    public JAXBElement<DtoCamelEndpointLoader.CamelContext> createDtoCamelEndpointLoaderCamelContext(DtoCamelEndpointLoader.CamelContext value) {
        return new JAXBElement<DtoCamelEndpointLoader.CamelContext>(_DtoCamelEndpointLoaderCamelContext_QNAME, DtoCamelEndpointLoader.CamelContext.class, DtoCamelEndpointLoader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPartitionBrokerPlugin.Config }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "config", scope = DtoPartitionBrokerPlugin.class)
    public JAXBElement<DtoPartitionBrokerPlugin.Config> createDtoPartitionBrokerPluginConfig(DtoPartitionBrokerPlugin.Config value) {
        return new JAXBElement<DtoPartitionBrokerPlugin.Config>(_DtoPartitionBrokerPluginConfig_QNAME, DtoPartitionBrokerPlugin.Config.class, DtoPartitionBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.JdbcAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jdbcAdapter", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.JdbcAdapter> createDtoJournaledJDBCJdbcAdapter(DtoJournaledJDBC.JdbcAdapter value) {
        return new JAXBElement<DtoJournaledJDBC.JdbcAdapter>(_DtoJournaledJDBCJdbcAdapter_QNAME, DtoJournaledJDBC.JdbcAdapter.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.Statements> createDtoJournaledJDBCStatements(DtoJournaledJDBC.Statements value) {
        return new JAXBElement<DtoJournaledJDBC.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoJournaledJDBC.Statements.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.BrokerService> createDtoJournaledJDBCBrokerService(DtoJournaledJDBC.BrokerService value) {
        return new JAXBElement<DtoJournaledJDBC.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJournaledJDBC.BrokerService.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.Locker> createDtoJournaledJDBCLocker(DtoJournaledJDBC.Locker value) {
        return new JAXBElement<DtoJournaledJDBC.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoJournaledJDBC.Locker.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.DataSource> createDtoJournaledJDBCDataSource(DtoJournaledJDBC.DataSource value) {
        return new JAXBElement<DtoJournaledJDBC.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoJournaledJDBC.DataSource.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.TaskRunnerFactory> createDtoJournaledJDBCTaskRunnerFactory(DtoJournaledJDBC.TaskRunnerFactory value) {
        return new JAXBElement<DtoJournaledJDBC.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoJournaledJDBC.TaskRunnerFactory.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.Adapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adapter", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.Adapter> createDtoJournaledJDBCAdapter(DtoJournaledJDBC.Adapter value) {
        return new JAXBElement<DtoJournaledJDBC.Adapter>(_DtoSystemUsageAdapter_QNAME, DtoJournaledJDBC.Adapter.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.Journal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "journal", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.Journal> createDtoJournaledJDBCJournal(DtoJournaledJDBC.Journal value) {
        return new JAXBElement<DtoJournaledJDBC.Journal>(_DtoJournaledJDBCJournal_QNAME, DtoJournaledJDBC.Journal.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournaledJDBC.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoJournaledJDBC.class)
    public JAXBElement<DtoJournaledJDBC.ScheduledThreadPoolExecutor> createDtoJournaledJDBCScheduledThreadPoolExecutor(DtoJournaledJDBC.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoJournaledJDBC.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoJournaledJDBC.ScheduledThreadPoolExecutor.class, DtoJournaledJDBC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSslContext.SSLContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "SSLContext", scope = DtoSslContext.class)
    public JAXBElement<DtoSslContext.SSLContext> createDtoSslContextSSLContext(DtoSslContext.SSLContext value) {
        return new JAXBElement<DtoSslContext.SSLContext>(_DtoSslContextSSLContext_QNAME, DtoSslContext.SSLContext.class, DtoSslContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSslContext.KeyManagers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "keyManagers", scope = DtoSslContext.class)
    public JAXBElement<DtoSslContext.KeyManagers> createDtoSslContextKeyManagers(DtoSslContext.KeyManagers value) {
        return new JAXBElement<DtoSslContext.KeyManagers>(_DtoSslContextKeyManagers_QNAME, DtoSslContext.KeyManagers.class, DtoSslContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSslContext.TrustManagers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "trustManagers", scope = DtoSslContext.class)
    public JAXBElement<DtoSslContext.TrustManagers> createDtoSslContextTrustManagers(DtoSslContext.TrustManagers value) {
        return new JAXBElement<DtoSslContext.TrustManagers>(_DtoSslContextTrustManagers_QNAME, DtoSslContext.TrustManagers.class, DtoSslContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSslContext.SecureRandom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "secureRandom", scope = DtoSslContext.class)
    public JAXBElement<DtoSslContext.SecureRandom> createDtoSslContextSecureRandom(DtoSslContext.SecureRandom value) {
        return new JAXBElement<DtoSslContext.SecureRandom>(_DtoSslContextSecureRandom_QNAME, DtoSslContext.SecureRandom.class, DtoSslContext.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Store }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "store", scope = DtoJobSchedulerUsage.class)
    public JAXBElement<DtoJobSchedulerUsage.Store> createDtoJobSchedulerUsageStore(DtoJobSchedulerUsage.Store value) {
        return new JAXBElement<DtoJobSchedulerUsage.Store>(_DtoTempUsageStore_QNAME, DtoJobSchedulerUsage.Store.class, DtoJobSchedulerUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Parent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "parent", scope = DtoJobSchedulerUsage.class)
    public JAXBElement<DtoJobSchedulerUsage.Parent> createDtoJobSchedulerUsageParent(DtoJobSchedulerUsage.Parent value) {
        return new JAXBElement<DtoJobSchedulerUsage.Parent>(_DtoTempUsageParent_QNAME, DtoJobSchedulerUsage.Parent.class, DtoJobSchedulerUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoJobSchedulerUsage.class)
    public JAXBElement<DtoJobSchedulerUsage.Executor> createDtoJobSchedulerUsageExecutor(DtoJobSchedulerUsage.Executor value) {
        return new JAXBElement<DtoJobSchedulerUsage.Executor>(_DtoTempUsageExecutor_QNAME, DtoJobSchedulerUsage.Executor.class, DtoJobSchedulerUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJobSchedulerUsage.Limiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "limiter", scope = DtoJobSchedulerUsage.class)
    public JAXBElement<DtoJobSchedulerUsage.Limiter> createDtoJobSchedulerUsageLimiter(DtoJobSchedulerUsage.Limiter value) {
        return new JAXBElement<DtoJobSchedulerUsage.Limiter>(_DtoTempUsageLimiter_QNAME, DtoJobSchedulerUsage.Limiter.class, DtoJobSchedulerUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoInformixJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoInformixJDBCAdapter.class)
    public JAXBElement<DtoInformixJDBCAdapter.Statements> createDtoInformixJDBCAdapterStatements(DtoInformixJDBCAdapter.Statements value) {
        return new JAXBElement<DtoInformixJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoInformixJDBCAdapter.Statements.class, DtoInformixJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPooledConnectionFactory.TransactionManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transactionManager", scope = DtoPooledConnectionFactory.class)
    public JAXBElement<DtoPooledConnectionFactory.TransactionManager> createDtoPooledConnectionFactoryTransactionManager(DtoPooledConnectionFactory.TransactionManager value) {
        return new JAXBElement<DtoPooledConnectionFactory.TransactionManager>(_DtoPooledConnectionFactoryTransactionManager_QNAME, DtoPooledConnectionFactory.TransactionManager.class, DtoPooledConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPooledConnectionFactory.ConnectionFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionFactory", scope = DtoPooledConnectionFactory.class)
    public JAXBElement<DtoPooledConnectionFactory.ConnectionFactory> createDtoPooledConnectionFactoryConnectionFactory(DtoPooledConnectionFactory.ConnectionFactory value) {
        return new JAXBElement<DtoPooledConnectionFactory.ConnectionFactory>(_DtoPooledConnectionFactoryConnectionFactory_QNAME, DtoPooledConnectionFactory.ConnectionFactory.class, DtoPooledConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempTopic.Connection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connection", scope = DtoTempTopic.class)
    public JAXBElement<DtoTempTopic.Connection> createDtoTempTopicConnection(DtoTempTopic.Connection value) {
        return new JAXBElement<DtoTempTopic.Connection>(_DtoSimpleJmsMessageConvertorConnection_QNAME, DtoTempTopic.Connection.class, DtoTempTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempTopic.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoTempTopic.class)
    public JAXBElement<DtoTempTopic.Properties> createDtoTempTopicProperties(DtoTempTopic.Properties value) {
        return new JAXBElement<DtoTempTopic.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoTempTopic.Properties.class, DtoTempTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTempTopic.CompositeDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "compositeDestinations", scope = DtoTempTopic.class)
    public JAXBElement<DtoTempTopic.CompositeDestinations> createDtoTempTopicCompositeDestinations(DtoTempTopic.CompositeDestinations value) {
        return new JAXBElement<DtoTempTopic.CompositeDestinations>(_DtoTempQueueCompositeDestinations_QNAME, DtoTempTopic.CompositeDestinations.class, DtoTempTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTimeStampingBrokerPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoTimeStampingBrokerPlugin.class)
    public JAXBElement<DtoTimeStampingBrokerPlugin.AdminConnectionContext> createDtoTimeStampingBrokerPluginAdminConnectionContext(DtoTimeStampingBrokerPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoTimeStampingBrokerPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoTimeStampingBrokerPlugin.AdminConnectionContext.class, DtoTimeStampingBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTimeStampingBrokerPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoTimeStampingBrokerPlugin.class)
    public JAXBElement<DtoTimeStampingBrokerPlugin.Next> createDtoTimeStampingBrokerPluginNext(DtoTimeStampingBrokerPlugin.Next value) {
        return new JAXBElement<DtoTimeStampingBrokerPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoTimeStampingBrokerPlugin.Next.class, DtoTimeStampingBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLoggingBrokerPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoLoggingBrokerPlugin.class)
    public JAXBElement<DtoLoggingBrokerPlugin.AdminConnectionContext> createDtoLoggingBrokerPluginAdminConnectionContext(DtoLoggingBrokerPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoLoggingBrokerPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoLoggingBrokerPlugin.AdminConnectionContext.class, DtoLoggingBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLoggingBrokerPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoLoggingBrokerPlugin.class)
    public JAXBElement<DtoLoggingBrokerPlugin.Next> createDtoLoggingBrokerPluginNext(DtoLoggingBrokerPlugin.Next value) {
        return new JAXBElement<DtoLoggingBrokerPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoLoggingBrokerPlugin.Next.class, DtoLoggingBrokerPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.StaticallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "staticallyIncludedDestinations", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.StaticallyIncludedDestinations> createDtoDemandForwardingBridgeStaticallyIncludedDestinations(DtoDemandForwardingBridge.StaticallyIncludedDestinations value) {
        return new JAXBElement<DtoDemandForwardingBridge.StaticallyIncludedDestinations>(_DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME, DtoDemandForwardingBridge.StaticallyIncludedDestinations.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.BrokerService> createDtoDemandForwardingBridgeBrokerService(DtoDemandForwardingBridge.BrokerService value) {
        return new JAXBElement<DtoDemandForwardingBridge.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoDemandForwardingBridge.BrokerService.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.NetworkBridgeListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkBridgeListener", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.NetworkBridgeListener> createDtoDemandForwardingBridgeNetworkBridgeListener(DtoDemandForwardingBridge.NetworkBridgeListener value) {
        return new JAXBElement<DtoDemandForwardingBridge.NetworkBridgeListener>(_DtoDemandForwardingBridgeNetworkBridgeListener_QNAME, DtoDemandForwardingBridge.NetworkBridgeListener.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.DurableDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "durableDestinations", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.DurableDestinations> createDtoDemandForwardingBridgeDurableDestinations(DtoDemandForwardingBridge.DurableDestinations value) {
        return new JAXBElement<DtoDemandForwardingBridge.DurableDestinations>(_DtoLdapNetworkConnectorDurableDestinations_QNAME, DtoDemandForwardingBridge.DurableDestinations.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.LocalBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localBroker", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.LocalBroker> createDtoDemandForwardingBridgeLocalBroker(DtoDemandForwardingBridge.LocalBroker value) {
        return new JAXBElement<DtoDemandForwardingBridge.LocalBroker>(_DtoForwardingBridgeLocalBroker_QNAME, DtoDemandForwardingBridge.LocalBroker.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.RemoteBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "remoteBroker", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.RemoteBroker> createDtoDemandForwardingBridgeRemoteBroker(DtoDemandForwardingBridge.RemoteBroker value) {
        return new JAXBElement<DtoDemandForwardingBridge.RemoteBroker>(_DtoForwardingBridgeRemoteBroker_QNAME, DtoDemandForwardingBridge.RemoteBroker.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.DynamicallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dynamicallyIncludedDestinations", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.DynamicallyIncludedDestinations> createDtoDemandForwardingBridgeDynamicallyIncludedDestinations(DtoDemandForwardingBridge.DynamicallyIncludedDestinations value) {
        return new JAXBElement<DtoDemandForwardingBridge.DynamicallyIncludedDestinations>(_DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME, DtoDemandForwardingBridge.DynamicallyIncludedDestinations.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.ExcludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "excludedDestinations", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.ExcludedDestinations> createDtoDemandForwardingBridgeExcludedDestinations(DtoDemandForwardingBridge.ExcludedDestinations value) {
        return new JAXBElement<DtoDemandForwardingBridge.ExcludedDestinations>(_DtoLdapNetworkConnectorExcludedDestinations_QNAME, DtoDemandForwardingBridge.ExcludedDestinations.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDemandForwardingBridge.Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "configuration", scope = DtoDemandForwardingBridge.class)
    public JAXBElement<DtoDemandForwardingBridge.Configuration> createDtoDemandForwardingBridgeConfiguration(DtoDemandForwardingBridge.Configuration value) {
        return new JAXBElement<DtoDemandForwardingBridge.Configuration>(_DtoDemandForwardingBridgeConfiguration_QNAME, DtoDemandForwardingBridge.Configuration.class, DtoDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSharedFileLocker.Lockable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "lockable", scope = DtoSharedFileLocker.class)
    public JAXBElement<DtoSharedFileLocker.Lockable> createDtoSharedFileLockerLockable(DtoSharedFileLocker.Lockable value) {
        return new JAXBElement<DtoSharedFileLocker.Lockable>(_DtoLeaseDatabaseLockerLockable_QNAME, DtoSharedFileLocker.Lockable.class, DtoSharedFileLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ProducerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerConnection", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.ProducerConnection> createDtoOutboundQueueBridgeProducerConnection(DtoOutboundQueueBridge.ProducerConnection value) {
        return new JAXBElement<DtoOutboundQueueBridge.ProducerConnection>(_DtoInboundQueueBridgeProducerConnection_QNAME, DtoOutboundQueueBridge.ProducerConnection.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.Consumer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumer", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.Consumer> createDtoOutboundQueueBridgeConsumer(DtoOutboundQueueBridge.Consumer value) {
        return new JAXBElement<DtoOutboundQueueBridge.Consumer>(_DtoInboundQueueBridgeConsumer_QNAME, DtoOutboundQueueBridge.Consumer.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ConsumerConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerConnection", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.ConsumerConnection> createDtoOutboundQueueBridgeConsumerConnection(DtoOutboundQueueBridge.ConsumerConnection value) {
        return new JAXBElement<DtoOutboundQueueBridge.ConsumerConnection>(_DtoInboundQueueBridgeConsumerConnection_QNAME, DtoOutboundQueueBridge.ConsumerConnection.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ConsumerQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "consumerQueue", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.ConsumerQueue> createDtoOutboundQueueBridgeConsumerQueue(DtoOutboundQueueBridge.ConsumerQueue value) {
        return new JAXBElement<DtoOutboundQueueBridge.ConsumerQueue>(_DtoInboundQueueBridgeConsumerQueue_QNAME, DtoOutboundQueueBridge.ConsumerQueue.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.JmsMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsMessageConvertor", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.JmsMessageConvertor> createDtoOutboundQueueBridgeJmsMessageConvertor(DtoOutboundQueueBridge.JmsMessageConvertor value) {
        return new JAXBElement<DtoOutboundQueueBridge.JmsMessageConvertor>(_DtoInboundQueueBridgeJmsMessageConvertor_QNAME, DtoOutboundQueueBridge.JmsMessageConvertor.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.ProducerQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "producerQueue", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.ProducerQueue> createDtoOutboundQueueBridgeProducerQueue(DtoOutboundQueueBridge.ProducerQueue value) {
        return new JAXBElement<DtoOutboundQueueBridge.ProducerQueue>(_DtoInboundQueueBridgeProducerQueue_QNAME, DtoOutboundQueueBridge.ProducerQueue.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOutboundQueueBridge.JmsConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jmsConnector", scope = DtoOutboundQueueBridge.class)
    public JAXBElement<DtoOutboundQueueBridge.JmsConnector> createDtoOutboundQueueBridgeJmsConnector(DtoOutboundQueueBridge.JmsConnector value) {
        return new JAXBElement<DtoOutboundQueueBridge.JmsConnector>(_DtoInboundQueueBridgeJmsConnector_QNAME, DtoOutboundQueueBridge.JmsConnector.class, DtoOutboundQueueBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredDestination.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoFilteredDestination.class)
    public JAXBElement<DtoFilteredDestination.Destination> createDtoFilteredDestinationDestination(DtoFilteredDestination.Destination value) {
        return new JAXBElement<DtoFilteredDestination.Destination>(_DtoDestinationEntryDestination_QNAME, DtoFilteredDestination.Destination.class, DtoFilteredDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredDestination.Filter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "filter", scope = DtoFilteredDestination.class)
    public JAXBElement<DtoFilteredDestination.Filter> createDtoFilteredDestinationFilter(DtoFilteredDestination.Filter value) {
        return new JAXBElement<DtoFilteredDestination.Filter>(_DtoFilteredDestinationFilter_QNAME, DtoFilteredDestination.Filter.class, DtoFilteredDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.JdbcAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "jdbcAdapter", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.JdbcAdapter> createDtoJournalPersistenceAdapterFactoryJdbcAdapter(DtoJournalPersistenceAdapterFactory.JdbcAdapter value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.JdbcAdapter>(_DtoJournaledJDBCJdbcAdapter_QNAME, DtoJournalPersistenceAdapterFactory.JdbcAdapter.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.Statements> createDtoJournalPersistenceAdapterFactoryStatements(DtoJournalPersistenceAdapterFactory.Statements value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoJournalPersistenceAdapterFactory.Statements.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.BrokerService> createDtoJournalPersistenceAdapterFactoryBrokerService(DtoJournalPersistenceAdapterFactory.BrokerService value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJournalPersistenceAdapterFactory.BrokerService.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.Locker> createDtoJournalPersistenceAdapterFactoryLocker(DtoJournalPersistenceAdapterFactory.Locker value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoJournalPersistenceAdapterFactory.Locker.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.DataSource> createDtoJournalPersistenceAdapterFactoryDataSource(DtoJournalPersistenceAdapterFactory.DataSource value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoJournalPersistenceAdapterFactory.DataSource.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.TaskRunnerFactory> createDtoJournalPersistenceAdapterFactoryTaskRunnerFactory(DtoJournalPersistenceAdapterFactory.TaskRunnerFactory value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoJournalPersistenceAdapterFactory.TaskRunnerFactory.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.Adapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adapter", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.Adapter> createDtoJournalPersistenceAdapterFactoryAdapter(DtoJournalPersistenceAdapterFactory.Adapter value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.Adapter>(_DtoSystemUsageAdapter_QNAME, DtoJournalPersistenceAdapterFactory.Adapter.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.Journal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "journal", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.Journal> createDtoJournalPersistenceAdapterFactoryJournal(DtoJournalPersistenceAdapterFactory.Journal value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.Journal>(_DtoJournaledJDBCJournal_QNAME, DtoJournalPersistenceAdapterFactory.Journal.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoJournalPersistenceAdapterFactory.class)
    public JAXBElement<DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor> createDtoJournalPersistenceAdapterFactoryScheduledThreadPoolExecutor(DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoJournalPersistenceAdapterFactory.ScheduledThreadPoolExecutor.class, DtoJournalPersistenceAdapterFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoReplicatedLevelDB.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoReplicatedLevelDB.class)
    public JAXBElement<DtoReplicatedLevelDB.BrokerService> createDtoReplicatedLevelDBBrokerService(DtoReplicatedLevelDB.BrokerService value) {
        return new JAXBElement<DtoReplicatedLevelDB.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoReplicatedLevelDB.BrokerService.class, DtoReplicatedLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoReplicatedLevelDB.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoReplicatedLevelDB.class)
    public JAXBElement<DtoReplicatedLevelDB.Locker> createDtoReplicatedLevelDBLocker(DtoReplicatedLevelDB.Locker value) {
        return new JAXBElement<DtoReplicatedLevelDB.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoReplicatedLevelDB.Locker.class, DtoReplicatedLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoReplicatedLevelDB.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoReplicatedLevelDB.class)
    public JAXBElement<DtoReplicatedLevelDB.UsageManager> createDtoReplicatedLevelDBUsageManager(DtoReplicatedLevelDB.UsageManager value) {
        return new JAXBElement<DtoReplicatedLevelDB.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoReplicatedLevelDB.UsageManager.class, DtoReplicatedLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoReplicatedLevelDB.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoReplicatedLevelDB.class)
    public JAXBElement<DtoReplicatedLevelDB.ScheduledThreadPoolExecutor> createDtoReplicatedLevelDBScheduledThreadPoolExecutor(DtoReplicatedLevelDB.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoReplicatedLevelDB.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoReplicatedLevelDB.ScheduledThreadPoolExecutor.class, DtoReplicatedLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoStreamJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoStreamJDBCAdapter.class)
    public JAXBElement<DtoStreamJDBCAdapter.Statements> createDtoStreamJDBCAdapterStatements(DtoStreamJDBCAdapter.Statements value) {
        return new JAXBElement<DtoStreamJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoStreamJDBCAdapter.Statements.class, DtoStreamJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransactDatabaseLocker.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoTransactDatabaseLocker.class)
    public JAXBElement<DtoTransactDatabaseLocker.Statements> createDtoTransactDatabaseLockerStatements(DtoTransactDatabaseLocker.Statements value) {
        return new JAXBElement<DtoTransactDatabaseLocker.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoTransactDatabaseLocker.Statements.class, DtoTransactDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransactDatabaseLocker.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoTransactDatabaseLocker.class)
    public JAXBElement<DtoTransactDatabaseLocker.DataSource> createDtoTransactDatabaseLockerDataSource(DtoTransactDatabaseLocker.DataSource value) {
        return new JAXBElement<DtoTransactDatabaseLocker.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoTransactDatabaseLocker.DataSource.class, DtoTransactDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransactDatabaseLocker.ExceptionHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "exceptionHandler", scope = DtoTransactDatabaseLocker.class)
    public JAXBElement<DtoTransactDatabaseLocker.ExceptionHandler> createDtoTransactDatabaseLockerExceptionHandler(DtoTransactDatabaseLocker.ExceptionHandler value) {
        return new JAXBElement<DtoTransactDatabaseLocker.ExceptionHandler>(_DtoTransactDatabaseLockerExceptionHandler_QNAME, DtoTransactDatabaseLocker.ExceptionHandler.class, DtoTransactDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTransactDatabaseLocker.Lockable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "lockable", scope = DtoTransactDatabaseLocker.class)
    public JAXBElement<DtoTransactDatabaseLocker.Lockable> createDtoTransactDatabaseLockerLockable(DtoTransactDatabaseLocker.Lockable value) {
        return new JAXBElement<DtoTransactDatabaseLocker.Lockable>(_DtoLeaseDatabaseLockerLockable_QNAME, DtoTransactDatabaseLocker.Lockable.class, DtoTransactDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationEntry.WriteACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "writeACLs", scope = DtoAuthorizationEntry.class)
    public JAXBElement<DtoAuthorizationEntry.WriteACLs> createDtoAuthorizationEntryWriteACLs(DtoAuthorizationEntry.WriteACLs value) {
        return new JAXBElement<DtoAuthorizationEntry.WriteACLs>(_DtoTempDestinationAuthorizationEntryWriteACLs_QNAME, DtoAuthorizationEntry.WriteACLs.class, DtoAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationEntry.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoAuthorizationEntry.class)
    public JAXBElement<DtoAuthorizationEntry.Destination> createDtoAuthorizationEntryDestination(DtoAuthorizationEntry.Destination value) {
        return new JAXBElement<DtoAuthorizationEntry.Destination>(_DtoDestinationEntryDestination_QNAME, DtoAuthorizationEntry.Destination.class, DtoAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationEntry.ReadACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "readACLs", scope = DtoAuthorizationEntry.class)
    public JAXBElement<DtoAuthorizationEntry.ReadACLs> createDtoAuthorizationEntryReadACLs(DtoAuthorizationEntry.ReadACLs value) {
        return new JAXBElement<DtoAuthorizationEntry.ReadACLs>(_DtoTempDestinationAuthorizationEntryReadACLs_QNAME, DtoAuthorizationEntry.ReadACLs.class, DtoAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationEntry.AdminACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminACLs", scope = DtoAuthorizationEntry.class)
    public JAXBElement<DtoAuthorizationEntry.AdminACLs> createDtoAuthorizationEntryAdminACLs(DtoAuthorizationEntry.AdminACLs value) {
        return new JAXBElement<DtoAuthorizationEntry.AdminACLs>(_DtoTempDestinationAuthorizationEntryAdminACLs_QNAME, DtoAuthorizationEntry.AdminACLs.class, DtoAuthorizationEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDiscarding.DeadLetterQueue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "deadLetterQueue", scope = DtoDiscarding.class)
    public JAXBElement<DtoDiscarding.DeadLetterQueue> createDtoDiscardingDeadLetterQueue(DtoDiscarding.DeadLetterQueue value) {
        return new JAXBElement<DtoDiscarding.DeadLetterQueue>(_DtoSharedDeadLetterStrategyDeadLetterQueue_QNAME, DtoDiscarding.DeadLetterQueue.class, DtoDiscarding.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAbortSlowAckConsumerStrategy.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoAbortSlowAckConsumerStrategy.class)
    public JAXBElement<DtoAbortSlowAckConsumerStrategy.BrokerService> createDtoAbortSlowAckConsumerStrategyBrokerService(DtoAbortSlowAckConsumerStrategy.BrokerService value) {
        return new JAXBElement<DtoAbortSlowAckConsumerStrategy.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoAbortSlowAckConsumerStrategy.BrokerService.class, DtoAbortSlowAckConsumerStrategy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueue.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoQueue.class)
    public JAXBElement<DtoQueue.Properties> createDtoQueueProperties(DtoQueue.Properties value) {
        return new JAXBElement<DtoQueue.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoQueue.Properties.class, DtoQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoQueue.CompositeDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "compositeDestinations", scope = DtoQueue.class)
    public JAXBElement<DtoQueue.CompositeDestinations> createDtoQueueCompositeDestinations(DtoQueue.CompositeDestinations value) {
        return new JAXBElement<DtoQueue.CompositeDestinations>(_DtoTempQueueCompositeDestinations_QNAME, DtoQueue.CompositeDestinations.class, DtoQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.Statements> createDtoJdbcPersistenceAdapterStatements(DtoJdbcPersistenceAdapter.Statements value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoJdbcPersistenceAdapter.Statements.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.WireFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "wireFormat", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.WireFormat> createDtoJdbcPersistenceAdapterWireFormat(DtoJdbcPersistenceAdapter.WireFormat value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.WireFormat>(_DtoUdpTraceBrokerPluginWireFormat_QNAME, DtoJdbcPersistenceAdapter.WireFormat.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.BrokerService> createDtoJdbcPersistenceAdapterBrokerService(DtoJdbcPersistenceAdapter.BrokerService value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJdbcPersistenceAdapter.BrokerService.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.Locker> createDtoJdbcPersistenceAdapterLocker(DtoJdbcPersistenceAdapter.Locker value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoJdbcPersistenceAdapter.Locker.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Ds }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "ds", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.Ds> createDtoJdbcPersistenceAdapterDs(DtoJdbcPersistenceAdapter.Ds value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.Ds>(_DtoJdbcPersistenceAdapterDs_QNAME, DtoJdbcPersistenceAdapter.Ds.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.DataSource> createDtoJdbcPersistenceAdapterDataSource(DtoJdbcPersistenceAdapter.DataSource value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoJdbcPersistenceAdapter.DataSource.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.UsageManager> createDtoJdbcPersistenceAdapterUsageManager(DtoJdbcPersistenceAdapter.UsageManager value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoJdbcPersistenceAdapter.UsageManager.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.DatabaseLocker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "databaseLocker", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.DatabaseLocker> createDtoJdbcPersistenceAdapterDatabaseLocker(DtoJdbcPersistenceAdapter.DatabaseLocker value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.DatabaseLocker>(_DtoJdbcPersistenceAdapterDatabaseLocker_QNAME, DtoJdbcPersistenceAdapter.DatabaseLocker.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.Adapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adapter", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.Adapter> createDtoJdbcPersistenceAdapterAdapter(DtoJdbcPersistenceAdapter.Adapter value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.Adapter>(_DtoSystemUsageAdapter_QNAME, DtoJdbcPersistenceAdapter.Adapter.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.LockDataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "lockDataSource", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.LockDataSource> createDtoJdbcPersistenceAdapterLockDataSource(DtoJdbcPersistenceAdapter.LockDataSource value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.LockDataSource>(_DtoJdbcPersistenceAdapterLockDataSource_QNAME, DtoJdbcPersistenceAdapter.LockDataSource.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoJdbcPersistenceAdapter.class)
    public JAXBElement<DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor> createDtoJdbcPersistenceAdapterScheduledThreadPoolExecutor(DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoJdbcPersistenceAdapter.ScheduledThreadPoolExecutor.class, DtoJdbcPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTraceBrokerPathPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoTraceBrokerPathPlugin.class)
    public JAXBElement<DtoTraceBrokerPathPlugin.AdminConnectionContext> createDtoTraceBrokerPathPluginAdminConnectionContext(DtoTraceBrokerPathPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoTraceBrokerPathPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoTraceBrokerPathPlugin.AdminConnectionContext.class, DtoTraceBrokerPathPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTraceBrokerPathPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoTraceBrokerPathPlugin.class)
    public JAXBElement<DtoTraceBrokerPathPlugin.Next> createDtoTraceBrokerPathPluginNext(DtoTraceBrokerPathPlugin.Next value) {
        return new JAXBElement<DtoTraceBrokerPathPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoTraceBrokerPathPlugin.Next.class, DtoTraceBrokerPathPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPolicyMap.RedeliveryPolicyEntries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicyEntries", scope = DtoRedeliveryPolicyMap.class)
    public JAXBElement<DtoRedeliveryPolicyMap.RedeliveryPolicyEntries> createDtoRedeliveryPolicyMapRedeliveryPolicyEntries(DtoRedeliveryPolicyMap.RedeliveryPolicyEntries value) {
        return new JAXBElement<DtoRedeliveryPolicyMap.RedeliveryPolicyEntries>(_DtoRedeliveryPolicyMapRedeliveryPolicyEntries_QNAME, DtoRedeliveryPolicyMap.RedeliveryPolicyEntries.class, DtoRedeliveryPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPolicyMap.DefaultEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "defaultEntry", scope = DtoRedeliveryPolicyMap.class)
    public JAXBElement<DtoRedeliveryPolicyMap.DefaultEntry> createDtoRedeliveryPolicyMapDefaultEntry(DtoRedeliveryPolicyMap.DefaultEntry value) {
        return new JAXBElement<DtoRedeliveryPolicyMap.DefaultEntry>(_DtoRedeliveryPolicyMapDefaultEntry_QNAME, DtoRedeliveryPolicyMap.DefaultEntry.class, DtoRedeliveryPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoRedeliveryPolicyMap.Entries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "entries", scope = DtoRedeliveryPolicyMap.class)
    public JAXBElement<DtoRedeliveryPolicyMap.Entries> createDtoRedeliveryPolicyMapEntries(DtoRedeliveryPolicyMap.Entries value) {
        return new JAXBElement<DtoRedeliveryPolicyMap.Entries>(_DtoRedeliveryPolicyMapEntries_QNAME, DtoRedeliveryPolicyMap.Entries.class, DtoRedeliveryPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.PersistenceAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceAdapter", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.PersistenceAdapter> createDtoJournalPersistenceAdapterPersistenceAdapter(DtoJournalPersistenceAdapter.PersistenceAdapter value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.PersistenceAdapter>(_DtoBrokerPersistenceAdapter_QNAME, DtoJournalPersistenceAdapter.PersistenceAdapter.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.BrokerService> createDtoJournalPersistenceAdapterBrokerService(DtoJournalPersistenceAdapter.BrokerService value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJournalPersistenceAdapter.BrokerService.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.LongTermPersistence }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "longTermPersistence", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.LongTermPersistence> createDtoJournalPersistenceAdapterLongTermPersistence(DtoJournalPersistenceAdapter.LongTermPersistence value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.LongTermPersistence>(_DtoJournalPersistenceAdapterLongTermPersistence_QNAME, DtoJournalPersistenceAdapter.LongTermPersistence.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.UsageManager> createDtoJournalPersistenceAdapterUsageManager(DtoJournalPersistenceAdapter.UsageManager value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoJournalPersistenceAdapter.UsageManager.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.TaskRunnerFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "taskRunnerFactory", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.TaskRunnerFactory> createDtoJournalPersistenceAdapterTaskRunnerFactory(DtoJournalPersistenceAdapter.TaskRunnerFactory value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.TaskRunnerFactory>(_DtoBrokerTaskRunnerFactory_QNAME, DtoJournalPersistenceAdapter.TaskRunnerFactory.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJournalPersistenceAdapter.Journal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "journal", scope = DtoJournalPersistenceAdapter.class)
    public JAXBElement<DtoJournalPersistenceAdapter.Journal> createDtoJournalPersistenceAdapterJournal(DtoJournalPersistenceAdapter.Journal value) {
        return new JAXBElement<DtoJournalPersistenceAdapter.Journal>(_DtoJournaledJDBCJournal_QNAME, DtoJournalPersistenceAdapter.Journal.class, DtoJournalPersistenceAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.Bridge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "bridge", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.Bridge> createDtoMulticastNetworkConnectorBridge(DtoMulticastNetworkConnector.Bridge value) {
        return new JAXBElement<DtoMulticastNetworkConnector.Bridge>(_DtoMulticastNetworkConnectorBridge_QNAME, DtoMulticastNetworkConnector.Bridge.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.StaticallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "staticallyIncludedDestinations", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.StaticallyIncludedDestinations> createDtoMulticastNetworkConnectorStaticallyIncludedDestinations(DtoMulticastNetworkConnector.StaticallyIncludedDestinations value) {
        return new JAXBElement<DtoMulticastNetworkConnector.StaticallyIncludedDestinations>(_DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME, DtoMulticastNetworkConnector.StaticallyIncludedDestinations.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.BrokerService> createDtoMulticastNetworkConnectorBrokerService(DtoMulticastNetworkConnector.BrokerService value) {
        return new JAXBElement<DtoMulticastNetworkConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoMulticastNetworkConnector.BrokerService.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.LocalTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localTransport", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.LocalTransport> createDtoMulticastNetworkConnectorLocalTransport(DtoMulticastNetworkConnector.LocalTransport value) {
        return new JAXBElement<DtoMulticastNetworkConnector.LocalTransport>(_DtoMulticastNetworkConnectorLocalTransport_QNAME, DtoMulticastNetworkConnector.LocalTransport.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.DurableDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "durableDestinations", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.DurableDestinations> createDtoMulticastNetworkConnectorDurableDestinations(DtoMulticastNetworkConnector.DurableDestinations value) {
        return new JAXBElement<DtoMulticastNetworkConnector.DurableDestinations>(_DtoLdapNetworkConnectorDurableDestinations_QNAME, DtoMulticastNetworkConnector.DurableDestinations.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.DynamicallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dynamicallyIncludedDestinations", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.DynamicallyIncludedDestinations> createDtoMulticastNetworkConnectorDynamicallyIncludedDestinations(DtoMulticastNetworkConnector.DynamicallyIncludedDestinations value) {
        return new JAXBElement<DtoMulticastNetworkConnector.DynamicallyIncludedDestinations>(_DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME, DtoMulticastNetworkConnector.DynamicallyIncludedDestinations.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.ExcludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "excludedDestinations", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.ExcludedDestinations> createDtoMulticastNetworkConnectorExcludedDestinations(DtoMulticastNetworkConnector.ExcludedDestinations value) {
        return new JAXBElement<DtoMulticastNetworkConnector.ExcludedDestinations>(_DtoLdapNetworkConnectorExcludedDestinations_QNAME, DtoMulticastNetworkConnector.ExcludedDestinations.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.BridgeFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "bridgeFactory", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.BridgeFactory> createDtoMulticastNetworkConnectorBridgeFactory(DtoMulticastNetworkConnector.BridgeFactory value) {
        return new JAXBElement<DtoMulticastNetworkConnector.BridgeFactory>(_DtoLdapNetworkConnectorBridgeFactory_QNAME, DtoMulticastNetworkConnector.BridgeFactory.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.ConnectionFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionFilter", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.ConnectionFilter> createDtoMulticastNetworkConnectorConnectionFilter(DtoMulticastNetworkConnector.ConnectionFilter value) {
        return new JAXBElement<DtoMulticastNetworkConnector.ConnectionFilter>(_DtoLdapNetworkConnectorConnectionFilter_QNAME, DtoMulticastNetworkConnector.ConnectionFilter.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMulticastNetworkConnector.RemoteTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "remoteTransport", scope = DtoMulticastNetworkConnector.class)
    public JAXBElement<DtoMulticastNetworkConnector.RemoteTransport> createDtoMulticastNetworkConnectorRemoteTransport(DtoMulticastNetworkConnector.RemoteTransport value) {
        return new JAXBElement<DtoMulticastNetworkConnector.RemoteTransport>(_DtoMulticastNetworkConnectorRemoteTransport_QNAME, DtoMulticastNetworkConnector.RemoteTransport.class, DtoMulticastNetworkConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMirroredQueue.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoMirroredQueue.class)
    public JAXBElement<DtoMirroredQueue.BrokerService> createDtoMirroredQueueBrokerService(DtoMirroredQueue.BrokerService value) {
        return new JAXBElement<DtoMirroredQueue.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoMirroredQueue.BrokerService.class, DtoMirroredQueue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDatabaseLocker.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoDatabaseLocker.class)
    public JAXBElement<DtoDatabaseLocker.Statements> createDtoDatabaseLockerStatements(DtoDatabaseLocker.Statements value) {
        return new JAXBElement<DtoDatabaseLocker.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoDatabaseLocker.Statements.class, DtoDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDatabaseLocker.DataSource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dataSource", scope = DtoDatabaseLocker.class)
    public JAXBElement<DtoDatabaseLocker.DataSource> createDtoDatabaseLockerDataSource(DtoDatabaseLocker.DataSource value) {
        return new JAXBElement<DtoDatabaseLocker.DataSource>(_DtoLeaseDatabaseLockerDataSource_QNAME, DtoDatabaseLocker.DataSource.class, DtoDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDatabaseLocker.ExceptionHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "exceptionHandler", scope = DtoDatabaseLocker.class)
    public JAXBElement<DtoDatabaseLocker.ExceptionHandler> createDtoDatabaseLockerExceptionHandler(DtoDatabaseLocker.ExceptionHandler value) {
        return new JAXBElement<DtoDatabaseLocker.ExceptionHandler>(_DtoTransactDatabaseLockerExceptionHandler_QNAME, DtoDatabaseLocker.ExceptionHandler.class, DtoDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDatabaseLocker.Lockable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "lockable", scope = DtoDatabaseLocker.class)
    public JAXBElement<DtoDatabaseLocker.Lockable> createDtoDatabaseLockerLockable(DtoDatabaseLocker.Lockable value) {
        return new JAXBElement<DtoDatabaseLocker.Lockable>(_DtoLeaseDatabaseLockerLockable_QNAME, DtoDatabaseLocker.Lockable.class, DtoDatabaseLocker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "staticallyIncludedDestinations", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations> createDtoCompositeDemandForwardingBridgeStaticallyIncludedDestinations(DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations>(_DtoLdapNetworkConnectorStaticallyIncludedDestinations_QNAME, DtoCompositeDemandForwardingBridge.StaticallyIncludedDestinations.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.BrokerService> createDtoCompositeDemandForwardingBridgeBrokerService(DtoCompositeDemandForwardingBridge.BrokerService value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoCompositeDemandForwardingBridge.BrokerService.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.NetworkBridgeListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "networkBridgeListener", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.NetworkBridgeListener> createDtoCompositeDemandForwardingBridgeNetworkBridgeListener(DtoCompositeDemandForwardingBridge.NetworkBridgeListener value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.NetworkBridgeListener>(_DtoDemandForwardingBridgeNetworkBridgeListener_QNAME, DtoCompositeDemandForwardingBridge.NetworkBridgeListener.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.DurableDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "durableDestinations", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.DurableDestinations> createDtoCompositeDemandForwardingBridgeDurableDestinations(DtoCompositeDemandForwardingBridge.DurableDestinations value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.DurableDestinations>(_DtoLdapNetworkConnectorDurableDestinations_QNAME, DtoCompositeDemandForwardingBridge.DurableDestinations.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.LocalBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localBroker", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.LocalBroker> createDtoCompositeDemandForwardingBridgeLocalBroker(DtoCompositeDemandForwardingBridge.LocalBroker value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.LocalBroker>(_DtoForwardingBridgeLocalBroker_QNAME, DtoCompositeDemandForwardingBridge.LocalBroker.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.RemoteBroker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "remoteBroker", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.RemoteBroker> createDtoCompositeDemandForwardingBridgeRemoteBroker(DtoCompositeDemandForwardingBridge.RemoteBroker value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.RemoteBroker>(_DtoForwardingBridgeRemoteBroker_QNAME, DtoCompositeDemandForwardingBridge.RemoteBroker.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "dynamicallyIncludedDestinations", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations> createDtoCompositeDemandForwardingBridgeDynamicallyIncludedDestinations(DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations>(_DtoLdapNetworkConnectorDynamicallyIncludedDestinations_QNAME, DtoCompositeDemandForwardingBridge.DynamicallyIncludedDestinations.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.ExcludedDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "excludedDestinations", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.ExcludedDestinations> createDtoCompositeDemandForwardingBridgeExcludedDestinations(DtoCompositeDemandForwardingBridge.ExcludedDestinations value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.ExcludedDestinations>(_DtoLdapNetworkConnectorExcludedDestinations_QNAME, DtoCompositeDemandForwardingBridge.ExcludedDestinations.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoCompositeDemandForwardingBridge.Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "configuration", scope = DtoCompositeDemandForwardingBridge.class)
    public JAXBElement<DtoCompositeDemandForwardingBridge.Configuration> createDtoCompositeDemandForwardingBridgeConfiguration(DtoCompositeDemandForwardingBridge.Configuration value) {
        return new JAXBElement<DtoCompositeDemandForwardingBridge.Configuration>(_DtoDemandForwardingBridgeConfiguration_QNAME, DtoCompositeDemandForwardingBridge.Configuration.class, DtoCompositeDemandForwardingBridge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.LocalQueueConnectionFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localQueueConnectionFactory", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.LocalQueueConnectionFactory> createDtoJmsQueueConnectorLocalQueueConnectionFactory(DtoJmsQueueConnector.LocalQueueConnectionFactory value) {
        return new JAXBElement<DtoJmsQueueConnector.LocalQueueConnectionFactory>(_DtoJmsQueueConnectorLocalQueueConnectionFactory_QNAME, DtoJmsQueueConnector.LocalQueueConnectionFactory.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundQueueConnection", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.OutboundQueueConnection> createDtoJmsQueueConnectorOutboundQueueConnection(DtoJmsQueueConnector.OutboundQueueConnection value) {
        return new JAXBElement<DtoJmsQueueConnector.OutboundQueueConnection>(_DtoJmsQueueConnectorOutboundQueueConnection_QNAME, DtoJmsQueueConnector.OutboundQueueConnection.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.BrokerService> createDtoJmsQueueConnectorBrokerService(DtoJmsQueueConnector.BrokerService value) {
        return new JAXBElement<DtoJmsQueueConnector.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoJmsQueueConnector.BrokerService.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.InboundMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "inboundMessageConvertor", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.InboundMessageConvertor> createDtoJmsQueueConnectorInboundMessageConvertor(DtoJmsQueueConnector.InboundMessageConvertor value) {
        return new JAXBElement<DtoJmsQueueConnector.InboundMessageConvertor>(_DtoJmsTopicConnectorInboundMessageConvertor_QNAME, DtoJmsQueueConnector.InboundMessageConvertor.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueBridges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundQueueBridges", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.OutboundQueueBridges> createDtoJmsQueueConnectorOutboundQueueBridges(DtoJmsQueueConnector.OutboundQueueBridges value) {
        return new JAXBElement<DtoJmsQueueConnector.OutboundQueueBridges>(_DtoJmsQueueConnectorOutboundQueueBridges_QNAME, DtoJmsQueueConnector.OutboundQueueBridges.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundQueueConnectionFactory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundQueueConnectionFactory", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.OutboundQueueConnectionFactory> createDtoJmsQueueConnectorOutboundQueueConnectionFactory(DtoJmsQueueConnector.OutboundQueueConnectionFactory value) {
        return new JAXBElement<DtoJmsQueueConnector.OutboundQueueConnectionFactory>(_DtoJmsQueueConnectorOutboundQueueConnectionFactory_QNAME, DtoJmsQueueConnector.OutboundQueueConnectionFactory.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.LocalQueueConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "localQueueConnection", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.LocalQueueConnection> createDtoJmsQueueConnectorLocalQueueConnection(DtoJmsQueueConnector.LocalQueueConnection value) {
        return new JAXBElement<DtoJmsQueueConnector.LocalQueueConnection>(_DtoJmsQueueConnectorLocalQueueConnection_QNAME, DtoJmsQueueConnector.LocalQueueConnection.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.ReconnectionPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "reconnectionPolicy", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.ReconnectionPolicy> createDtoJmsQueueConnectorReconnectionPolicy(DtoJmsQueueConnector.ReconnectionPolicy value) {
        return new JAXBElement<DtoJmsQueueConnector.ReconnectionPolicy>(_DtoJmsTopicConnectorReconnectionPolicy_QNAME, DtoJmsQueueConnector.ReconnectionPolicy.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.OutboundMessageConvertor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "outboundMessageConvertor", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.OutboundMessageConvertor> createDtoJmsQueueConnectorOutboundMessageConvertor(DtoJmsQueueConnector.OutboundMessageConvertor value) {
        return new JAXBElement<DtoJmsQueueConnector.OutboundMessageConvertor>(_DtoJmsTopicConnectorOutboundMessageConvertor_QNAME, DtoJmsQueueConnector.OutboundMessageConvertor.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoJmsQueueConnector.InboundQueueBridges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "inboundQueueBridges", scope = DtoJmsQueueConnector.class)
    public JAXBElement<DtoJmsQueueConnector.InboundQueueBridges> createDtoJmsQueueConnectorInboundQueueBridges(DtoJmsQueueConnector.InboundQueueBridges value) {
        return new JAXBElement<DtoJmsQueueConnector.InboundQueueBridges>(_DtoJmsQueueConnectorInboundQueueBridges_QNAME, DtoJmsQueueConnector.InboundQueueBridges.class, DtoJmsQueueConnector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPublishedAddressPolicy.HostMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "hostMapping", scope = DtoPublishedAddressPolicy.class)
    public JAXBElement<DtoPublishedAddressPolicy.HostMapping> createDtoPublishedAddressPolicyHostMapping(DtoPublishedAddressPolicy.HostMapping value) {
        return new JAXBElement<DtoPublishedAddressPolicy.HostMapping>(_DtoPublishedAddressPolicyHostMapping_QNAME, DtoPublishedAddressPolicy.HostMapping.class, DtoPublishedAddressPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPublishedAddressPolicy.PortMapping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "portMapping", scope = DtoPublishedAddressPolicy.class)
    public JAXBElement<DtoPublishedAddressPolicy.PortMapping> createDtoPublishedAddressPolicyPortMapping(DtoPublishedAddressPolicy.PortMapping value) {
        return new JAXBElement<DtoPublishedAddressPolicy.PortMapping>(_DtoPublishedAddressPolicyPortMapping_QNAME, DtoPublishedAddressPolicy.PortMapping.class, DtoPublishedAddressPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationsPlugin.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoDestinationsPlugin.class)
    public JAXBElement<DtoDestinationsPlugin.AdminConnectionContext> createDtoDestinationsPluginAdminConnectionContext(DtoDestinationsPlugin.AdminConnectionContext value) {
        return new JAXBElement<DtoDestinationsPlugin.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoDestinationsPlugin.AdminConnectionContext.class, DtoDestinationsPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDestinationsPlugin.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoDestinationsPlugin.class)
    public JAXBElement<DtoDestinationsPlugin.Next> createDtoDestinationsPluginNext(DtoDestinationsPlugin.Next value) {
        return new JAXBElement<DtoDestinationsPlugin.Next>(_DtoRedeliveryPluginNext_QNAME, DtoDestinationsPlugin.Next.class, DtoDestinationsPlugin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMemoryUsage.Parent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "parent", scope = DtoMemoryUsage.class)
    public JAXBElement<DtoMemoryUsage.Parent> createDtoMemoryUsageParent(DtoMemoryUsage.Parent value) {
        return new JAXBElement<DtoMemoryUsage.Parent>(_DtoTempUsageParent_QNAME, DtoMemoryUsage.Parent.class, DtoMemoryUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMemoryUsage.Executor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "executor", scope = DtoMemoryUsage.class)
    public JAXBElement<DtoMemoryUsage.Executor> createDtoMemoryUsageExecutor(DtoMemoryUsage.Executor value) {
        return new JAXBElement<DtoMemoryUsage.Executor>(_DtoTempUsageExecutor_QNAME, DtoMemoryUsage.Executor.class, DtoMemoryUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMemoryUsage.Limiter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "limiter", scope = DtoMemoryUsage.class)
    public JAXBElement<DtoMemoryUsage.Limiter> createDtoMemoryUsageLimiter(DtoMemoryUsage.Limiter value) {
        return new JAXBElement<DtoMemoryUsage.Limiter>(_DtoTempUsageLimiter_QNAME, DtoMemoryUsage.Limiter.class, DtoMemoryUsage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.BrokerService> createDtoMKahaDBBrokerService(DtoMKahaDB.BrokerService value) {
        return new JAXBElement<DtoMKahaDB.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoMKahaDB.BrokerService.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.Locker> createDtoMKahaDBLocker(DtoMKahaDB.Locker value) {
        return new JAXBElement<DtoMKahaDB.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoMKahaDB.Locker.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.TransactionStore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transactionStore", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.TransactionStore> createDtoMKahaDBTransactionStore(DtoMKahaDB.TransactionStore value) {
        return new JAXBElement<DtoMKahaDB.TransactionStore>(_DtoMKahaDBTransactionStore_QNAME, DtoMKahaDB.TransactionStore.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.UsageManager> createDtoMKahaDBUsageManager(DtoMKahaDB.UsageManager value) {
        return new JAXBElement<DtoMKahaDB.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoMKahaDB.UsageManager.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.FilteredPersistenceAdapters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "filteredPersistenceAdapters", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.FilteredPersistenceAdapters> createDtoMKahaDBFilteredPersistenceAdapters(DtoMKahaDB.FilteredPersistenceAdapters value) {
        return new JAXBElement<DtoMKahaDB.FilteredPersistenceAdapters>(_DtoMKahaDBFilteredPersistenceAdapters_QNAME, DtoMKahaDB.FilteredPersistenceAdapters.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoMKahaDB.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoMKahaDB.class)
    public JAXBElement<DtoMKahaDB.ScheduledThreadPoolExecutor> createDtoMKahaDBScheduledThreadPoolExecutor(DtoMKahaDB.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoMKahaDB.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoMKahaDB.ScheduledThreadPoolExecutor.class, DtoMKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.RejectedTaskHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "rejectedTaskHandler", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.RejectedTaskHandler> createDtoConnectionFactoryRejectedTaskHandler(DtoConnectionFactory.RejectedTaskHandler value) {
        return new JAXBElement<DtoConnectionFactory.RejectedTaskHandler>(_DtoXaConnectionFactoryRejectedTaskHandler_QNAME, DtoConnectionFactory.RejectedTaskHandler.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.SessionTaskRunner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "sessionTaskRunner", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.SessionTaskRunner> createDtoConnectionFactorySessionTaskRunner(DtoConnectionFactory.SessionTaskRunner value) {
        return new JAXBElement<DtoConnectionFactory.SessionTaskRunner>(_DtoXaConnectionFactorySessionTaskRunner_QNAME, DtoConnectionFactory.SessionTaskRunner.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.ConnectionIdGenerator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "connectionIdGenerator", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.ConnectionIdGenerator> createDtoConnectionFactoryConnectionIdGenerator(DtoConnectionFactory.ConnectionIdGenerator value) {
        return new JAXBElement<DtoConnectionFactory.ConnectionIdGenerator>(_DtoXaConnectionFactoryConnectionIdGenerator_QNAME, DtoConnectionFactory.ConnectionIdGenerator.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.Properties> createDtoConnectionFactoryProperties(DtoConnectionFactory.Properties value) {
        return new JAXBElement<DtoConnectionFactory.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoConnectionFactory.Properties.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.BlobTransferPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "blobTransferPolicy", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.BlobTransferPolicy> createDtoConnectionFactoryBlobTransferPolicy(DtoConnectionFactory.BlobTransferPolicy value) {
        return new JAXBElement<DtoConnectionFactory.BlobTransferPolicy>(_DtoXaConnectionFactoryBlobTransferPolicy_QNAME, DtoConnectionFactory.BlobTransferPolicy.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.ExceptionListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "exceptionListener", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.ExceptionListener> createDtoConnectionFactoryExceptionListener(DtoConnectionFactory.ExceptionListener value) {
        return new JAXBElement<DtoConnectionFactory.ExceptionListener>(_DtoXaConnectionFactoryExceptionListener_QNAME, DtoConnectionFactory.ExceptionListener.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.ClientIdGenerator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "clientIdGenerator", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.ClientIdGenerator> createDtoConnectionFactoryClientIdGenerator(DtoConnectionFactory.ClientIdGenerator value) {
        return new JAXBElement<DtoConnectionFactory.ClientIdGenerator>(_DtoXaConnectionFactoryClientIdGenerator_QNAME, DtoConnectionFactory.ClientIdGenerator.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.TrustedPackages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "trustedPackages", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.TrustedPackages> createDtoConnectionFactoryTrustedPackages(DtoConnectionFactory.TrustedPackages value) {
        return new JAXBElement<DtoConnectionFactory.TrustedPackages>(_DtoXaConnectionFactoryTrustedPackages_QNAME, DtoConnectionFactory.TrustedPackages.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.TransportListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transportListener", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.TransportListener> createDtoConnectionFactoryTransportListener(DtoConnectionFactory.TransportListener value) {
        return new JAXBElement<DtoConnectionFactory.TransportListener>(_DtoXaConnectionFactoryTransportListener_QNAME, DtoConnectionFactory.TransportListener.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.PrefetchPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "prefetchPolicy", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.PrefetchPolicy> createDtoConnectionFactoryPrefetchPolicy(DtoConnectionFactory.PrefetchPolicy value) {
        return new JAXBElement<DtoConnectionFactory.PrefetchPolicy>(_DtoXaConnectionFactoryPrefetchPolicy_QNAME, DtoConnectionFactory.PrefetchPolicy.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.Transformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transformer", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.Transformer> createDtoConnectionFactoryTransformer(DtoConnectionFactory.Transformer value) {
        return new JAXBElement<DtoConnectionFactory.Transformer>(_DtoXaConnectionFactoryTransformer_QNAME, DtoConnectionFactory.Transformer.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.ClientInternalExceptionListener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "clientInternalExceptionListener", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.ClientInternalExceptionListener> createDtoConnectionFactoryClientInternalExceptionListener(DtoConnectionFactory.ClientInternalExceptionListener value) {
        return new JAXBElement<DtoConnectionFactory.ClientInternalExceptionListener>(_DtoXaConnectionFactoryClientInternalExceptionListener_QNAME, DtoConnectionFactory.ClientInternalExceptionListener.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.RedeliveryPolicyMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicyMap", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.RedeliveryPolicyMap> createDtoConnectionFactoryRedeliveryPolicyMap(DtoConnectionFactory.RedeliveryPolicyMap value) {
        return new JAXBElement<DtoConnectionFactory.RedeliveryPolicyMap>(_DtoXaConnectionFactoryRedeliveryPolicyMap_QNAME, DtoConnectionFactory.RedeliveryPolicyMap.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoConnectionFactory.RedeliveryPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "redeliveryPolicy", scope = DtoConnectionFactory.class)
    public JAXBElement<DtoConnectionFactory.RedeliveryPolicy> createDtoConnectionFactoryRedeliveryPolicy(DtoConnectionFactory.RedeliveryPolicy value) {
        return new JAXBElement<DtoConnectionFactory.RedeliveryPolicy>(_DtoXaConnectionFactoryRedeliveryPolicy_QNAME, DtoConnectionFactory.RedeliveryPolicy.class, DtoConnectionFactory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoKahaDB.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoKahaDB.class)
    public JAXBElement<DtoKahaDB.BrokerService> createDtoKahaDBBrokerService(DtoKahaDB.BrokerService value) {
        return new JAXBElement<DtoKahaDB.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoKahaDB.BrokerService.class, DtoKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoKahaDB.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoKahaDB.class)
    public JAXBElement<DtoKahaDB.Locker> createDtoKahaDBLocker(DtoKahaDB.Locker value) {
        return new JAXBElement<DtoKahaDB.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoKahaDB.Locker.class, DtoKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoKahaDB.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoKahaDB.class)
    public JAXBElement<DtoKahaDB.UsageManager> createDtoKahaDBUsageManager(DtoKahaDB.UsageManager value) {
        return new JAXBElement<DtoKahaDB.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoKahaDB.UsageManager.class, DtoKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoKahaDB.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoKahaDB.class)
    public JAXBElement<DtoKahaDB.ScheduledThreadPoolExecutor> createDtoKahaDBScheduledThreadPoolExecutor(DtoKahaDB.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoKahaDB.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoKahaDB.ScheduledThreadPoolExecutor.class, DtoKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoKahaDB.TransactionIdTransformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transactionIdTransformer", scope = DtoKahaDB.class)
    public JAXBElement<DtoKahaDB.TransactionIdTransformer> createDtoKahaDBTransactionIdTransformer(DtoKahaDB.TransactionIdTransformer value) {
        return new JAXBElement<DtoKahaDB.TransactionIdTransformer>(_DtoKahaDBTransactionIdTransformer_QNAME, DtoKahaDB.TransactionIdTransformer.class, DtoKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFixedCountSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoFixedCountSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoFixedCountSubscriptionRecoveryPolicy.Broker> createDtoFixedCountSubscriptionRecoveryPolicyBroker(DtoFixedCountSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoFixedCountSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoFixedCountSubscriptionRecoveryPolicy.Broker.class, DtoFixedCountSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPostgresqlJdbcAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoPostgresqlJdbcAdapter.class)
    public JAXBElement<DtoPostgresqlJdbcAdapter.Statements> createDtoPostgresqlJdbcAdapterStatements(DtoPostgresqlJdbcAdapter.Statements value) {
        return new JAXBElement<DtoPostgresqlJdbcAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoPostgresqlJdbcAdapter.Statements.class, DtoPostgresqlJdbcAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyMap.PolicyEntries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "policyEntries", scope = DtoPolicyMap.class)
    public JAXBElement<DtoPolicyMap.PolicyEntries> createDtoPolicyMapPolicyEntries(DtoPolicyMap.PolicyEntries value) {
        return new JAXBElement<DtoPolicyMap.PolicyEntries>(_DtoPolicyMapPolicyEntries_QNAME, DtoPolicyMap.PolicyEntries.class, DtoPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyMap.DefaultEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "defaultEntry", scope = DtoPolicyMap.class)
    public JAXBElement<DtoPolicyMap.DefaultEntry> createDtoPolicyMapDefaultEntry(DtoPolicyMap.DefaultEntry value) {
        return new JAXBElement<DtoPolicyMap.DefaultEntry>(_DtoRedeliveryPolicyMapDefaultEntry_QNAME, DtoPolicyMap.DefaultEntry.class, DtoPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoPolicyMap.Entries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "entries", scope = DtoPolicyMap.class)
    public JAXBElement<DtoPolicyMap.Entries> createDtoPolicyMapEntries(DtoPolicyMap.Entries value) {
        return new JAXBElement<DtoPolicyMap.Entries>(_DtoRedeliveryPolicyMapEntries_QNAME, DtoPolicyMap.Entries.class, DtoPolicyMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.DefaultEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "defaultEntry", scope = DtoAuthorizationMap.class)
    public JAXBElement<DtoAuthorizationMap.DefaultEntry> createDtoAuthorizationMapDefaultEntry(DtoAuthorizationMap.DefaultEntry value) {
        return new JAXBElement<DtoAuthorizationMap.DefaultEntry>(_DtoRedeliveryPolicyMapDefaultEntry_QNAME, DtoAuthorizationMap.DefaultEntry.class, DtoAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.Entries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "entries", scope = DtoAuthorizationMap.class)
    public JAXBElement<DtoAuthorizationMap.Entries> createDtoAuthorizationMapEntries(DtoAuthorizationMap.Entries value) {
        return new JAXBElement<DtoAuthorizationMap.Entries>(_DtoRedeliveryPolicyMapEntries_QNAME, DtoAuthorizationMap.Entries.class, DtoAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.TempDestinationAuthorizationEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempDestinationAuthorizationEntry", scope = DtoAuthorizationMap.class)
    public JAXBElement<DtoAuthorizationMap.TempDestinationAuthorizationEntry> createDtoAuthorizationMapTempDestinationAuthorizationEntry(DtoAuthorizationMap.TempDestinationAuthorizationEntry value) {
        return new JAXBElement<DtoAuthorizationMap.TempDestinationAuthorizationEntry>(_DtoAuthorizationMapTempDestinationAuthorizationEntry_QNAME, DtoAuthorizationMap.TempDestinationAuthorizationEntry.class, DtoAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoAuthorizationMap.AuthorizationEntries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "authorizationEntries", scope = DtoAuthorizationMap.class)
    public JAXBElement<DtoAuthorizationMap.AuthorizationEntries> createDtoAuthorizationMapAuthorizationEntries(DtoAuthorizationMap.AuthorizationEntries value) {
        return new JAXBElement<DtoAuthorizationMap.AuthorizationEntries>(_DtoAuthorizationMapAuthorizationEntries_QNAME, DtoAuthorizationMap.AuthorizationEntries.class, DtoAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoForcePersistencyModeBroker.AdminConnectionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminConnectionContext", scope = DtoForcePersistencyModeBroker.class)
    public JAXBElement<DtoForcePersistencyModeBroker.AdminConnectionContext> createDtoForcePersistencyModeBrokerAdminConnectionContext(DtoForcePersistencyModeBroker.AdminConnectionContext value) {
        return new JAXBElement<DtoForcePersistencyModeBroker.AdminConnectionContext>(_DtoRedeliveryPluginAdminConnectionContext_QNAME, DtoForcePersistencyModeBroker.AdminConnectionContext.class, DtoForcePersistencyModeBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoForcePersistencyModeBroker.Next }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "next", scope = DtoForcePersistencyModeBroker.class)
    public JAXBElement<DtoForcePersistencyModeBroker.Next> createDtoForcePersistencyModeBrokerNext(DtoForcePersistencyModeBroker.Next value) {
        return new JAXBElement<DtoForcePersistencyModeBroker.Next>(_DtoRedeliveryPluginNext_QNAME, DtoForcePersistencyModeBroker.Next.class, DtoForcePersistencyModeBroker.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLeaseLockerIOExceptionHandler.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoLeaseLockerIOExceptionHandler.class)
    public JAXBElement<DtoLeaseLockerIOExceptionHandler.BrokerService> createDtoLeaseLockerIOExceptionHandlerBrokerService(DtoLeaseLockerIOExceptionHandler.BrokerService value) {
        return new JAXBElement<DtoLeaseLockerIOExceptionHandler.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoLeaseLockerIOExceptionHandler.BrokerService.class, DtoLeaseLockerIOExceptionHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.PersistenceAdapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "persistenceAdapter", scope = DtoFilteredKahaDB.class)
    public JAXBElement<DtoFilteredKahaDB.PersistenceAdapter> createDtoFilteredKahaDBPersistenceAdapter(DtoFilteredKahaDB.PersistenceAdapter value) {
        return new JAXBElement<DtoFilteredKahaDB.PersistenceAdapter>(_DtoBrokerPersistenceAdapter_QNAME, DtoFilteredKahaDB.PersistenceAdapter.class, DtoFilteredKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Destination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "destination", scope = DtoFilteredKahaDB.class)
    public JAXBElement<DtoFilteredKahaDB.Destination> createDtoFilteredKahaDBDestination(DtoFilteredKahaDB.Destination value) {
        return new JAXBElement<DtoFilteredKahaDB.Destination>(_DtoDestinationEntryDestination_QNAME, DtoFilteredKahaDB.Destination.class, DtoFilteredKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Adapter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adapter", scope = DtoFilteredKahaDB.class)
    public JAXBElement<DtoFilteredKahaDB.Adapter> createDtoFilteredKahaDBAdapter(DtoFilteredKahaDB.Adapter value) {
        return new JAXBElement<DtoFilteredKahaDB.Adapter>(_DtoSystemUsageAdapter_QNAME, DtoFilteredKahaDB.Adapter.class, DtoFilteredKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Template }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "template", scope = DtoFilteredKahaDB.class)
    public JAXBElement<DtoFilteredKahaDB.Template> createDtoFilteredKahaDBTemplate(DtoFilteredKahaDB.Template value) {
        return new JAXBElement<DtoFilteredKahaDB.Template>(_DtoFilteredKahaDBTemplate_QNAME, DtoFilteredKahaDB.Template.class, DtoFilteredKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoFilteredKahaDB.Usage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usage", scope = DtoFilteredKahaDB.class)
    public JAXBElement<DtoFilteredKahaDB.Usage> createDtoFilteredKahaDBUsage(DtoFilteredKahaDB.Usage value) {
        return new JAXBElement<DtoFilteredKahaDB.Usage>(_DtoFilteredKahaDBUsage_QNAME, DtoFilteredKahaDB.Usage.class, DtoFilteredKahaDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTopic.Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "properties", scope = DtoTopic.class)
    public JAXBElement<DtoTopic.Properties> createDtoTopicProperties(DtoTopic.Properties value) {
        return new JAXBElement<DtoTopic.Properties>(_DtoXaConnectionFactoryProperties_QNAME, DtoTopic.Properties.class, DtoTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTopic.CompositeDestinations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "compositeDestinations", scope = DtoTopic.class)
    public JAXBElement<DtoTopic.CompositeDestinations> createDtoTopicCompositeDestinations(DtoTopic.CompositeDestinations value) {
        return new JAXBElement<DtoTopic.CompositeDestinations>(_DtoTempQueueCompositeDestinations_QNAME, DtoTopic.CompositeDestinations.class, DtoTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDb2JDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoDb2JDBCAdapter.class)
    public JAXBElement<DtoDb2JDBCAdapter.Statements> createDtoDb2JDBCAdapterStatements(DtoDb2JDBCAdapter.Statements value) {
        return new JAXBElement<DtoDb2JDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoDb2JDBCAdapter.Statements.class, DtoDb2JDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoDefaultIOExceptionHandler.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoDefaultIOExceptionHandler.class)
    public JAXBElement<DtoDefaultIOExceptionHandler.BrokerService> createDtoDefaultIOExceptionHandlerBrokerService(DtoDefaultIOExceptionHandler.BrokerService value) {
        return new JAXBElement<DtoDefaultIOExceptionHandler.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoDefaultIOExceptionHandler.BrokerService.class, DtoDefaultIOExceptionHandler.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBytesJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoBytesJDBCAdapter.class)
    public JAXBElement<DtoBytesJDBCAdapter.Statements> createDtoBytesJDBCAdapterStatements(DtoBytesJDBCAdapter.Statements value) {
        return new JAXBElement<DtoBytesJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoBytesJDBCAdapter.Statements.class, DtoBytesJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.Context }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "context", scope = DtoLDAPAuthorizationMap.class)
    public JAXBElement<DtoLDAPAuthorizationMap.Context> createDtoLDAPAuthorizationMapContext(DtoLDAPAuthorizationMap.Context value) {
        return new JAXBElement<DtoLDAPAuthorizationMap.Context>(_DtoLDAPAuthorizationMapContext_QNAME, DtoLDAPAuthorizationMap.Context.class, DtoLDAPAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.Options }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "options", scope = DtoLDAPAuthorizationMap.class)
    public JAXBElement<DtoLDAPAuthorizationMap.Options> createDtoLDAPAuthorizationMapOptions(DtoLDAPAuthorizationMap.Options value) {
        return new JAXBElement<DtoLDAPAuthorizationMap.Options>(_DtoLDAPAuthorizationMapOptions_QNAME, DtoLDAPAuthorizationMap.Options.class, DtoLDAPAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.QueueSearchMatchingFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "queueSearchMatchingFormat", scope = DtoLDAPAuthorizationMap.class)
    public JAXBElement<DtoLDAPAuthorizationMap.QueueSearchMatchingFormat> createDtoLDAPAuthorizationMapQueueSearchMatchingFormat(DtoLDAPAuthorizationMap.QueueSearchMatchingFormat value) {
        return new JAXBElement<DtoLDAPAuthorizationMap.QueueSearchMatchingFormat>(_DtoLDAPAuthorizationMapQueueSearchMatchingFormat_QNAME, DtoLDAPAuthorizationMap.QueueSearchMatchingFormat.class, DtoLDAPAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLDAPAuthorizationMap.TopicSearchMatchingFormat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "topicSearchMatchingFormat", scope = DtoLDAPAuthorizationMap.class)
    public JAXBElement<DtoLDAPAuthorizationMap.TopicSearchMatchingFormat> createDtoLDAPAuthorizationMapTopicSearchMatchingFormat(DtoLDAPAuthorizationMap.TopicSearchMatchingFormat value) {
        return new JAXBElement<DtoLDAPAuthorizationMap.TopicSearchMatchingFormat>(_DtoLDAPAuthorizationMapTopicSearchMatchingFormat_QNAME, DtoLDAPAuthorizationMap.TopicSearchMatchingFormat.class, DtoLDAPAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLevelDB.BrokerService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "brokerService", scope = DtoLevelDB.class)
    public JAXBElement<DtoLevelDB.BrokerService> createDtoLevelDBBrokerService(DtoLevelDB.BrokerService value) {
        return new JAXBElement<DtoLevelDB.BrokerService>(_DtoPListStoreImplBrokerService_QNAME, DtoLevelDB.BrokerService.class, DtoLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLevelDB.Locker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "locker", scope = DtoLevelDB.class)
    public JAXBElement<DtoLevelDB.Locker> createDtoLevelDBLocker(DtoLevelDB.Locker value) {
        return new JAXBElement<DtoLevelDB.Locker>(_DtoJournaledJDBCLocker_QNAME, DtoLevelDB.Locker.class, DtoLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLevelDB.UsageManager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "usageManager", scope = DtoLevelDB.class)
    public JAXBElement<DtoLevelDB.UsageManager> createDtoLevelDBUsageManager(DtoLevelDB.UsageManager value) {
        return new JAXBElement<DtoLevelDB.UsageManager>(_DtoMemoryPersistenceAdapterUsageManager_QNAME, DtoLevelDB.UsageManager.class, DtoLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLevelDB.ScheduledThreadPoolExecutor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "scheduledThreadPoolExecutor", scope = DtoLevelDB.class)
    public JAXBElement<DtoLevelDB.ScheduledThreadPoolExecutor> createDtoLevelDBScheduledThreadPoolExecutor(DtoLevelDB.ScheduledThreadPoolExecutor value) {
        return new JAXBElement<DtoLevelDB.ScheduledThreadPoolExecutor>(_DtoJournaledJDBCScheduledThreadPoolExecutor_QNAME, DtoLevelDB.ScheduledThreadPoolExecutor.class, DtoLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoLevelDB.TransactionIdTransformer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "transactionIdTransformer", scope = DtoLevelDB.class)
    public JAXBElement<DtoLevelDB.TransactionIdTransformer> createDtoLevelDBTransactionIdTransformer(DtoLevelDB.TransactionIdTransformer value) {
        return new JAXBElement<DtoLevelDB.TransactionIdTransformer>(_DtoKahaDBTransactionIdTransformer_QNAME, DtoLevelDB.TransactionIdTransformer.class, DtoLevelDB.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoBlobJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoBlobJDBCAdapter.class)
    public JAXBElement<DtoBlobJDBCAdapter.Statements> createDtoBlobJDBCAdapterStatements(DtoBlobJDBCAdapter.Statements value) {
        return new JAXBElement<DtoBlobJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoBlobJDBCAdapter.Statements.class, DtoBlobJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOracleJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoOracleJDBCAdapter.class)
    public JAXBElement<DtoOracleJDBCAdapter.Statements> createDtoOracleJDBCAdapterStatements(DtoOracleJDBCAdapter.Statements value) {
        return new JAXBElement<DtoOracleJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoOracleJDBCAdapter.Statements.class, DtoOracleJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoTimedSubscriptionRecoveryPolicy.Broker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "broker", scope = DtoTimedSubscriptionRecoveryPolicy.class)
    public JAXBElement<DtoTimedSubscriptionRecoveryPolicy.Broker> createDtoTimedSubscriptionRecoveryPolicyBroker(DtoTimedSubscriptionRecoveryPolicy.Broker value) {
        return new JAXBElement<DtoTimedSubscriptionRecoveryPolicy.Broker>(_DtoNoSubscriptionRecoveryPolicyBroker_QNAME, DtoTimedSubscriptionRecoveryPolicy.Broker.class, DtoTimedSubscriptionRecoveryPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoOracleBlobJDBCAdapter.Statements }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "statements", scope = DtoOracleBlobJDBCAdapter.class)
    public JAXBElement<DtoOracleBlobJDBCAdapter.Statements> createDtoOracleBlobJDBCAdapterStatements(DtoOracleBlobJDBCAdapter.Statements value) {
        return new JAXBElement<DtoOracleBlobJDBCAdapter.Statements>(_DtoMaxdbJdbcAdapterStatements_QNAME, DtoOracleBlobJDBCAdapter.Statements.class, DtoOracleBlobJDBCAdapter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.WriteACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "writeACLs", scope = DtoSimpleAuthorizationMap.class)
    public JAXBElement<DtoSimpleAuthorizationMap.WriteACLs> createDtoSimpleAuthorizationMapWriteACLs(DtoSimpleAuthorizationMap.WriteACLs value) {
        return new JAXBElement<DtoSimpleAuthorizationMap.WriteACLs>(_DtoTempDestinationAuthorizationEntryWriteACLs_QNAME, DtoSimpleAuthorizationMap.WriteACLs.class, DtoSimpleAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.ReadACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "readACLs", scope = DtoSimpleAuthorizationMap.class)
    public JAXBElement<DtoSimpleAuthorizationMap.ReadACLs> createDtoSimpleAuthorizationMapReadACLs(DtoSimpleAuthorizationMap.ReadACLs value) {
        return new JAXBElement<DtoSimpleAuthorizationMap.ReadACLs>(_DtoTempDestinationAuthorizationEntryReadACLs_QNAME, DtoSimpleAuthorizationMap.ReadACLs.class, DtoSimpleAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.AdminACLs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "adminACLs", scope = DtoSimpleAuthorizationMap.class)
    public JAXBElement<DtoSimpleAuthorizationMap.AdminACLs> createDtoSimpleAuthorizationMapAdminACLs(DtoSimpleAuthorizationMap.AdminACLs value) {
        return new JAXBElement<DtoSimpleAuthorizationMap.AdminACLs>(_DtoTempDestinationAuthorizationEntryAdminACLs_QNAME, DtoSimpleAuthorizationMap.AdminACLs.class, DtoSimpleAuthorizationMap.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activemq.apache.org/schema/core", name = "tempDestinationAuthorizationEntry", scope = DtoSimpleAuthorizationMap.class)
    public JAXBElement<DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry> createDtoSimpleAuthorizationMapTempDestinationAuthorizationEntry(DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry value) {
        return new JAXBElement<DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry>(_DtoAuthorizationMapTempDestinationAuthorizationEntry_QNAME, DtoSimpleAuthorizationMap.TempDestinationAuthorizationEntry.class, DtoSimpleAuthorizationMap.class, value);
    }

}
