package com.google.android.gms.games.event;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class EventRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.event.Event {
    EventRef(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.event.EventEntity.zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.event.Event freeze() {
        return new com.google.android.gms.games.event.EventEntity(this);
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getDescription() {
        return getString("description");
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getEventId() {
        return getString("external_event_id");
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getFormattedValue() {
        return getString("formatted_value");
    }

    @Override // com.google.android.gms.games.event.Event
    public final android.net.Uri getIconImageUri() {
        return parseUri("icon_image_uri");
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getIconImageUrl() {
        return getString("icon_image_url");
    }

    @Override // com.google.android.gms.games.event.Event
    public final java.lang.String getName() {
        return getString("name");
    }

    @Override // com.google.android.gms.games.event.Event
    public final com.google.android.gms.games.Player getPlayer() {
        return new com.google.android.gms.games.PlayerRef(this.mDataHolder, this.mDataRow, null);
    }

    @Override // com.google.android.gms.games.event.Event
    public final long getValue() {
        return getLong("value");
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.event.EventEntity.zza(this);
    }

    @Override // com.google.android.gms.games.event.Event
    public final boolean isVisible() {
        return getBoolean("visibility");
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.event.EventEntity.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        new com.google.android.gms.games.event.EventEntity(this).writeToParcel(parcel, i);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("description", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getFormattedValue(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("formatted_value", charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public final void getName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("name", charArrayBuffer);
    }
}
