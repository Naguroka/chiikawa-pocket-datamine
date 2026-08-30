package com.google.android.gms.games.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.stats.PlayerStats {
    private android.os.Bundle zza;

    zzb(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.stats.PlayerStatsEntity.zzd(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.stats.PlayerStats freeze() {
        return new com.google.android.gms.games.stats.PlayerStatsEntity(this);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getAverageSessionLength() {
        return getFloat("ave_session_length_minutes");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getChurnProbability() {
        return getFloat("churn_probability");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getDaysSinceLastPlayed() {
        return getInteger("days_since_last_played");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getHighSpenderProbability() {
        if (hasColumn("high_spender_probability")) {
            return getFloat("high_spender_probability");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfPurchases() {
        return getInteger("num_purchases");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfSessions() {
        return getInteger("num_sessions");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSessionPercentile() {
        return getFloat("num_sessions_percentile");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendPercentile() {
        return getFloat("spend_percentile");
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendProbability() {
        if (hasColumn("spend_probability")) {
            return getFloat("spend_probability");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getTotalSpendNext28Days() {
        if (hasColumn("total_spend_next_28_days")) {
            return getFloat("total_spend_next_28_days");
        }
        return -1.0f;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.stats.PlayerStatsEntity.zzb(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.stats.PlayerStatsEntity.zzc(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.stats.zza.zza(new com.google.android.gms.games.stats.PlayerStatsEntity(this), parcel, i);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final android.os.Bundle zza() {
        android.os.Bundle bundle = this.zza;
        if (bundle != null) {
            return bundle;
        }
        this.zza = new android.os.Bundle();
        java.lang.String string = getString("unknown_raw_keys");
        java.lang.String string2 = getString("unknown_raw_values");
        if (string != null && string2 != null) {
            java.lang.String[] strArrSplit = string.split(",");
            java.lang.String[] strArrSplit2 = string2.split(",");
            com.google.android.gms.common.internal.Asserts.checkState(strArrSplit.length <= strArrSplit2.length, "Invalid raw arguments!");
            for (int i = 0; i < strArrSplit.length; i++) {
                this.zza.putString(strArrSplit[i], strArrSplit2[i]);
            }
        }
        return this.zza;
    }
}
