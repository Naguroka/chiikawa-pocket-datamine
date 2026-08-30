package com.unity3d.services.ads.token;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/ads/token/TokenStorage;", "", "nativeGeneratedToken", "", "getNativeGeneratedToken", "()Lkotlin/Unit;", "token", "", "getToken", "()Ljava/lang/String;", "appendTokens", "tokens", "Lorg/json/JSONArray;", "createTokens", "deleteTokens", "setInitToken", "value", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TokenStorage {
    void appendTokens(org.json.JSONArray tokens) throws org.json.JSONException;

    void createTokens(org.json.JSONArray tokens) throws org.json.JSONException;

    void deleteTokens();

    kotlin.Unit getNativeGeneratedToken();

    java.lang.String getToken();

    void setInitToken(java.lang.String value);
}
