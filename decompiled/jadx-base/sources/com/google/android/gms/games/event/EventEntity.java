package com.google.android.gms.games.event;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class EventEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.event.Event {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.event.EventEntity> CREATOR = new com.google.android.gms.games.event.zza();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.net.Uri zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.games.PlayerEntity zzf;
    private final long zzg;
    private final java.lang.String zzh;
    private final boolean zzi;

    public EventEntity(com.google.android.gms.games.event.Event event) {
        this.zza = event.getEventId();
        this.zzb = event.getName();
        this.zzc = event.getDescription();
        this.zzd = event.getIconImageUri();
        this.zze = event.getIconImageUrl();
        this.zzf = (com.google.android.gms.games.PlayerEntity) event.getPlayer().freeze();
        this.zzg = event.getValue();
        this.zzh = event.getFormattedValue();
        this.zzi = event.isVisible();
    }

    static int zza(com.google.android.gms.games.event.Event event) {
        return com.google.android.gms.common.internal.Objects.hashCode(event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), java.lang.Long.valueOf(event.getValue()), event.getFormattedValue(), java.lang.Boolean.valueOf(event.isVisible()));
    }

    static java.lang.String zzb(com.google.android.gms.games.event.Event event) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(event).add("Id", event.getEventId()).add("Name", event.getName()).add("Description", event.getDescription()).add("IconImageUri", event.getIconImageUri()).add("IconImageUrl", event.getIconImageUrl()).add("Player", event.getPlayer()).add("Value", java.lang.Long.valueOf(event.getValue())).add("FormattedValue", event.getFormattedValue()).add(com.json.pg.k, java.lang.Boolean.valueOf(event.isVisible())).toString();
    }

    static boolean zzc(com.google.android.gms.games.event.Event event, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.event.Event)) {
            return false;
        }
        if (event == obj) {
            return true;
        }
        com.google.android.gms.games.event.Event event2 = (com.google.android.gms.games.event.Event) obj;
        return com.google.android.gms.common.internal.Objects.equal(event2.getEventId(), event.getEventId()) && com.google.android.gms.common.internal.Objects.equal(event2.getName(), event.getName()) && com.google.android.gms.common.internal.Objects.equal(event2.getDescription(), event.getDescription()) && com.google.android.gms.common.internal.Objects.equal(event2.getIconImageUri(), event.getIconImageUri()) && com.google.android.gms.common.internal.Objects.equal(event2.getIconImageUrl(), event.getIconImageUrl()) && com.google.android.gms.common.internal.Objects.equal(event2.getPlayer(), event.getPlayer()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(event2.getValue()), java.lang.Long.valueOf(event.getValue())) && com.google.android.gms.common.internal.Objects.equal(event2.getFormattedValue(), event.getFormattedValue()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(event2.isVisible()), java.lang.Boolean.valueOf(event.isVisible()));
    }

    public boolean equals(java.lang.Object obj) {
        return zzc(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.event.Event freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.event.Event freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getDescription() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getEventId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getFormattedValue() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getFormattedValue(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzh, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public android.net.Uri getIconImageUri() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getIconImageUrl() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.event.Event
    public java.lang.String getName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.event.Event
    public void getName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.event.Event
    public com.google.android.gms.games.Player getPlayer() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.event.Event
    public long getValue() {
        return this.zzg;
    }

    public int hashCode() {
        return zza(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    @Override // com.google.android.gms.games.event.Event
    public boolean isVisible() {
        return this.zzi;
    }

    public java.lang.String toString() {
        return zzb(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getEventId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getIconImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPlayer(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, getValue());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getFormattedValue(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    EventEntity(java.lang.String str, java.lang.String str2, java.lang.String str3, android.net.Uri uri, java.lang.String str4, com.google.android.gms.games.Player player, long j, java.lang.String str5, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = uri;
        this.zze = str4;
        this.zzf = new com.google.android.gms.games.PlayerEntity(player);
        this.zzg = j;
        this.zzh = str5;
        this.zzi = z;
    }
}
