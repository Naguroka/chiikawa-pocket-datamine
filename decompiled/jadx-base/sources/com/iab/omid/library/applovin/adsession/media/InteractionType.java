package com.iab.omid.library.applovin.adsession.media;

/* JADX INFO: loaded from: classes5.dex */
public enum InteractionType {
    CLICK(com.json.z8.d),
    INVITATION_ACCEPTED("invitationAccept");

    java.lang.String interactionType;

    InteractionType(java.lang.String str) {
        this.interactionType = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.interactionType;
    }
}
