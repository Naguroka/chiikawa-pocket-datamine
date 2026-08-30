package com.google.android.gms.games.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PlayerStatsEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.stats.PlayerStats {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.stats.PlayerStatsEntity> CREATOR = new com.google.android.gms.games.stats.zza();
    private final float zza;
    private final float zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final float zzf;
    private final float zzg;
    private final android.os.Bundle zzh;
    private final float zzi;
    private final float zzj;
    private final float zzk;

    PlayerStatsEntity(float f, float f2, int i, int i2, int i3, float f3, float f4, android.os.Bundle bundle, float f5, float f6, float f7) {
        this.zza = f;
        this.zzb = f2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = bundle;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
    }

    static int zzb(com.google.android.gms.games.stats.PlayerStats playerStats) {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Float.valueOf(playerStats.getAverageSessionLength()), java.lang.Float.valueOf(playerStats.getChurnProbability()), java.lang.Integer.valueOf(playerStats.getDaysSinceLastPlayed()), java.lang.Integer.valueOf(playerStats.getNumberOfPurchases()), java.lang.Integer.valueOf(playerStats.getNumberOfSessions()), java.lang.Float.valueOf(playerStats.getSessionPercentile()), java.lang.Float.valueOf(playerStats.getSpendPercentile()), java.lang.Float.valueOf(playerStats.getSpendProbability()), java.lang.Float.valueOf(playerStats.getHighSpenderProbability()), java.lang.Float.valueOf(playerStats.getTotalSpendNext28Days()));
    }

    static java.lang.String zzc(com.google.android.gms.games.stats.PlayerStats playerStats) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(playerStats).add("AverageSessionLength", java.lang.Float.valueOf(playerStats.getAverageSessionLength())).add("ChurnProbability", java.lang.Float.valueOf(playerStats.getChurnProbability())).add("DaysSinceLastPlayed", java.lang.Integer.valueOf(playerStats.getDaysSinceLastPlayed())).add("NumberOfPurchases", java.lang.Integer.valueOf(playerStats.getNumberOfPurchases())).add("NumberOfSessions", java.lang.Integer.valueOf(playerStats.getNumberOfSessions())).add("SessionPercentile", java.lang.Float.valueOf(playerStats.getSessionPercentile())).add("SpendPercentile", java.lang.Float.valueOf(playerStats.getSpendPercentile())).add("SpendProbability", java.lang.Float.valueOf(playerStats.getSpendProbability())).add("HighSpenderProbability", java.lang.Float.valueOf(playerStats.getHighSpenderProbability())).add("TotalSpendNext28Days", java.lang.Float.valueOf(playerStats.getTotalSpendNext28Days())).toString();
    }

    static boolean zzd(com.google.android.gms.games.stats.PlayerStats playerStats, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.stats.PlayerStats)) {
            return false;
        }
        if (playerStats == obj) {
            return true;
        }
        com.google.android.gms.games.stats.PlayerStats playerStats2 = (com.google.android.gms.games.stats.PlayerStats) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getAverageSessionLength()), java.lang.Float.valueOf(playerStats.getAverageSessionLength())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getChurnProbability()), java.lang.Float.valueOf(playerStats.getChurnProbability())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(playerStats2.getDaysSinceLastPlayed()), java.lang.Integer.valueOf(playerStats.getDaysSinceLastPlayed())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(playerStats2.getNumberOfPurchases()), java.lang.Integer.valueOf(playerStats.getNumberOfPurchases())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(playerStats2.getNumberOfSessions()), java.lang.Integer.valueOf(playerStats.getNumberOfSessions())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getSessionPercentile()), java.lang.Float.valueOf(playerStats.getSessionPercentile())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getSpendPercentile()), java.lang.Float.valueOf(playerStats.getSpendPercentile())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getSpendProbability()), java.lang.Float.valueOf(playerStats.getSpendProbability())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getHighSpenderProbability()), java.lang.Float.valueOf(playerStats.getHighSpenderProbability())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Float.valueOf(playerStats2.getTotalSpendNext28Days()), java.lang.Float.valueOf(playerStats.getTotalSpendNext28Days()));
    }

    public final boolean equals(java.lang.Object obj) {
        return zzd(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.stats.PlayerStats freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getAverageSessionLength() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getChurnProbability() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getDaysSinceLastPlayed() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getHighSpenderProbability() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfPurchases() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final int getNumberOfSessions() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSessionPercentile() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendPercentile() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getSpendProbability() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final float getTotalSpendNext28Days() {
        return this.zzk;
    }

    public final int hashCode() {
        return zzb(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zzc(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.stats.zza.zza(this, parcel, i);
    }

    @Override // com.google.android.gms.games.stats.PlayerStats
    public final android.os.Bundle zza() {
        return this.zzh;
    }

    public PlayerStatsEntity(com.google.android.gms.games.stats.PlayerStats playerStats) {
        this.zza = playerStats.getAverageSessionLength();
        this.zzb = playerStats.getChurnProbability();
        this.zzc = playerStats.getDaysSinceLastPlayed();
        this.zzd = playerStats.getNumberOfPurchases();
        this.zze = playerStats.getNumberOfSessions();
        this.zzf = playerStats.getSessionPercentile();
        this.zzg = playerStats.getSpendPercentile();
        this.zzi = playerStats.getSpendProbability();
        this.zzj = playerStats.getHighSpenderProbability();
        this.zzk = playerStats.getTotalSpendNext28Days();
        this.zzh = playerStats.zza();
    }
}
