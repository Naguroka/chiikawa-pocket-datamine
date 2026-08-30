package com.iab.omid.library.unity3d.adsession;

/* JADX INFO: loaded from: classes5.dex */
public class AdSessionConfiguration {
    private final com.iab.omid.library.unity3d.adsession.CreativeType creativeType;
    private final com.iab.omid.library.unity3d.adsession.Owner impressionOwner;
    private final com.iab.omid.library.unity3d.adsession.ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final com.iab.omid.library.unity3d.adsession.Owner mediaEventsOwner;

    private AdSessionConfiguration(com.iab.omid.library.unity3d.adsession.CreativeType creativeType, com.iab.omid.library.unity3d.adsession.ImpressionType impressionType, com.iab.omid.library.unity3d.adsession.Owner owner, com.iab.omid.library.unity3d.adsession.Owner owner2, boolean z) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = com.iab.omid.library.unity3d.adsession.Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z;
    }

    public static com.iab.omid.library.unity3d.adsession.AdSessionConfiguration createAdSessionConfiguration(com.iab.omid.library.unity3d.adsession.CreativeType creativeType, com.iab.omid.library.unity3d.adsession.ImpressionType impressionType, com.iab.omid.library.unity3d.adsession.Owner owner, com.iab.omid.library.unity3d.adsession.Owner owner2, boolean z) {
        com.iab.omid.library.unity3d.utils.g.a(creativeType, "CreativeType is null");
        com.iab.omid.library.unity3d.utils.g.a(impressionType, "ImpressionType is null");
        com.iab.omid.library.unity3d.utils.g.a(owner, "Impression owner is null");
        com.iab.omid.library.unity3d.utils.g.a(owner, creativeType, impressionType);
        return new com.iab.omid.library.unity3d.adsession.AdSessionConfiguration(creativeType, impressionType, owner, owner2, z);
    }

    public boolean isNativeImpressionOwner() {
        return com.iab.omid.library.unity3d.adsession.Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return com.iab.omid.library.unity3d.adsession.Owner.NATIVE == this.mediaEventsOwner;
    }

    public org.json.JSONObject toJsonObject() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "impressionOwner", this.impressionOwner);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "creativeType", this.creativeType);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "impressionType", this.impressionType);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, "isolateVerificationScripts", java.lang.Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
