package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class JsonStorageAggregator implements com.unity3d.services.core.misc.IJsonStorageReader {
    private final java.util.List<com.unity3d.services.core.misc.IJsonStorageReader> _jsonStorageReaders;

    public JsonStorageAggregator(java.util.List<com.unity3d.services.core.misc.IJsonStorageReader> list) {
        this._jsonStorageReaders = list;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public org.json.JSONObject getData() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (com.unity3d.services.core.misc.IJsonStorageReader iJsonStorageReader : this._jsonStorageReaders) {
            if (iJsonStorageReader != null) {
                try {
                    jSONObject = com.unity3d.services.core.misc.Utilities.mergeJsonObjects(jSONObject, iJsonStorageReader.getData());
                } catch (org.json.JSONException unused) {
                    com.unity3d.services.core.log.DeviceLog.error("Failed to merge storage: " + iJsonStorageReader);
                }
            }
        }
        return jSONObject;
    }

    @Override // com.unity3d.services.core.misc.IJsonStorageReader
    public java.lang.Object get(java.lang.String str) {
        com.unity3d.services.core.misc.IJsonStorageReader next;
        java.util.Iterator<com.unity3d.services.core.misc.IJsonStorageReader> it = this._jsonStorageReaders.iterator();
        java.lang.Object obj = null;
        while (it.hasNext() && ((next = it.next()) == null || (obj = next.get(str)) == null)) {
        }
        return obj;
    }
}
