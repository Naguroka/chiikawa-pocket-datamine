package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class GlobalParameters {
    java.util.Map<java.lang.String, java.lang.String> callbackParameters;
    java.util.Map<java.lang.String, java.lang.String> partnerParameters;

    public com.adjust.sdk.GlobalParameters deepCopy() {
        com.adjust.sdk.GlobalParameters globalParameters = new com.adjust.sdk.GlobalParameters();
        if (this.callbackParameters != null) {
            globalParameters.callbackParameters = new java.util.HashMap(this.callbackParameters);
        }
        if (this.partnerParameters != null) {
            globalParameters.partnerParameters = new java.util.HashMap(this.partnerParameters);
        }
        return globalParameters;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.adjust.sdk.GlobalParameters globalParameters = (com.adjust.sdk.GlobalParameters) obj;
        return com.adjust.sdk.Util.equalObject(this.callbackParameters, globalParameters.callbackParameters) && com.adjust.sdk.Util.equalObject(this.partnerParameters, globalParameters.partnerParameters);
    }

    public int hashCode() {
        return com.adjust.sdk.Util.hashObject(this.partnerParameters, com.adjust.sdk.Util.hashObject(this.callbackParameters, 17));
    }
}
