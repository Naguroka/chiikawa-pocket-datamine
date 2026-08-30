package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Api.ApiOptions.Optional, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final com.google.android.gms.common.api.Scope zaa = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
    public static final com.google.android.gms.common.api.Scope zab = new com.google.android.gms.common.api.Scope("email");
    public static final com.google.android.gms.common.api.Scope zac = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.OPEN_ID);
    public static final com.google.android.gms.common.api.Scope zad;
    public static final com.google.android.gms.common.api.Scope zae;
    private static final java.util.Comparator zag;
    final int zaf;
    private final java.util.ArrayList zah;
    private android.accounts.Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private java.lang.String zam;
    private java.lang.String zan;
    private java.util.ArrayList zao;
    private java.lang.String zap;
    private java.util.Map zaq;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    @java.lang.Deprecated
    public static final class Builder {
        private java.util.Set zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        private java.lang.String zae;
        private android.accounts.Account zaf;
        private java.lang.String zag;
        private java.util.Map zah;
        private java.lang.String zai;

        public Builder() {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
        }

        private final java.lang.String zaa(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            java.lang.String str2 = this.zae;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(z, "two different server client ids provided");
            return str;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder addExtension(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zah.containsKey(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new java.lang.IllegalStateException("Only one extension per type may be added");
            }
            java.util.List<com.google.android.gms.common.api.Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.zaa.addAll(impliedScopes);
            }
            this.zah.put(java.lang.Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions build() {
            if (this.zaa.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae) && this.zaa.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad)) {
                this.zaa.remove(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad);
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                requestId();
            }
            return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(new java.util.ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestEmail() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestId() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestIdToken(java.lang.String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestProfile() {
            this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestScopes(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
            this.zaa.add(scope);
            this.zaa.addAll(java.util.Arrays.asList(scopeArr));
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setAccountName(java.lang.String str) {
            this.zaf = new android.accounts.Account(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setHostedDomain(java.lang.String str) {
            this.zag = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder setLogSessionId(java.lang.String str) {
            this.zai = str;
            return this;
        }

        public com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder requestServerAuthCode(java.lang.String str, boolean z) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z;
            return this;
        }

        public Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
            this.zaa = new java.util.HashSet();
            this.zah = new java.util.HashMap();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions);
            this.zaa = new java.util.HashSet(googleSignInOptions.zah);
            this.zab = googleSignInOptions.zak;
            this.zac = googleSignInOptions.zal;
            this.zad = googleSignInOptions.zaj;
            this.zae = googleSignInOptions.zam;
            this.zaf = googleSignInOptions.zai;
            this.zag = googleSignInOptions.zan;
            this.zah = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.zai = googleSignInOptions.zap;
        }
    }

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES_LITE);
        zad = scope;
        zae = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.GAMES);
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder2 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        builder2.requestScopes(scope, new com.google.android.gms.common.api.Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new com.google.android.gms.auth.api.signin.zae();
        zag = new com.google.android.gms.auth.api.signin.zac();
    }

    GoogleSignInOptions(int i, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList2, java.lang.String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, zam(arrayList2), str3);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions zab(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        java.lang.String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(strOptString) ? new android.accounts.Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), (java.lang.String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map zam(java.util.List list) {
        java.util.HashMap map = new java.util.HashMap();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(java.lang.Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            if (this.zao.isEmpty() && googleSignInOptions.zao.isEmpty() && this.zah.size() == googleSignInOptions.getScopes().size() && this.zah.containsAll(googleSignInOptions.getScopes())) {
                android.accounts.Account account = this.zai;
                if (account == null) {
                    if (googleSignInOptions.getAccount() == null) {
                        if (android.text.TextUtils.isEmpty(this.zam)) {
                            if (android.text.TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                                if (this.zal != googleSignInOptions.isForceCodeForRefreshToken() && this.zaj == googleSignInOptions.isIdTokenRequested() && this.zak == googleSignInOptions.isServerAuthCodeRequested() && android.text.TextUtils.equals(this.zap, googleSignInOptions.getLogSessionId())) {
                                    return true;
                                }
                            }
                        } else if (!this.zam.equals(googleSignInOptions.getServerClientId())) {
                            if (this.zal != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.getAccount())) {
                    if (android.text.TextUtils.isEmpty(this.zam)) {
                        if (android.text.TextUtils.isEmpty(googleSignInOptions.getServerClientId())) {
                            if (this.zal != googleSignInOptions.isForceCodeForRefreshToken()) {
                            }
                        }
                    } else if (!this.zam.equals(googleSignInOptions.getServerClientId())) {
                        if (this.zal != googleSignInOptions.isForceCodeForRefreshToken()) {
                        }
                    }
                }
            }
        } catch (java.lang.ClassCastException unused) {
        }
        return false;
    }

    public android.accounts.Account getAccount() {
        return this.zai;
    }

    public java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    public java.lang.String getLogSessionId() {
        return this.zap;
    }

    public com.google.android.gms.common.api.Scope[] getScopeArray() {
        return (com.google.android.gms.common.api.Scope[]) this.zah.toArray(new com.google.android.gms.common.api.Scope[this.zah.size()]);
    }

    public java.util.ArrayList<com.google.android.gms.common.api.Scope> getScopes() {
        return new java.util.ArrayList<>(this.zah);
    }

    public java.lang.String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((com.google.android.gms.common.api.Scope) arrayList2.get(i)).getScopeUri());
        }
        java.util.Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.HashAccumulator hashAccumulator = new com.google.android.gms.auth.api.signin.internal.HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.zai);
        hashAccumulator.addObject(this.zam);
        hashAccumulator.zaa(this.zal);
        hashAccumulator.zaa(this.zaj);
        hashAccumulator.zaa(this.zak);
        hashAccumulator.addObject(this.zap);
        return hashAccumulator.hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaf;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zaf() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Collections.sort(this.zah, zag);
            java.util.Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((com.google.android.gms.common.api.Scope) it.next()).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            android.accounts.Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!android.text.TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!android.text.TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private GoogleSignInOptions(int i, java.util.ArrayList arrayList, android.accounts.Account account, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.util.Map map, java.lang.String str3) {
        this.zaf = i;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z;
        this.zak = z2;
        this.zal = z3;
        this.zam = str;
        this.zan = str2;
        this.zao = new java.util.ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }
}
