
package com.zapi.rest.client;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 * Generated using ~/Tools/wadl-dist-1.1.5/bin/wadl2java -o src/main/java/ -p com.thed.zapi.rest -a src/main/wadl/zapi_1.2.wadl
 */
@Generated(value = {
    "wadl|file:/Users/smangal/Products/ZATLAS-AUX/zapi-maven-plugin/src/main/wadl/zapi_1.2.wadl"
}, comments = "wadl2java, http://wadl.java.net", date = "2014-01-30T22:03:51.352-08:00")
public class ZapiRestClient {

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://appledemo.local:2990/jira/rest/zapi/latest/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is = ZapiRestClient.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is!=null) {
            try {
                // Ignore the namespace in the catalog, can't use wildcard until
                // we are sure we have XPath 2.0
                String found = javax.xml.xpath.XPathFactory.newInstance().newXPath().evaluate(
                    "/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI +"']/@uri", 
                    new org.xml.sax.InputSource(is)); 
                if (found!=null && found.length()>0) {
                    originalURI = java.net.URI.create(found);
                }
                
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    is.close();
                } catch (java.io.IOException e) {
                }
            }
        }
        BASE_URI = originalURI;
    }

    public static ZapiRestClient.Audit audit(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Audit(client, baseURI);
    }

    /**
     * Template method to allow tooling to customize the new Client
     * 
     */
    private static void customizeClientConfiguration(ClientConfig cc) {
    }

    /**
     * Template method to allow tooling to override Client factory
     * 
     */
    private static com.sun.jersey.api.client.Client createClientInstance(ClientConfig cc) {
        return com.sun.jersey.api.client.Client.create(cc);
    }

    /**
     * Create a new Client instance
     * 
     */
    public static com.sun.jersey.api.client.Client createClient() {
        ClientConfig cc = new DefaultClientConfig();
        customizeClientConfiguration(cc);
        return createClientInstance(cc);
    }

    public static ZapiRestClient.Audit audit() {
        return audit(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Audit audit(com.sun.jersey.api.client.Client client) {
        return audit(client, BASE_URI);
    }

    public static ZapiRestClient.Issues issues(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Issues(client, baseURI);
    }

    public static ZapiRestClient.Issues issues() {
        return issues(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Issues issues(com.sun.jersey.api.client.Client client) {
        return issues(client, BASE_URI);
    }

    public static ZapiRestClient.Attachment attachment(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Attachment(client, baseURI);
    }

    public static ZapiRestClient.Attachment attachment() {
        return attachment(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Attachment attachment(com.sun.jersey.api.client.Client client) {
        return attachment(client, BASE_URI);
    }

    public static ZapiRestClient.ModuleInfo moduleInfo(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.ModuleInfo(client, baseURI);
    }

    public static ZapiRestClient.ModuleInfo moduleInfo() {
        return moduleInfo(createClient(), BASE_URI);
    }

    public static ZapiRestClient.ModuleInfo moduleInfo(com.sun.jersey.api.client.Client client) {
        return moduleInfo(client, BASE_URI);
    }

    public static ZapiRestClient.AttachTemporaryFile attachTemporaryFile(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.AttachTemporaryFile(client, baseURI);
    }

    public static ZapiRestClient.AttachTemporaryFile attachTemporaryFile() {
        return attachTemporaryFile(createClient(), BASE_URI);
    }

    public static ZapiRestClient.AttachTemporaryFile attachTemporaryFile(com.sun.jersey.api.client.Client client) {
        return attachTemporaryFile(client, BASE_URI);
    }

    public static ZapiRestClient.SystemInfo systemInfo(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.SystemInfo(client, baseURI);
    }

    public static ZapiRestClient.SystemInfo systemInfo() {
        return systemInfo(createClient(), BASE_URI);
    }

    public static ZapiRestClient.SystemInfo systemInfo(com.sun.jersey.api.client.Client client) {
        return systemInfo(client, BASE_URI);
    }

    public static ZapiRestClient.Znav znav(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Znav(client, baseURI);
    }

    public static ZapiRestClient.Znav znav() {
        return znav(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Znav znav(com.sun.jersey.api.client.Client client) {
        return znav(client, BASE_URI);
    }

    public static ZapiRestClient.TeststepIssueId teststepIssueId(com.sun.jersey.api.client.Client client, URI baseURI, Long issueid) {
        return new ZapiRestClient.TeststepIssueId(client, baseURI, issueid);
    }

    public static ZapiRestClient.TeststepIssueId teststepIssueId(Long issueid) {
        return teststepIssueId(createClient(), BASE_URI, issueid);
    }

    public static ZapiRestClient.TeststepIssueId teststepIssueId(com.sun.jersey.api.client.Client client, Long issueid) {
        return teststepIssueId(client, BASE_URI, issueid);
    }

    public static ZapiRestClient.StepResult stepResult(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.StepResult(client, baseURI);
    }

    public static ZapiRestClient.StepResult stepResult() {
        return stepResult(createClient(), BASE_URI);
    }

    public static ZapiRestClient.StepResult stepResult(com.sun.jersey.api.client.Client client) {
        return stepResult(client, BASE_URI);
    }

    public static ZapiRestClient.Picker picker(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Picker(client, baseURI);
    }

    public static ZapiRestClient.Picker picker() {
        return picker(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Picker picker(com.sun.jersey.api.client.Client client) {
        return picker(client, BASE_URI);
    }

    public static ZapiRestClient.ZqlAutocomplete zqlAutocomplete(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.ZqlAutocomplete(client, baseURI);
    }

    public static ZapiRestClient.ZqlAutocomplete zqlAutocomplete() {
        return zqlAutocomplete(createClient(), BASE_URI);
    }

    public static ZapiRestClient.ZqlAutocomplete zqlAutocomplete(com.sun.jersey.api.client.Client client) {
        return zqlAutocomplete(client, BASE_URI);
    }

    public static ZapiRestClient.Execution execution(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Execution(client, baseURI);
    }

    public static ZapiRestClient.Execution execution() {
        return execution(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Execution execution(com.sun.jersey.api.client.Client client) {
        return execution(client, BASE_URI);
    }

    public static ZapiRestClient.ZqlExecutionFilter zqlExecutionFilter(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.ZqlExecutionFilter(client, baseURI);
    }

    public static ZapiRestClient.ZqlExecutionFilter zqlExecutionFilter() {
        return zqlExecutionFilter(createClient(), BASE_URI);
    }

    public static ZapiRestClient.ZqlExecutionFilter zqlExecutionFilter(com.sun.jersey.api.client.Client client) {
        return zqlExecutionFilter(client, BASE_URI);
    }

    public static ZapiRestClient.Cycle cycle(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Cycle(client, baseURI);
    }

    public static ZapiRestClient.Cycle cycle() {
        return cycle(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Cycle cycle(com.sun.jersey.api.client.Client client) {
        return cycle(client, BASE_URI);
    }

    public static ZapiRestClient.License license(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.License(client, baseURI);
    }

    public static ZapiRestClient.License license() {
        return license(createClient(), BASE_URI);
    }

    public static ZapiRestClient.License license(com.sun.jersey.api.client.Client client) {
        return license(client, BASE_URI);
    }

    public static ZapiRestClient.Test test(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Test(client, baseURI);
    }

    public static ZapiRestClient.Test test() {
        return test(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Test test(com.sun.jersey.api.client.Client client) {
        return test(client, BASE_URI);
    }

    public static ZapiRestClient.Zql zql(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Zql(client, baseURI);
    }

    public static ZapiRestClient.Zql zql() {
        return zql(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Zql zql(com.sun.jersey.api.client.Client client) {
        return zql(client, BASE_URI);
    }

    public static ZapiRestClient.Zchart zchart(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Zchart(client, baseURI);
    }

    public static ZapiRestClient.Zchart zchart() {
        return zchart(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Zchart zchart(com.sun.jersey.api.client.Client client) {
        return zchart(client, BASE_URI);
    }

    public static ZapiRestClient.Util util(com.sun.jersey.api.client.Client client, URI baseURI) {
        return new ZapiRestClient.Util(client, baseURI);
    }

    public static ZapiRestClient.Util util() {
        return util(createClient(), BASE_URI);
    }

    public static ZapiRestClient.Util util(com.sun.jersey.api.client.Client client) {
        return util(client, BASE_URI);
    }

    public static class Attachment {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Attachment(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Attachment(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("attachment");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T postAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postAsJson(Integer entityid, String entitytype, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (entityid == null) {
            }
            if (entityid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
            }
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postAsJson(Integer entityid, String entitytype, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (entityid == null) {
            }
            if (entityid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
            }
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.Attachment.AttachmentsByEntity attachmentsByEntity() {
            return new ZapiRestClient.Attachment.AttachmentsByEntity(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Attachment.Id id(Long id) {
            return new ZapiRestClient.Attachment.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class AttachmentsByEntity {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private AttachmentsByEntity(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public AttachmentsByEntity(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/attachmentsByEntity");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Integer entityid, String entitytype, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (entityid == null) {
                }
                if (entityid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
                }
                if (entitytype == null) {
                }
                if (entitytype!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Integer entityid, String entitytype, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (entityid == null) {
                }
                if (entityid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
                }
                if (entitytype == null) {
                }
                if (entitytype!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/attachment/{id}");
                } else {
                    template.append("attachment/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Attachment.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Attachment.Id(_client, copyUriBuilder, copyMap);
            }

            public<T >T deleteAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class AttachTemporaryFile {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private AttachTemporaryFile(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public AttachTemporaryFile(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("attachTemporaryFile");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T postAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postAsJson(String filename, Long projectid, Long entityid, String entitytype, Long size, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (filename == null) {
            }
            if (filename!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("filename", filename);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("filename", ((Object[]) null));
            }
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (entityid == null) {
            }
            if (entityid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
            }
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            if (size == null) {
            }
            if (size!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("size", size);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("size", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postAsJson(String filename, Long projectid, Long entityid, String entitytype, Long size, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (filename == null) {
            }
            if (filename!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("filename", filename);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("filename", ((Object[]) null));
            }
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (entityid == null) {
            }
            if (entityid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", entityid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityId", ((Object[]) null));
            }
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            if (size == null) {
            }
            if (size!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("size", size);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("size", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Audit {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Audit(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Audit(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("audit");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(String entitytype, String event, String user, Integer offset, Integer maxrecords, Integer issueid, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            if (event == null) {
            }
            if (event!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("event", event);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("event", ((Object[]) null));
            }
            if (user == null) {
            }
            if (user!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("user", user);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("user", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (maxrecords == null) {
            }
            if (maxrecords!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
            }
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(String entitytype, String event, String user, Integer offset, Integer maxrecords, Integer issueid, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (entitytype == null) {
            }
            if (entitytype!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", entitytype);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("entityType", ((Object[]) null));
            }
            if (event == null) {
            }
            if (event!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("event", event);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("event", ((Object[]) null));
            }
            if (user == null) {
            }
            if (user!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("user", user);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("user", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (maxrecords == null) {
            }
            if (maxrecords!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
            }
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Cycle {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Cycle(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Cycle(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("cycle");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(Long projectid, Long versionid, Long id, Integer offset, String issueid, String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (versionid == null) {
            }
            if (versionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
            }
            if (id == null) {
            }
            if (id!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("id", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            if (expand == null) {
            }
            if (expand!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Long projectid, Long versionid, Long id, Integer offset, String issueid, String expand, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (versionid == null) {
            }
            if (versionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
            }
            if (id == null) {
            }
            if (id!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("id", id);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("id", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            if (expand == null) {
            }
            if (expand!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T putJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.Cycle.Id id(Long id) {
            return new ZapiRestClient.Cycle.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Cycle.IdExport idExport(Integer id) {
            return new ZapiRestClient.Cycle.IdExport(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Cycle.IdMove idMove(Long id) {
            return new ZapiRestClient.Cycle.IdMove(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Cycle.IdCopy idCopy(Long id) {
            return new ZapiRestClient.Cycle.IdCopy(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/cycle/{id}");
                } else {
                    template.append("cycle/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Cycle.Id setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Cycle.Id(_client, copyUriBuilder, copyMap);
            }

            @SuppressWarnings("deprecation")
			public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T deleteAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdCopy {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdCopy(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdCopy(com.sun.jersey.api.client.Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/copy");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdCopy(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/cycle/{id}/copy");
                } else {
                    template.append("cycle/{id}/copy");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Cycle.IdCopy setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Cycle.IdCopy(_client, copyUriBuilder, copyMap);
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdExport {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdExport(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdExport(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/export");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdExport(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/cycle/{id}/export");
                } else {
                    template.append("cycle/{id}/export");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Cycle.IdExport setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Cycle.IdExport(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Long versionid, Long projectid, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Long versionid, Long projectid, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdMove {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdMove(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdMove(com.sun.jersey.api.client.Client client, URI baseUri, Long id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/move");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdMove(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/cycle/{id}/move");
                } else {
                    template.append("cycle/{id}/move");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Long getId() {
                return ((Long) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Cycle.IdMove setId(Long id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Cycle.IdMove(_client, copyUriBuilder, copyMap);
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Execution {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Execution(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Execution(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("execution");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(Integer issueid, Long projectid, Long versionid, Integer cycleid, Integer offset, String action, String sorter, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (versionid == null) {
            }
            if (versionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
            }
            if (cycleid == null) {
            }
            if (cycleid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", cycleid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (action == null) {
            }
            if (action!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("action", action);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("action", ((Object[]) null));
            }
            if (sorter == null) {
            }
            if (sorter!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("sorter", sorter);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("sorter", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Integer issueid, Long projectid, Long versionid, Integer cycleid, Integer offset, String action, String sorter, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (issueid == null) {
            }
            if (issueid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", issueid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("issueId", ((Object[]) null));
            }
            if (projectid == null) {
            }
            if (projectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
            }
            if (versionid == null) {
            }
            if (versionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
            }
            if (cycleid == null) {
            }
            if (cycleid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", cycleid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (action == null) {
            }
            if (action!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("action", action);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("action", ((Object[]) null));
            }
            if (sorter == null) {
            }
            if (sorter!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("sorter", sorter);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("sorter", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.Execution.UpdateBulkStatus updateBulkStatus() {
            return new ZapiRestClient.Execution.UpdateBulkStatus(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.Id id(Integer id) {
            return new ZapiRestClient.Execution.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Execution.IdDefects idDefects(Integer id) {
            return new ZapiRestClient.Execution.IdDefects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Execution.Count count() {
            return new ZapiRestClient.Execution.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.TopDefects topDefects() {
            return new ZapiRestClient.Execution.TopDefects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.IndexAll indexAll() {
            return new ZapiRestClient.Execution.IndexAll(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.IndexStatusToken indexStatusToken(Long token) {
            return new ZapiRestClient.Execution.IndexStatusToken(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), token);
        }

        public ZapiRestClient.Execution.UpdateWithBulkDefects updateWithBulkDefects() {
            return new ZapiRestClient.Execution.UpdateWithBulkDefects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.IdQuickExecute idQuickExecute(Integer id) {
            return new ZapiRestClient.Execution.IdQuickExecute(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Execution.IdExecute idExecute(Integer id) {
            return new ZapiRestClient.Execution.IdExecute(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.Execution.DeleteExecutions deleteExecutions() {
            return new ZapiRestClient.Execution.DeleteExecutions(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.AddTestsToCycle addTestsToCycle() {
            return new ZapiRestClient.Execution.AddTestsToCycle(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.RefreshRemoteLinks refreshRemoteLinks() {
            return new ZapiRestClient.Execution.RefreshRemoteLinks(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.Export export() {
            return new ZapiRestClient.Execution.Export(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Execution.NavigatorId navigatorId(Integer id) {
            return new ZapiRestClient.Execution.NavigatorId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class AddTestsToCycle {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private AddTestsToCycle(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public AddTestsToCycle(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/executeTest/");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Count {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Long projectid, Long versionid, String groupfld, Integer cycleid, String daysprevious, String periodname, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (groupfld == null) {
                }
                if (groupfld!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", groupfld);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", ((Object[]) null));
                }
                if (cycleid == null) {
                }
                if (cycleid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", cycleid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", ((Object[]) null));
                }
                if (daysprevious == null) {
                }
                if (daysprevious!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", daysprevious);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", ((Object[]) null));
                }
                if (periodname == null) {
                }
                if (periodname!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", periodname);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Long projectid, Long versionid, String groupfld, Integer cycleid, String daysprevious, String periodname, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (groupfld == null) {
                }
                if (groupfld!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", groupfld);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", ((Object[]) null));
                }
                if (cycleid == null) {
                }
                if (cycleid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", cycleid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("cycleId", ((Object[]) null));
                }
                if (daysprevious == null) {
                }
                if (daysprevious!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", daysprevious);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", ((Object[]) null));
                }
                if (periodname == null) {
                }
                if (periodname!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", periodname);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class DeleteExecutions {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private DeleteExecutions(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public DeleteExecutions(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/deleteExecutions");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T deleteJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Export {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Export(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Export(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/export");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/{id}");
                } else {
                    template.append("execution/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Execution.Id setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Execution.Id(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String expand, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T deleteAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdDefects {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdDefects(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdDefects(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/defects");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdDefects(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/{id}/defects");
                } else {
                    template.append("execution/{id}/defects");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Execution.IdDefects setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Execution.IdDefects(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdExecute {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdExecute(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdExecute(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/execute");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdExecute(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/{id}/execute");
                } else {
                    template.append("execution/{id}/execute");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Execution.IdExecute setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Execution.IdExecute(_client, copyUriBuilder, copyMap);
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdQuickExecute {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdQuickExecute(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdQuickExecute(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}/quickExecute");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }
/*
            *//**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             *//*
            public IdQuickExecute(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/{id}/quickExecute");
                } else {
                    template.append("execution/{id}/quickExecute");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            *//**
             * Get id
             * 
             *//*
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            *//**
             * Duplicate state and set id
             * 
             *//*
            public ZapiRestClient.Execution.IdQuickExecute setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Execution.IdQuickExecute(_client, copyUriBuilder, copyMap);
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }
*/
        }

        public static class IndexAll {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IndexAll(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IndexAll(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/indexAll");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IndexStatusToken {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IndexStatusToken(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IndexStatusToken(com.sun.jersey.api.client.Client client, URI baseUri, Long token) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/indexStatus/{token}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("token", token);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IndexStatusToken(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/indexStatus/{token}");
                } else {
                    template.append("execution/indexStatus/{token}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get token
             * 
             */
            public Long getToken() {
                return ((Long) _templateAndMatrixParameterValues.get("token"));
            }

            /**
             * Duplicate state and set token
             * 
             */
            public ZapiRestClient.Execution.IndexStatusToken setToken(Long token) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("token", token);
                return new ZapiRestClient.Execution.IndexStatusToken(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class NavigatorId {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private NavigatorId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public NavigatorId(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/navigator/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public NavigatorId(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/execution/navigator/{id}");
                } else {
                    template.append("execution/navigator/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Execution.NavigatorId setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Execution.NavigatorId(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String zql, Integer offset, Integer maxrecords, String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zql == null) {
                }
                if (zql!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zql", zql);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zql", ((Object[]) null));
                }
                if (offset == null) {
                }
                if (offset!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String zql, Integer offset, Integer maxrecords, String expand, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zql == null) {
                }
                if (zql!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zql", zql);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zql", ((Object[]) null));
                }
                if (offset == null) {
                }
                if (offset!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class RefreshRemoteLinks {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private RefreshRemoteLinks(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public RefreshRemoteLinks(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/refreshRemoteLinks");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class TopDefects {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private TopDefects(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public TopDefects(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/topDefects");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Integer projectid, Integer versionid, String issuestatuses, String howmany, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (issuestatuses == null) {
                }
                if (issuestatuses!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("issueStatuses", issuestatuses);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("issueStatuses", ((Object[]) null));
                }
                if (howmany == null) {
                }
                if (howmany!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("howMany", howmany);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("howMany", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Integer projectid, Integer versionid, String issuestatuses, String howmany, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (issuestatuses == null) {
                }
                if (issuestatuses!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("issueStatuses", issuestatuses);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("issueStatuses", ((Object[]) null));
                }
                if (howmany == null) {
                }
                if (howmany!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("howMany", howmany);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("howMany", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class UpdateBulkStatus {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private UpdateBulkStatus(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public UpdateBulkStatus(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/updateBulkStatus");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class UpdateWithBulkDefects {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private UpdateWithBulkDefects(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public UpdateWithBulkDefects(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/updateWithBulkDefects");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Issues {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Issues(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Issues(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("issues");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(String query, String currentjql, String currentissuekey, String currentprojectid, Boolean showsubtasks, Boolean showsubtaskparent, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (query == null) {
            }
            if (query!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
            }
            if (currentjql == null) {
            }
            if (currentjql!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentJQL", currentjql);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentJQL", ((Object[]) null));
            }
            if (currentissuekey == null) {
            }
            if (currentissuekey!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentIssueKey", currentissuekey);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentIssueKey", ((Object[]) null));
            }
            if (currentprojectid == null) {
            }
            if (currentprojectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentProjectId", currentprojectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentProjectId", ((Object[]) null));
            }
            if (showsubtasks == null) {
            }
            if (showsubtasks!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTasks", showsubtasks);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTasks", ((Object[]) null));
            }
            if (showsubtaskparent == null) {
            }
            if (showsubtaskparent!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTaskParent", showsubtaskparent);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTaskParent", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(String query, String currentjql, String currentissuekey, String currentprojectid, Boolean showsubtasks, Boolean showsubtaskparent, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (query == null) {
            }
            if (query!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
            }
            if (currentjql == null) {
            }
            if (currentjql!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentJQL", currentjql);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentJQL", ((Object[]) null));
            }
            if (currentissuekey == null) {
            }
            if (currentissuekey!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentIssueKey", currentissuekey);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentIssueKey", ((Object[]) null));
            }
            if (currentprojectid == null) {
            }
            if (currentprojectid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentProjectId", currentprojectid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("currentProjectId", ((Object[]) null));
            }
            if (showsubtasks == null) {
            }
            if (showsubtasks!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTasks", showsubtasks);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTasks", ((Object[]) null));
            }
            if (showsubtaskparent == null) {
            }
            if (showsubtaskparent!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTaskParent", showsubtaskparent);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("showSubTaskParent", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class License {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private License(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public License(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("license");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class ModuleInfo {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private ModuleInfo(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public ModuleInfo(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("moduleInfo");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Picker {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Picker(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Picker(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("picker");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Picker.Filters filters() {
            return new ZapiRestClient.Picker.Filters(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Filters {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Filters(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Filters(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("filters");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String query, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String query, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class StepResult {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private StepResult(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public StepResult(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("stepResult");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(String executionid, String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (executionid == null) {
            }
            if (executionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("executionId", executionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("executionId", ((Object[]) null));
            }
            if (expand == null) {
            }
            if (expand!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(String executionid, String expand, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (executionid == null) {
            }
            if (executionid!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("executionId", executionid);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("executionId", ((Object[]) null));
            }
            if (expand == null) {
            }
            if (expand!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.StepResult.Id id(Integer id) {
            return new ZapiRestClient.StepResult.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.StepResult.IdQuickExecute idQuickExecute(Integer id) {
            return new ZapiRestClient.StepResult.IdQuickExecute(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.StepResult.IdDefects idDefects(Integer id) {
            return new ZapiRestClient.StepResult.IdDefects(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/stepResult/{id}");
                } else {
                    template.append("stepResult/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.StepResult.Id setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.StepResult.Id(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String expand, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdDefects {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdDefects(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdDefects(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}/defects");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdDefects(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/stepResult/{id}/defects");
                } else {
                    template.append("stepResult/{id}/defects");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.StepResult.IdDefects setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.StepResult.IdDefects(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdQuickExecute {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdQuickExecute(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdQuickExecute(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}/quickExecute");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdQuickExecute(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/stepResult/{id}/quickExecute");
                } else {
                    template.append("stepResult/{id}/quickExecute");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.StepResult.IdQuickExecute setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.StepResult.IdQuickExecute(_client, copyUriBuilder, copyMap);
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class SystemInfo {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private SystemInfo(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public SystemInfo(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("systemInfo");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class Test {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Test(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Test(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("test");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Test.Count count() {
            return new ZapiRestClient.Test.Count(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Test.MySearchesId mySearchesId(String id) {
            return new ZapiRestClient.Test.MySearchesId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class Count {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Count(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Count(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/count");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Long projectid, Long versionid, String groupfld, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (groupfld == null) {
                }
                if (groupfld!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", groupfld);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Long projectid, Long versionid, String groupfld, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                if (groupfld == null) {
                }
                if (groupfld!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", groupfld);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("groupFld", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class MySearchesId {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private MySearchesId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public MySearchesId(com.sun.jersey.api.client.Client client, URI baseUri, String id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/mySearches/{id}/");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public MySearchesId(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/test/mySearches/{id}/");
                } else {
                    template.append("test/mySearches/{id}/");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public String getId() {
                return ((String) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Test.MySearchesId setId(String id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Test.MySearchesId(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class TeststepIssueId {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private TeststepIssueId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public TeststepIssueId(com.sun.jersey.api.client.Client client, URI baseUri, Long issueid) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("teststep/{issueId}");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
            _templateAndMatrixParameterValues.put("issueId", issueid);
        }

        /**
         * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
         * 
         */
        public TeststepIssueId(com.sun.jersey.api.client.Client client, URI uri) {
            _client = client;
            StringBuilder template = new StringBuilder(BASE_URI.toString());
            if (template.charAt((template.length()- 1))!= '/') {
                template.append("/teststep/{issueId}");
            } else {
                template.append("teststep/{issueId}");
            }
            _uriBuilder = UriBuilder.fromPath(template.toString());
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
            com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
            HashMap<String, String> parameters = new HashMap<String, String>();
            uriTemplate.match(uri.toString(), parameters);
            _templateAndMatrixParameterValues.putAll(parameters);
        }

        /**
         * Get issueId
         * 
         */
        public Long getIssueid() {
            return ((Long) _templateAndMatrixParameterValues.get("issueId"));
        }

        /**
         * Duplicate state and set issueId
         * 
         */
        public ZapiRestClient.TeststepIssueId setIssueid(Long issueid) {
            Map<String, Object> copyMap;
            copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
            UriBuilder copyUriBuilder = _uriBuilder.clone();
            copyMap.put("issueId", issueid);
            return new ZapiRestClient.TeststepIssueId(_client, copyUriBuilder, copyMap);
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.TeststepIssueId.Id id(Integer id) {
            return new ZapiRestClient.TeststepIssueId.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.TeststepIssueId.IdMove idMove(Integer id) {
            return new ZapiRestClient.TeststepIssueId.IdMove(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.TeststepIssueId.CloneFromStepId cloneFromStepId(Long fromstepid) {
            return new ZapiRestClient.TeststepIssueId.CloneFromStepId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), fromstepid);
        }

        public static class CloneFromStepId {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private CloneFromStepId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public CloneFromStepId(com.sun.jersey.api.client.Client client, URI baseUri, Long fromstepid) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("clone/{fromStepId}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("fromStepId", fromstepid);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public CloneFromStepId(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/teststep/{issueId}/clone/{fromStepId}");
                } else {
                    template.append("teststep/{issueId}/clone/{fromStepId}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get fromStepId
             * 
             */
            public Long getFromstepid() {
                return ((Long) _templateAndMatrixParameterValues.get("fromStepId"));
            }

            /**
             * Duplicate state and set fromStepId
             * 
             */
            public ZapiRestClient.TeststepIssueId.CloneFromStepId setFromstepid(Long fromstepid) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("fromStepId", fromstepid);
                return new ZapiRestClient.TeststepIssueId.CloneFromStepId(_client, copyUriBuilder, copyMap);
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/teststep/{issueId}/{id}");
                } else {
                    template.append("teststep/{issueId}/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.TeststepIssueId.Id setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.TeststepIssueId.Id(_client, copyUriBuilder, copyMap);
            }

            public<T >T deleteAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class IdMove {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IdMove(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IdMove(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("{id}/move");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public IdMove(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/teststep/{issueId}/{id}/move");
                } else {
                    template.append("teststep/{issueId}/{id}/move");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.TeststepIssueId.IdMove setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.TeststepIssueId.IdMove(_client, copyUriBuilder, copyMap);
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Util {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Util(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Util(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("util");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Util.ProjectList projectList() {
            return new ZapiRestClient.Util.ProjectList(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Util.VersionBoardList versionBoardList() {
            return new ZapiRestClient.Util.VersionBoardList(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Util.TestExecutionStatus testExecutionStatus() {
            return new ZapiRestClient.Util.TestExecutionStatus(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Util.CycleCriteriaInfo cycleCriteriaInfo() {
            return new ZapiRestClient.Util.CycleCriteriaInfo(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Util.TeststepExecutionStatus teststepExecutionStatus() {
            return new ZapiRestClient.Util.TeststepExecutionStatus(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Util.Dashboard dashboard() {
            return new ZapiRestClient.Util.Dashboard(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class CycleCriteriaInfo {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private CycleCriteriaInfo(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public CycleCriteriaInfo(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/cycleCriteriaInfo");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String projectid, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String projectid, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Dashboard {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Dashboard(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Dashboard(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/dashboard");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String query, Integer maxrecords, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String query, Integer maxrecords, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class ProjectList {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private ProjectList(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public ProjectList(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/project-list");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class TestExecutionStatus {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private TestExecutionStatus(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public TestExecutionStatus(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/testExecutionStatus");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class TeststepExecutionStatus {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private TeststepExecutionStatus(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public TeststepExecutionStatus(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/teststepExecutionStatus");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class VersionBoardList {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private VersionBoardList(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public VersionBoardList(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/versionBoard-list");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String projectid, String versionid, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String projectid, String versionid, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                if (versionid == null) {
                }
                if (versionid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", versionid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("versionId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }


    /**
     * Workaround for JAX_RS_SPEC-312
     * 
     */
    private static class WebApplicationExceptionMessage
        extends WebApplicationException
    {


        private WebApplicationExceptionMessage(Response response) {
            super(response);
        }

        /**
         * Workaround for JAX_RS_SPEC-312
         * 
         */
        public String getMessage() {
            Response response = getResponse();
            Response.Status status = Response.Status.fromStatusCode(response.getStatus());
            if (status!= null) {
                return (response.getStatus()+(" "+ status.getReasonPhrase()));
            } else {
                return Integer.toString(response.getStatus());
            }
        }

        public String toString() {
            String s = "javax.ws.rs.WebApplicationException";
            String message = getLocalizedMessage();
            return (s +(": "+ message));
        }

    }

    public static class Zchart {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Zchart(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Zchart(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("zchart");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Zchart.IssueStatuses issueStatuses() {
            return new ZapiRestClient.Zchart.IssueStatuses(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Zchart.TestsCreated testsCreated() {
            return new ZapiRestClient.Zchart.TestsCreated(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class IssueStatuses {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private IssueStatuses(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public IssueStatuses(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/issueStatuses");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Long projectid, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Long projectid, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectid == null) {
                }
                if (projectid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", projectid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class TestsCreated {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private TestsCreated(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public TestsCreated(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/testsCreated");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String projectkey, String daysprevious, String periodname, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectkey == null) {
                }
                if (projectkey!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectKey", projectkey);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectKey", ((Object[]) null));
                }
                if (daysprevious == null) {
                }
                if (daysprevious!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", daysprevious);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", ((Object[]) null));
                }
                if (periodname == null) {
                }
                if (periodname!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", periodname);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String projectkey, String daysprevious, String periodname, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (projectkey == null) {
                }
                if (projectkey!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectKey", projectkey);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("projectKey", ((Object[]) null));
                }
                if (daysprevious == null) {
                }
                if (daysprevious!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", daysprevious);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("daysPrevious", ((Object[]) null));
                }
                if (periodname == null) {
                }
                if (periodname!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", periodname);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("periodName", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Znav {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Znav(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Znav(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("znav");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Znav.AvailableColumns availableColumns() {
            return new ZapiRestClient.Znav.AvailableColumns(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Znav.SaveColumnItems saveColumnItems() {
            return new ZapiRestClient.Znav.SaveColumnItems(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Znav.UpdateColumnItemsId updateColumnItemsId(Integer id) {
            return new ZapiRestClient.Znav.UpdateColumnItemsId(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public static class AvailableColumns {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private AvailableColumns(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public AvailableColumns(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/availableColumns");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(Integer zqlfilterid, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zqlfilterid == null) {
                }
                if (zqlfilterid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlFilterId", zqlfilterid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlFilterId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Integer zqlfilterid, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zqlfilterid == null) {
                }
                if (zqlfilterid!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlFilterId", zqlfilterid);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlFilterId", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class SaveColumnItems {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private SaveColumnItems(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public SaveColumnItems(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/saveColumnItems");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T postJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class UpdateColumnItemsId {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private UpdateColumnItemsId(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public UpdateColumnItemsId(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/updateColumnItems/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public UpdateColumnItemsId(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/znav/updateColumnItems/{id}");
                } else {
                    template.append("znav/updateColumnItems/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.Znav.UpdateColumnItemsId setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.Znav.UpdateColumnItemsId(_client, copyUriBuilder, copyMap);
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class Zql {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private Zql(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public Zql(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("zql");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public ZapiRestClient.Zql.Clauses clauses() {
            return new ZapiRestClient.Zql.Clauses(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Zql.ExecuteSearch executeSearch() {
            return new ZapiRestClient.Zql.ExecuteSearch(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.Zql.AutocompleteZQLJson autocompleteZQLJson() {
            return new ZapiRestClient.Zql.AutocompleteZQLJson(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class AutocompleteZQLJson {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private AutocompleteZQLJson(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public AutocompleteZQLJson(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/autocompleteZQLJson");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Clauses {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Clauses(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Clauses(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/clauses");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class ExecuteSearch {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private ExecuteSearch(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public ExecuteSearch(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/executeSearch");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String zqlquery, Integer offset, Integer maxrecords, String expand, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zqlquery == null) {
                }
                if (zqlquery!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlQuery", zqlquery);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlQuery", ((Object[]) null));
                }
                if (offset == null) {
                }
                if (offset!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String zqlquery, Integer offset, Integer maxrecords, String expand, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (zqlquery == null) {
                }
                if (zqlquery!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlQuery", zqlquery);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("zqlQuery", ((Object[]) null));
                }
                if (offset == null) {
                }
                if (offset!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
                }
                if (maxrecords == null) {
                }
                if (maxrecords!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
                }
                if (expand == null) {
                }
                if (expand!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", expand);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("expand", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

    public static class ZqlAutocomplete {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private ZqlAutocomplete(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public ZqlAutocomplete(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("zql/autocomplete");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(String fieldname, String fieldvalue, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (fieldname == null) {
            }
            if (fieldname!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", fieldname);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", ((Object[]) null));
            }
            if (fieldvalue == null) {
            }
            if (fieldvalue!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", fieldvalue);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(String fieldname, String fieldvalue, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (fieldname == null) {
            }
            if (fieldname!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", fieldname);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", ((Object[]) null));
            }
            if (fieldvalue == null) {
            }
            if (fieldvalue!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", fieldvalue);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsXml(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsXml(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsXml(String fieldname, String fieldvalue, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (fieldname == null) {
            }
            if (fieldname!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", fieldname);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", ((Object[]) null));
            }
            if (fieldvalue == null) {
            }
            if (fieldvalue!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", fieldvalue);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsXml(String fieldname, String fieldvalue, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (fieldname == null) {
            }
            if (fieldname!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", fieldname);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldName", ((Object[]) null));
            }
            if (fieldvalue == null) {
            }
            if (fieldvalue!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", fieldvalue);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fieldValue", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/xml");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

    }

    public static class ZqlExecutionFilter {

        private com.sun.jersey.api.client.Client _client;
        private UriBuilder _uriBuilder;
        private Map<String, Object> _templateAndMatrixParameterValues;

        private ZqlExecutionFilter(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
            _client = client;
            _uriBuilder = uriBuilder.clone();
            _templateAndMatrixParameterValues = map;
        }

        /**
         * Create new instance using existing Client instance, and a base URI and any parameters
         * 
         */
        public ZqlExecutionFilter(com.sun.jersey.api.client.Client client, URI baseUri) {
            _client = client;
            _uriBuilder = UriBuilder.fromUri(baseUri);
            _uriBuilder = _uriBuilder.path("zql/executionFilter");
            _templateAndMatrixParameterValues = new HashMap<String, Object>();
        }

        public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T getAsJson(String byuser, String fav, Integer offset, Integer maxrecords, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (byuser == null) {
            }
            if (byuser!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("byUser", byuser);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("byUser", ((Object[]) null));
            }
            if (fav == null) {
            }
            if (fav!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fav", fav);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fav", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (maxrecords == null) {
            }
            if (maxrecords!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T getAsJson(String byuser, String fav, Integer offset, Integer maxrecords, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            if (byuser == null) {
            }
            if (byuser!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("byUser", byuser);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("byUser", ((Object[]) null));
            }
            if (fav == null) {
            }
            if (fav!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("fav", fav);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("fav", ((Object[]) null));
            }
            if (offset == null) {
            }
            if (offset!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", offset);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("offset", ((Object[]) null));
            }
            if (maxrecords == null) {
            }
            if (maxrecords!= null) {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", maxrecords);
            } else {
                localUriBuilder = localUriBuilder.replaceQueryParam("maxRecords", ((Object[]) null));
            }
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public<T >T postJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (response.getStatus()>= 400) {
                throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
            }
            return response.getEntity(returnType);
        }

        public<T >T postJson(Object input, Class<T> returnType) {
            UriBuilder localUriBuilder = _uriBuilder.clone();
            com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
            com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
            resourceBuilder = resourceBuilder.accept("application/json");
            resourceBuilder = resourceBuilder.type("application/json");
            com.sun.jersey.api.client.ClientResponse response;
            response = resourceBuilder.method("POST", com.sun.jersey.api.client.ClientResponse.class, input);
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
            }
            if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                return response.getEntity(returnType);
            } else {
                return returnType.cast(response);
            }
        }

        public ZapiRestClient.ZqlExecutionFilter.User user() {
            return new ZapiRestClient.ZqlExecutionFilter.User(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.Id id(Integer id) {
            return new ZapiRestClient.ZqlExecutionFilter.Id(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues), id);
        }

        public ZapiRestClient.ZqlExecutionFilter.Search search() {
            return new ZapiRestClient.ZqlExecutionFilter.Search(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.QuickSearch quickSearch() {
            return new ZapiRestClient.ZqlExecutionFilter.QuickSearch(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.Copy copy() {
            return new ZapiRestClient.ZqlExecutionFilter.Copy(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.Update update() {
            return new ZapiRestClient.ZqlExecutionFilter.Update(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.Rename rename() {
            return new ZapiRestClient.ZqlExecutionFilter.Rename(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public ZapiRestClient.ZqlExecutionFilter.ToggleFav toggleFav() {
            return new ZapiRestClient.ZqlExecutionFilter.ToggleFav(_client, _uriBuilder.buildFromMap(_templateAndMatrixParameterValues));
        }

        public static class Copy {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Copy(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Copy(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/copy");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Id {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Id(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI baseUri, Integer id) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/{id}");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                _templateAndMatrixParameterValues.put("id", id);
            }

            /**
             * Create new instance using existing Client instance, and the URI from which the parameters will be extracted
             * 
             */
            public Id(com.sun.jersey.api.client.Client client, URI uri) {
                _client = client;
                StringBuilder template = new StringBuilder(BASE_URI.toString());
                if (template.charAt((template.length()- 1))!= '/') {
                    template.append("/zql/executionFilter/{id}");
                } else {
                    template.append("zql/executionFilter/{id}");
                }
                _uriBuilder = UriBuilder.fromPath(template.toString());
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
                com.sun.jersey.api.uri.UriTemplate uriTemplate = new com.sun.jersey.api.uri.UriTemplate(template.toString());
                HashMap<String, String> parameters = new HashMap<String, String>();
                uriTemplate.match(uri.toString(), parameters);
                _templateAndMatrixParameterValues.putAll(parameters);
            }

            /**
             * Get id
             * 
             */
            public Integer getId() {
                return ((Integer) _templateAndMatrixParameterValues.get("id"));
            }

            /**
             * Duplicate state and set id
             * 
             */
            public ZapiRestClient.ZqlExecutionFilter.Id setId(Integer id) {
                Map<String, Object> copyMap;
                copyMap = new HashMap<String, Object>(_templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = _uriBuilder.clone();
                copyMap.put("id", id);
                return new ZapiRestClient.ZqlExecutionFilter.Id(_client, copyUriBuilder, copyMap);
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T deleteAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("DELETE", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class QuickSearch {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private QuickSearch(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public QuickSearch(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/quickSearch");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String query, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String query, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (query == null) {
                }
                if (query!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", query);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("query", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Rename {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Rename(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Rename(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/rename");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Search {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Search(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Search(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/search");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

            public<T >T getAsJson(String filtername, String owner, Integer shareperm, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (filtername == null) {
                }
                if (filtername!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("filterName", filtername);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("filterName", ((Object[]) null));
                }
                if (owner == null) {
                }
                if (owner!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("owner", owner);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("owner", ((Object[]) null));
                }
                if (shareperm == null) {
                }
                if (shareperm!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("sharePerm", shareperm);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("sharePerm", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(String filtername, String owner, Integer shareperm, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                if (filtername == null) {
                }
                if (filtername!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("filterName", filtername);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("filterName", ((Object[]) null));
                }
                if (owner == null) {
                }
                if (owner!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("owner", owner);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("owner", ((Object[]) null));
                }
                if (shareperm == null) {
                }
                if (shareperm!= null) {
                    localUriBuilder = localUriBuilder.replaceQueryParam("sharePerm", shareperm);
                } else {
                    localUriBuilder = localUriBuilder.replaceQueryParam("sharePerm", ((Object[]) null));
                }
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class ToggleFav {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private ToggleFav(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public ToggleFav(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/toggleFav");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class Update {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private Update(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public Update(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/update");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T putJson(Object input, com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T putJson(Object input, Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                resourceBuilder = resourceBuilder.type("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("PUT", com.sun.jersey.api.client.ClientResponse.class, input);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

        public static class User {

            private com.sun.jersey.api.client.Client _client;
            private UriBuilder _uriBuilder;
            private Map<String, Object> _templateAndMatrixParameterValues;

            private User(com.sun.jersey.api.client.Client client, UriBuilder uriBuilder, Map<String, Object> map) {
                _client = client;
                _uriBuilder = uriBuilder.clone();
                _templateAndMatrixParameterValues = map;
            }

            /**
             * Create new instance using existing Client instance, and a base URI and any parameters
             * 
             */
            public User(com.sun.jersey.api.client.Client client, URI baseUri) {
                _client = client;
                _uriBuilder = UriBuilder.fromUri(baseUri);
                _uriBuilder = _uriBuilder.path("/user");
                _templateAndMatrixParameterValues = new HashMap<String, Object>();
            }

            public<T >T getAsJson(com.sun.jersey.api.client.GenericType<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (response.getStatus()>= 400) {
                    throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                }
                return response.getEntity(returnType);
            }

            public<T >T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = _uriBuilder.clone();
                com.sun.jersey.api.client.WebResource resource = _client.resource(localUriBuilder.buildFromMap(_templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                com.sun.jersey.api.client.ClientResponse response;
                response = resourceBuilder.method("GET", com.sun.jersey.api.client.ClientResponse.class);
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    if (response.getStatus()>= 400) {
                        throw new ZapiRestClient.WebApplicationExceptionMessage(Response.status(response.getClientResponseStatus()).build());
                    }
                }
                if (!com.sun.jersey.api.client.ClientResponse.class.isAssignableFrom(returnType)) {
                    return response.getEntity(returnType);
                } else {
                    return returnType.cast(response);
                }
            }

        }

    }

}
