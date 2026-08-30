package com.google.android.gms.nearby.messages;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class MessageFilter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.MessageFilter> CREATOR = new com.google.android.gms.nearby.messages.zzb();
    public static final com.google.android.gms.nearby.messages.MessageFilter INCLUDE_ALL_MY_TYPES;
    final int zza;
    private final java.util.List<com.google.android.gms.nearby.messages.internal.zzac> zzb;
    private final java.util.List<com.google.android.gms.internal.nearby.zzhl> zzc;
    private final boolean zzd;
    private final java.util.List<com.google.android.gms.internal.nearby.zzhg> zze;
    private final int zzf;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
    public static final class Builder {
        private boolean zzd;
        private final java.util.Set<com.google.android.gms.nearby.messages.internal.zzac> zza = new java.util.HashSet();
        private final java.util.List<com.google.android.gms.internal.nearby.zzhl> zzb = new java.util.ArrayList();
        private final java.util.Set<com.google.android.gms.internal.nearby.zzhg> zzc = new java.util.HashSet();
        private int zze = 0;

        private final com.google.android.gms.nearby.messages.MessageFilter.Builder zza(java.lang.String str, java.lang.String str2) {
            this.zza.add(new com.google.android.gms.nearby.messages.internal.zzac(str, str2));
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter build() {
            boolean z = true;
            if (!this.zzd && this.zza.isEmpty()) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkState(z, "At least one of the include methods must be called.");
            return new com.google.android.gms.nearby.messages.MessageFilter(2, new java.util.ArrayList(this.zza), this.zzb, this.zzd, new java.util.ArrayList(this.zzc), this.zze);
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeAllMyTypes() {
            this.zzd = true;
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeAudioBytes(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(this.zze == 0, "includeAudioBytes() can only be called once per MessageFilter instance.");
            boolean z = i > 0;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(44);
            sb.append("Invalid value for numAudioBytes: ");
            sb.append(i);
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
            com.google.android.gms.common.internal.Preconditions.checkArgument(i <= 10, "numAudioBytes is capped by AudioBytes.MAX_SIZE = 10");
            zza(com.google.android.gms.nearby.messages.Message.MESSAGE_NAMESPACE_RESERVED, com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_AUDIO_BYTES);
            this.zze = i;
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeEddystoneUids(java.lang.String str, java.lang.String str2) {
            zza(com.google.android.gms.nearby.messages.Message.MESSAGE_NAMESPACE_RESERVED, com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_EDDYSTONE_UID);
            this.zzb.add(com.google.android.gms.internal.nearby.zzhl.zza(str, str2));
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeFilter(com.google.android.gms.nearby.messages.MessageFilter messageFilter) {
            this.zza.addAll(messageFilter.zza());
            this.zzb.addAll(messageFilter.zzc());
            this.zzc.addAll(messageFilter.zzd());
            this.zzd = messageFilter.zzb() | this.zzd;
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeIBeaconIds(java.util.UUID uuid, java.lang.Short sh, java.lang.Short sh2) {
            zza(com.google.android.gms.nearby.messages.Message.MESSAGE_NAMESPACE_RESERVED, com.google.android.gms.nearby.messages.Message.MESSAGE_TYPE_I_BEACON_ID);
            this.zzb.add(com.google.android.gms.internal.nearby.zzhl.zzb(uuid, sh, sh2));
            return this;
        }

        public com.google.android.gms.nearby.messages.MessageFilter.Builder includeNamespacedType(java.lang.String str, java.lang.String str2) {
            com.google.android.gms.common.internal.Preconditions.checkArgument((str == null || str.isEmpty() || str.contains(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true, "namespace(%s) cannot be null, empty or contain (*).", str);
            com.google.android.gms.common.internal.Preconditions.checkArgument((str2 == null || str2.contains(androidx.webkit.ProxyConfig.MATCH_ALL_SCHEMES)) ? false : true, "type(%s) cannot be null or contain (*).", str2);
            zza(str, str2);
            return this;
        }
    }

    static {
        com.google.android.gms.nearby.messages.MessageFilter.Builder builder = new com.google.android.gms.nearby.messages.MessageFilter.Builder();
        builder.includeAllMyTypes();
        INCLUDE_ALL_MY_TYPES = builder.build();
    }

    MessageFilter(int i, java.util.List<com.google.android.gms.nearby.messages.internal.zzac> list, java.util.List<com.google.android.gms.internal.nearby.zzhl> list2, boolean z, java.util.List<com.google.android.gms.internal.nearby.zzhg> list3, int i2) {
        this.zza = i;
        this.zzb = java.util.Collections.unmodifiableList((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list));
        this.zzd = z;
        this.zzc = java.util.Collections.unmodifiableList(list2 == null ? java.util.Collections.emptyList() : list2);
        this.zze = java.util.Collections.unmodifiableList(list3 == null ? java.util.Collections.emptyList() : list3);
        this.zzf = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.MessageFilter)) {
            return false;
        }
        com.google.android.gms.nearby.messages.MessageFilter messageFilter = (com.google.android.gms.nearby.messages.MessageFilter) obj;
        return this.zzd == messageFilter.zzd && com.google.android.gms.common.internal.Objects.equal(this.zzb, messageFilter.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, messageFilter.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zze, messageFilter.zze);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, java.lang.Boolean.valueOf(this.zzd), this.zze);
    }

    public java.lang.String toString() {
        boolean z = this.zzd;
        java.lang.String strValueOf = java.lang.String.valueOf(this.zzb);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + 53);
        sb.append("MessageFilter{includeAllMyTypes=");
        sb.append(z);
        sb.append(", messageTypes=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 4, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.util.List<com.google.android.gms.nearby.messages.internal.zzac> zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final java.util.List<com.google.android.gms.internal.nearby.zzhl> zzc() {
        return this.zzc;
    }

    public final java.util.List<com.google.android.gms.internal.nearby.zzhg> zzd() {
        return this.zze;
    }
}
