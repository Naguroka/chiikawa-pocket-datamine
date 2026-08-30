package com.unity3d.services.core.configuration;

/* JADX INFO: loaded from: classes6.dex */
public class Configuration {
    private java.lang.String _configUrl;
    private com.unity3d.services.core.configuration.ConfigurationRequestFactory _configurationRequestFactory;
    private int _connectedEventThresholdInMs;
    private boolean _delayWebViewUpdate;
    private com.unity3d.services.core.configuration.ExperimentsReader _experimentReader;
    private java.lang.String _filteredJsonString;
    private int _loadTimeout;
    private int _maxRetries;
    private int _maximumConnectedEvents;
    private double _metricSampleRate;
    private java.lang.Boolean _metricsEnabled;
    private java.lang.String _metricsUrl;
    private final java.lang.Class<?>[] _moduleConfigurationList;
    private java.util.Map<java.lang.String, com.unity3d.services.core.configuration.IModuleConfiguration> _moduleConfigurations;
    private long _networkErrorTimeout;
    private int _privacyRequestWaitTimeout;
    private org.json.JSONObject _rawJsonData;
    private int _resetWebAppTimeout;
    private long _retryDelay;
    private double _retryScalingFactor;
    private java.lang.String _sTkn;
    private java.lang.String _scarBiddingUrl;
    private java.lang.String _sdkVersion;
    private int _showTimeout;
    private java.lang.String _src;
    private java.lang.String _stateId;
    private int _tokenTimeout;
    private java.lang.String _unifiedAuctionToken;
    private java.lang.Class[] _webAppApiClassList;
    private long _webViewAppCreateTimeout;
    private int _webViewBridgeTimeout;
    private java.lang.String _webViewData;
    private java.lang.String _webViewHash;
    private java.lang.String _webViewUrl;
    private java.lang.String _webViewVersion;

    public Configuration() {
        this._moduleConfigurationList = new java.lang.Class[]{com.unity3d.services.core.configuration.CoreModuleConfiguration.class, com.unity3d.services.ads.configuration.AdsModuleConfiguration.class, com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration.class, com.unity3d.services.banners.configuration.BannersModuleConfiguration.class, com.unity3d.services.store.core.configuration.StoreModuleConfiguration.class};
        this._experimentReader = new com.unity3d.services.core.configuration.ExperimentsReader();
        setOptionalFields(new org.json.JSONObject(), false);
    }

    public Configuration(java.lang.String str) {
        this(str, new com.unity3d.services.core.configuration.Experiments());
    }

    public Configuration(org.json.JSONObject jSONObject) throws org.json.JSONException, java.net.MalformedURLException {
        this._moduleConfigurationList = new java.lang.Class[]{com.unity3d.services.core.configuration.CoreModuleConfiguration.class, com.unity3d.services.ads.configuration.AdsModuleConfiguration.class, com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration.class, com.unity3d.services.banners.configuration.BannersModuleConfiguration.class, com.unity3d.services.store.core.configuration.StoreModuleConfiguration.class};
        this._experimentReader = new com.unity3d.services.core.configuration.ExperimentsReader();
        handleConfigurationData(jSONObject, false);
    }

    public Configuration(java.lang.String str, com.unity3d.services.core.configuration.ExperimentsReader experimentsReader) {
        this(str, experimentsReader.getCurrentlyActiveExperiments());
        this._experimentReader = experimentsReader;
    }

    public Configuration(java.lang.String str, com.unity3d.services.core.configuration.IExperiments iExperiments) {
        this();
        this._configUrl = str;
        this._configurationRequestFactory = new com.unity3d.services.core.configuration.ConfigurationRequestFactory(this);
        this._experimentReader.updateLocalExperiments(iExperiments);
    }

    public java.lang.String getConfigUrl() {
        return this._configUrl;
    }

    public java.lang.Class[] getWebAppApiClassList() {
        if (this._webAppApiClassList == null) {
            createWebAppApiClassList();
        }
        return this._webAppApiClassList;
    }

    public java.lang.Class[] getModuleConfigurationList() {
        return this._moduleConfigurationList;
    }

    public java.lang.String getWebViewUrl() {
        return this._webViewUrl;
    }

    public void setWebViewUrl(java.lang.String str) {
        this._webViewUrl = str;
    }

    public java.lang.String getWebViewHash() {
        return this._webViewHash;
    }

    public void setWebViewHash(java.lang.String str) {
        this._webViewHash = str;
    }

    public java.lang.String getWebViewVersion() {
        return this._webViewVersion;
    }

    public java.lang.String getWebViewData() {
        return this._webViewData;
    }

    public void setWebViewData(java.lang.String str) {
        this._webViewData = str;
    }

    public java.lang.String getSdkVersion() {
        return this._sdkVersion;
    }

    public boolean getDelayWebViewUpdate() {
        return this._delayWebViewUpdate;
    }

    public int getResetWebappTimeout() {
        return this._resetWebAppTimeout;
    }

    public int getMaxRetries() {
        return this._maxRetries;
    }

    public long getRetryDelay() {
        return this._retryDelay;
    }

    public double getRetryScalingFactor() {
        return this._retryScalingFactor;
    }

    public int getConnectedEventThreshold() {
        return this._connectedEventThresholdInMs;
    }

    public int getMaximumConnectedEvents() {
        return this._maximumConnectedEvents;
    }

    public long getNetworkErrorTimeout() {
        return this._networkErrorTimeout;
    }

    public int getShowTimeout() {
        return this._showTimeout;
    }

    public int getLoadTimeout() {
        return this._loadTimeout;
    }

    public int getWebViewBridgeTimeout() {
        return this._webViewBridgeTimeout;
    }

    public java.lang.String getMetricsUrl() {
        return this._metricsUrl;
    }

    public java.lang.String getScarBiddingUrl() {
        return this._scarBiddingUrl;
    }

    public double getMetricSampleRate() {
        return this._metricSampleRate;
    }

    public long getWebViewAppCreateTimeout() {
        return this._webViewAppCreateTimeout;
    }

    public java.lang.String getStateId() {
        java.lang.String str = this._stateId;
        return str != null ? str : "";
    }

    public java.lang.String getUnifiedAuctionToken() {
        return this._unifiedAuctionToken;
    }

    public java.lang.String getSessionToken() {
        return this._sTkn;
    }

    public com.unity3d.services.core.configuration.IExperiments getExperiments() {
        return this._experimentReader.getCurrentlyActiveExperiments();
    }

    public com.unity3d.services.core.configuration.ExperimentsReader getExperimentsReader() {
        return this._experimentReader;
    }

    public int getTokenTimeout() {
        return this._tokenTimeout;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this._privacyRequestWaitTimeout;
    }

    public java.lang.String getSrc() {
        java.lang.String str = this._src;
        return str != null ? str : "";
    }

    public com.unity3d.services.core.configuration.IModuleConfiguration getModuleConfiguration(java.lang.Class cls) {
        java.util.Map<java.lang.String, com.unity3d.services.core.configuration.IModuleConfiguration> map = this._moduleConfigurations;
        if (map != null && map.containsKey(cls)) {
            return this._moduleConfigurations.get(cls);
        }
        try {
            com.unity3d.services.core.configuration.IModuleConfiguration iModuleConfiguration = (com.unity3d.services.core.configuration.IModuleConfiguration) cls.newInstance();
            if (iModuleConfiguration != null) {
                if (this._moduleConfigurations == null) {
                    java.util.HashMap map2 = new java.util.HashMap();
                    this._moduleConfigurations = map2;
                    map2.put(cls.getName(), iModuleConfiguration);
                }
                return iModuleConfiguration;
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }

    public java.lang.String getFilteredJsonString() {
        return this._filteredJsonString;
    }

    public org.json.JSONObject getRawConfigData() {
        return this._rawJsonData;
    }

    public void makeRequest() throws java.lang.Exception {
        if (this._configUrl == null) {
            throw new java.net.MalformedURLException("Base URL is null");
        }
        com.unity3d.services.core.network.model.HttpRequest httpRequest = com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
        com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        try {
            handleConfigurationData(new org.json.JSONObject(((com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class)).executeBlocking(httpRequest).getBody().toString()), true);
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didConfigRequestEnd(true);
            saveToDisk();
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().didConfigRequestEnd(false);
            throw e;
        }
    }

    protected void handleConfigurationData(org.json.JSONObject jSONObject, boolean z) throws org.json.JSONException, java.net.MalformedURLException {
        java.lang.String string;
        try {
            string = !jSONObject.isNull("url") ? jSONObject.getString("url") : null;
        } catch (org.json.JSONException unused) {
        }
        if (android.text.TextUtils.isEmpty(string)) {
            throw new java.net.MalformedURLException("WebView URL is null or empty");
        }
        this._webViewUrl = string;
        try {
            this._webViewHash = !jSONObject.isNull("hash") ? jSONObject.getString("hash") : null;
        } catch (org.json.JSONException unused2) {
            this._webViewHash = null;
        }
        this._unifiedAuctionToken = !jSONObject.isNull("tkn") ? jSONObject.optString("tkn") : null;
        this._stateId = !jSONObject.isNull("sid") ? jSONObject.optString("sid") : null;
        this._sTkn = jSONObject.isNull("sTkn") ? null : jSONObject.optString("sTkn");
        setOptionalFields(jSONObject, z);
        this._filteredJsonString = getFilteredConfigJson(jSONObject).toString();
        this._rawJsonData = jSONObject;
    }

    private void setOptionalFields(org.json.JSONObject jSONObject, boolean z) {
        com.unity3d.services.core.configuration.IExperiments experiments;
        this._webViewVersion = jSONObject.optString("version", null);
        this._delayWebViewUpdate = jSONObject.optBoolean("dwu", false);
        this._resetWebAppTimeout = jSONObject.optInt("rwt", 10000);
        this._maxRetries = jSONObject.optInt("mr", 6);
        this._retryDelay = jSONObject.optLong("rd", 5000L);
        this._retryScalingFactor = jSONObject.optDouble("rcf", 2.0d);
        this._connectedEventThresholdInMs = jSONObject.optInt("cet", 10000);
        this._maximumConnectedEvents = jSONObject.optInt("mce", 500);
        this._networkErrorTimeout = jSONObject.optLong("net", 60000L);
        this._sdkVersion = jSONObject.optString(com.json.ce.M, "");
        this._showTimeout = jSONObject.optInt("sto", 10000);
        this._loadTimeout = jSONObject.optInt("lto", 30000);
        this._webViewBridgeTimeout = jSONObject.optInt("wto", 5000);
        this._metricsUrl = jSONObject.optString("murl", "");
        this._metricSampleRate = jSONObject.optDouble("msr", 100.0d);
        this._webViewAppCreateTimeout = jSONObject.optLong("wct", 60000L);
        this._tokenTimeout = jSONObject.optInt("tto", 5000);
        this._privacyRequestWaitTimeout = jSONObject.optInt("prwto", 3000);
        this._src = jSONObject.optString("src", null);
        this._scarBiddingUrl = jSONObject.optString("scurl", com.unity3d.services.ads.gmascar.utils.ScarConstants.SCAR_PRD_BIDDING_ENDPOINT);
        this._metricsEnabled = java.lang.Boolean.valueOf(this._metricSampleRate >= ((double) (new java.util.Random().nextInt(99) + 1)));
        if (jSONObject.has("expo")) {
            experiments = new com.unity3d.services.core.configuration.ExperimentObjects(jSONObject.optJSONObject("expo"));
        } else {
            experiments = new com.unity3d.services.core.configuration.Experiments(jSONObject.optJSONObject("exp"));
        }
        if (z) {
            this._experimentReader.updateRemoteExperiments(experiments);
        } else {
            this._experimentReader.updateLocalExperiments(experiments);
        }
    }

    private void createWebAppApiClassList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Class cls : getModuleConfigurationList()) {
            com.unity3d.services.core.configuration.IModuleConfiguration moduleConfiguration = getModuleConfiguration(cls);
            if (moduleConfiguration != null && moduleConfiguration.getWebAppApiClassList() != null) {
                arrayList.addAll(java.util.Arrays.asList(moduleConfiguration.getWebAppApiClassList()));
            }
        }
        this._webAppApiClassList = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[arrayList.size()]);
    }

    public void saveToDisk() {
        com.unity3d.services.core.misc.Utilities.writeFile(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath()), getFilteredJsonString());
    }

    public void deleteFromDisk() {
        java.io.File file = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath());
        if (file.exists()) {
            file.delete();
        }
    }

    private org.json.JSONObject getFilteredConfigJson(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if (!next.equalsIgnoreCase("tkn") && !next.equalsIgnoreCase("sid") && !next.equalsIgnoreCase("srr") && !next.equalsIgnoreCase("sTkn")) {
                jSONObject2.put(next, objOpt);
            }
        }
        return jSONObject2;
    }

    public java.lang.Boolean areMetricsEnabledForCurrentSession() {
        return this._metricsEnabled;
    }
}
