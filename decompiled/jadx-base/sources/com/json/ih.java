package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class ih extends java.io.File {
    public ih(java.lang.String str) {
        super(str);
    }

    public ih(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    public org.json.JSONObject a() throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public java.lang.String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }
}
