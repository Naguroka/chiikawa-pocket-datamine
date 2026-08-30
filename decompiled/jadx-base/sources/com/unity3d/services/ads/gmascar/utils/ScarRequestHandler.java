package com.unity3d.services.ads.gmascar.utils;

/* JADX INFO: loaded from: classes6.dex */
public class ScarRequestHandler {
    private final com.unity3d.services.core.network.core.HttpClient httpClient = (com.unity3d.services.core.network.core.HttpClient) com.unity3d.services.core.misc.Utilities.getService(com.unity3d.services.core.network.core.HttpClient.class);

    public void makeUploadRequest(java.lang.String str, com.unity3d.services.ads.gmascar.models.BiddingSignals biddingSignals, java.lang.String str2) throws java.lang.Exception {
        java.util.HashMap map = new java.util.HashMap();
        map.put("Content-Type", java.util.Collections.singletonList(com.json.zb.L));
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("idfi", com.unity3d.services.core.device.Device.getIdfi());
        map2.put(com.unity3d.services.ads.gmascar.utils.ScarConstants.TOKEN_ID_KEY, str);
        map2.putAll(biddingSignals.getMap());
        this.httpClient.executeBlocking(new com.unity3d.services.core.network.model.HttpRequest(str2, "", com.unity3d.services.core.network.model.RequestType.POST, new org.json.JSONObject(map2).toString().getBytes(java.nio.charset.StandardCharsets.UTF_8), map));
    }
}
