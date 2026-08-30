package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientSettings {

    @javax.annotation.Nullable
    private final android.accounts.Account zaa;
    private final java.util.Set zab;
    private final java.util.Set zac;
    private final java.util.Map zad;
    private final int zae;

    @javax.annotation.Nullable
    private final android.view.View zaf;
    private final java.lang.String zag;
    private final java.lang.String zah;
    private final com.google.android.gms.signin.SignInOptions zai;
    private java.lang.Integer zaj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static final class Builder {

        @javax.annotation.Nullable
        private android.accounts.Account zaa;
        private androidx.collection.ArraySet zab;
        private java.lang.String zac;
        private java.lang.String zad;
        private final com.google.android.gms.signin.SignInOptions zae = com.google.android.gms.signin.SignInOptions.zaa;

        public com.google.android.gms.common.internal.ClientSettings build() {
            return new com.google.android.gms.common.internal.ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        public com.google.android.gms.common.internal.ClientSettings.Builder setRealClientPackageName(java.lang.String str) {
            this.zac = str;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zaa(java.util.Collection collection) {
            if (this.zab == null) {
                this.zab = new androidx.collection.ArraySet();
            }
            this.zab.addAll(collection);
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zab(@javax.annotation.Nullable android.accounts.Account account) {
            this.zaa = account;
            return this;
        }

        public final com.google.android.gms.common.internal.ClientSettings.Builder zac(java.lang.String str) {
            this.zad = str;
            return this;
        }
    }

    public ClientSettings(android.accounts.Account account, java.util.Set<com.google.android.gms.common.api.Scope> set, java.util.Map<com.google.android.gms.common.api.Api<?>, com.google.android.gms.common.internal.zab> map, int i, @javax.annotation.Nullable android.view.View view, java.lang.String str, java.lang.String str2, @javax.annotation.Nullable com.google.android.gms.signin.SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    public static com.google.android.gms.common.internal.ClientSettings createDefault(android.content.Context context) {
        return new com.google.android.gms.common.api.GoogleApiClient.Builder(context).zaa();
    }

    public android.accounts.Account getAccount() {
        return this.zaa;
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
        android.accounts.Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public android.accounts.Account getAccountOrDefault() {
        android.accounts.Account account = this.zaa;
        return account != null ? account : new android.accounts.Account("<<default account>>", "com.google");
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getAllRequestedScopes() {
        return this.zac;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getApplicableScopes(com.google.android.gms.common.api.Api<?> api) {
        com.google.android.gms.common.internal.zab zabVar = (com.google.android.gms.common.internal.zab) this.zad.get(api);
        if (zabVar == null || zabVar.zaa.isEmpty()) {
            return this.zab;
        }
        java.util.HashSet hashSet = new java.util.HashSet(this.zab);
        hashSet.addAll(zabVar.zaa);
        return hashSet;
    }

    public int getGravityForPopups() {
        return this.zae;
    }

    public java.lang.String getRealClientPackageName() {
        return this.zag;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getRequiredScopes() {
        return this.zab;
    }

    public android.view.View getViewForPopups() {
        return this.zaf;
    }

    public final com.google.android.gms.signin.SignInOptions zaa() {
        return this.zai;
    }

    public final java.lang.Integer zab() {
        return this.zaj;
    }

    public final java.lang.String zac() {
        return this.zah;
    }

    public final java.util.Map zad() {
        return this.zad;
    }

    public final void zae(java.lang.Integer num) {
        this.zaj = num;
    }

    public ClientSettings(@javax.annotation.Nullable android.accounts.Account account, java.util.Set set, java.util.Map map, int i, @javax.annotation.Nullable android.view.View view, java.lang.String str, java.lang.String str2, @javax.annotation.Nullable com.google.android.gms.signin.SignInOptions signInOptions, boolean z) {
        this.zaa = account;
        java.util.Set setEmptySet = set == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(set);
        this.zab = setEmptySet;
        map = map == null ? java.util.Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? com.google.android.gms.signin.SignInOptions.zaa : signInOptions;
        java.util.HashSet hashSet = new java.util.HashSet(setEmptySet);
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((com.google.android.gms.common.internal.zab) it.next()).zaa);
        }
        this.zac = java.util.Collections.unmodifiableSet(hashSet);
    }
}
