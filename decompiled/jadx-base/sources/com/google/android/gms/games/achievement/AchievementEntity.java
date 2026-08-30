package com.google.android.gms.games.achievement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AchievementEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.achievement.Achievement {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.achievement.AchievementEntity> CREATOR = new com.google.android.gms.games.achievement.zza();
    private final java.lang.String zza;
    private final int zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final android.net.Uri zze;
    private final java.lang.String zzf;
    private final android.net.Uri zzg;
    private final java.lang.String zzh;
    private final int zzi;
    private final java.lang.String zzj;
    private final com.google.android.gms.games.PlayerEntity zzk;
    private final int zzl;
    private final int zzm;
    private final java.lang.String zzn;
    private final long zzo;
    private final long zzp;
    private final float zzq;
    private final java.lang.String zzr;

    public AchievementEntity(com.google.android.gms.games.achievement.Achievement achievement) {
        java.lang.String achievementId = achievement.getAchievementId();
        this.zza = achievementId;
        this.zzb = achievement.getType();
        this.zzc = achievement.getName();
        java.lang.String description = achievement.getDescription();
        this.zzd = description;
        this.zze = achievement.getUnlockedImageUri();
        this.zzf = achievement.getUnlockedImageUrl();
        this.zzg = achievement.getRevealedImageUri();
        this.zzh = achievement.getRevealedImageUrl();
        com.google.android.gms.games.Player playerZzb = achievement.zzb();
        if (playerZzb != null) {
            this.zzk = new com.google.android.gms.games.PlayerEntity(playerZzb);
        } else {
            this.zzk = null;
        }
        this.zzl = achievement.getState();
        this.zzo = achievement.getLastUpdatedTimestamp();
        this.zzp = achievement.getXpValue();
        this.zzq = achievement.zza();
        this.zzr = achievement.zzc();
        if (achievement.getType() == 1) {
            this.zzi = achievement.getTotalSteps();
            this.zzj = achievement.getFormattedTotalSteps();
            this.zzm = achievement.getCurrentSteps();
            this.zzn = achievement.getFormattedCurrentSteps();
        } else {
            this.zzi = 0;
            this.zzj = null;
            this.zzm = 0;
            this.zzn = null;
        }
        com.google.android.gms.common.internal.Asserts.checkNotNull(achievementId);
        com.google.android.gms.common.internal.Asserts.checkNotNull(description);
    }

    static int zzd(com.google.android.gms.games.achievement.Achievement achievement) {
        int currentSteps;
        int totalSteps;
        if (achievement.getType() == 1) {
            currentSteps = achievement.getCurrentSteps();
            totalSteps = achievement.getTotalSteps();
        } else {
            currentSteps = 0;
            totalSteps = 0;
        }
        return com.google.android.gms.common.internal.Objects.hashCode(achievement.getAchievementId(), achievement.zzc(), achievement.getName(), java.lang.Integer.valueOf(achievement.getType()), achievement.getDescription(), java.lang.Long.valueOf(achievement.getXpValue()), java.lang.Integer.valueOf(achievement.getState()), java.lang.Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.zzb(), java.lang.Integer.valueOf(currentSteps), java.lang.Integer.valueOf(totalSteps));
    }

    static java.lang.String zze(com.google.android.gms.games.achievement.Achievement achievement) {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(achievement).add("Id", achievement.getAchievementId()).add("Game Id", achievement.zzc()).add("Type", java.lang.Integer.valueOf(achievement.getType())).add("Name", achievement.getName()).add("Description", achievement.getDescription()).add("Player", achievement.zzb()).add("State", java.lang.Integer.valueOf(achievement.getState())).add("Rarity Percent", java.lang.Float.valueOf(achievement.zza()));
        if (achievement.getType() == 1) {
            toStringHelperAdd.add("CurrentSteps", java.lang.Integer.valueOf(achievement.getCurrentSteps()));
            toStringHelperAdd.add("TotalSteps", java.lang.Integer.valueOf(achievement.getTotalSteps()));
        }
        return toStringHelperAdd.toString();
    }

    static boolean zzf(com.google.android.gms.games.achievement.Achievement achievement, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.achievement.Achievement)) {
            return false;
        }
        if (achievement == obj) {
            return true;
        }
        com.google.android.gms.games.achievement.Achievement achievement2 = (com.google.android.gms.games.achievement.Achievement) obj;
        if (achievement2.getType() != achievement.getType()) {
            return false;
        }
        return (achievement.getType() != 1 || (achievement2.getCurrentSteps() == achievement.getCurrentSteps() && achievement2.getTotalSteps() == achievement.getTotalSteps())) && achievement2.getXpValue() == achievement.getXpValue() && achievement2.getState() == achievement.getState() && achievement2.getLastUpdatedTimestamp() == achievement.getLastUpdatedTimestamp() && com.google.android.gms.common.internal.Objects.equal(achievement2.getAchievementId(), achievement.getAchievementId()) && com.google.android.gms.common.internal.Objects.equal(achievement2.zzc(), achievement.zzc()) && com.google.android.gms.common.internal.Objects.equal(achievement2.getName(), achievement.getName()) && com.google.android.gms.common.internal.Objects.equal(achievement2.getDescription(), achievement.getDescription()) && com.google.android.gms.common.internal.Objects.equal(achievement2.zzb(), achievement.zzb()) && achievement2.zza() == achievement.zza();
    }

    public boolean equals(java.lang.Object obj) {
        return zzf(this, obj);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.common.data.Freezable
    public com.google.android.gms.games.achievement.Achievement freeze() {
        return this;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.achievement.Achievement freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getAchievementId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getCurrentSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        return this.zzm;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getDescription() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getDescription(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzd, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getFormattedCurrentSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        return this.zzn;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getFormattedTotalSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        return this.zzj;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getLastUpdatedTimestamp() {
        return this.zzo;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getName() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public com.google.android.gms.games.Player getPlayer() {
        return (com.google.android.gms.games.Player) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zzk);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public android.net.Uri getRevealedImageUri() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getRevealedImageUrl() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getState() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getTotalSteps() {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        return this.zzi;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public int getType() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public android.net.Uri getUnlockedImageUri() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public java.lang.String getUnlockedImageUrl() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public long getXpValue() {
        return this.zzp;
    }

    public int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public boolean isDataValid() {
        return true;
    }

    public java.lang.String toString() {
        return zze(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getAchievementId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getUnlockedImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getUnlockedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getRevealedImageUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getRevealedImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, getState());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 15, getLastUpdatedTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 16, getXpValue());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 17, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 18, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final float zza() {
        return this.zzq;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final com.google.android.gms.games.Player zzb() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public final java.lang.String zzc() {
        return this.zzr;
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedCurrentSteps(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzn, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.achievement.Achievement
    public void getFormattedTotalSteps(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.internal.Asserts.checkState(getType() == 1);
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzj, charArrayBuffer);
    }

    AchievementEntity(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, android.net.Uri uri, java.lang.String str4, android.net.Uri uri2, java.lang.String str5, int i2, java.lang.String str6, com.google.android.gms.games.PlayerEntity playerEntity, int i3, int i4, java.lang.String str7, long j, long j2, float f, java.lang.String str8) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = uri;
        this.zzf = str4;
        this.zzg = uri2;
        this.zzh = str5;
        this.zzi = i2;
        this.zzj = str6;
        this.zzk = playerEntity;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = str7;
        this.zzo = j;
        this.zzp = j2;
        this.zzq = f;
        this.zzr = str8;
    }
}
