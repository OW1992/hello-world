package de.innovas.iaf.bva_server.services;

import de.innovas.iaf.base_common.core.configuration.ConfigurationAccess;
import de.innovas.iaf.base_common.core.configuration.IafConfiguration;

/**
 * Konfigurationen für Doxis
 */
public class DoxisConfiguration {

   @IafConfiguration
   private ConfigurationAccess m_configuration;

   public static final String DOXIS_CONNECTION = "doxis.connection";
   public static final String DOXIS_CONNECTION_URL = DOXIS_CONNECTION_DOT + "url";
   public static final String DOXIS_CONNECTION_USERNAME = DOXIS_CONNECTION_DOT + "username";
   public static final String DOXIS_CONNECTION_PASSWORD = DOXIS_CONNECTION_DOT + "password";
   public static final String DOXIS_DOCUMENT_TYPE_UUID = "documentTypeUUID";
   public static final String CUSTOMER_NAME = "customerName";
   public static final String MEDIA_TYPE = "mediaType";
   public static final String CONTENT_DISPOSITION_FOR_PARAMS = "contentDispositionForParams";
   public static final String CONTENT_DISPOSITION_FOR_INPUT = "contentDispositionForInput";
   public static final String CONTENT_DISPOSITION_FOR_RELATIONSHIP_PARAMS = "contentDispositionForRelationshipParams";

   public String getUrl() {
      return m_configuration.getValue(DOXIS_CONNECTION_URL);
   }

   public String getRepositoryId() {
      return m_configuration.getValue(DOXIS_CONNECTION_REPOSITORY_ID, "BVA");
      //Test Comment
   }

   public String getUser() {
      
      return m_configuration.getValue(DOXIS_CONNECTION_USERNAME);
   }

   public String getPassword() {
      return m_configuration.getValue(DOXIS_CONNECTION_PASSWORD);
   }

   public String getDocumentTypeUuid() {
      return m_configuration.getValue(DOXIS_DOCUMENT_TYPE_UUID);
   }

   public String testMethode() {
      return "";
   }
   
   public String getCustomerName() {
      return m_configuration.getValue(CUSTOMER_NAME);
   }

   public String getMediaType() {
      return m_configuration.getValue(MEDIA_TYPE);
   }

   public String getContentDispositionForParams() {
      return m_configuration.getValue(CONTENT_DISPOSITION_FOR_PARAMS);
   }

   public String getContentDispositionForInput() {
      return m_configuration.getValue(CONTENT_DISPOSITION_FOR_INPUT);
   }

   public String getContentDispositionForRelationshipParams() {
      return m_configuration.getValue(CONTENT_DISPOSITION_FOR_RELATIONSHIP_PARAMS);
   }

}
