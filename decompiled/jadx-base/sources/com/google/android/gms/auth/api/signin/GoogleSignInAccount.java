package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zab();
    public static final com.google.android.gms.common.util.Clock zaa = com.google.android.gms.common.util.DefaultClock.getInstance();
    final java.util.List zab;
    private final java.lang.String zac;
    private final java.lang.String zad;
    private final java.lang.String zae;
    private final java.lang.String zaf;
    private final android.net.Uri zag;
    private java.lang.String zah;
    private final long zai;
    private final java.lang.String zaj;
    private final java.lang.String zak;
    private final java.lang.String zal;
    private final java.util.Set zam = new java.util.HashSet();

    GoogleSignInAccount(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.List list, java.lang.String str7, java.lang.String str8) {
        this.zac = str;
        this.zad = str2;
        this.zae = str3;
        this.zaf = str4;
        this.zag = uri;
        this.zah = str5;
        this.zai = j;
        this.zaj = str6;
        this.zab = list;
        this.zak = str7;
        this.zal = str8;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount createDefault() {
        return zae(new android.accounts.Account("<<default account>>", "com.google"), new java.util.HashSet());
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccount(android.accounts.Account account) {
        return zae(account, new androidx.collection.ArraySet());
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccountAndScopes(android.accounts.Account account, com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(account);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scope);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(scope);
        hashSet.addAll(java.util.Arrays.asList(scopeArr));
        return zae(account, hashSet);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.net.Uri uri, java.lang.Long l, java.lang.String str7, java.util.Set set) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInAccount(str, str2, str3, str4, uri, null, l.longValue(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str7), new java.util.ArrayList((java.util.Collection) com.google.android.gms.common.internal.Preconditions.checkNotNull(set)), str5, str6);
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zab(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("photoUrl");
        android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
        long j = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(jSONArray.getString(i)));
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountZaa = zaa(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, java.lang.Long.valueOf(j), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountZaa.zah = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountZaa;
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInAccount zae(android.accounts.Account account, java.util.Set set) {
        return zaa(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        return googleSignInAccount.zaj.equals(this.zaj) && googleSignInAccount.getRequestedScopes().equals(getRequestedScopes());
    }

    public android.accounts.Account getAccount() {
        java.lang.String str = this.zae;
        if (str == null) {
            return null;
        }
        return new android.accounts.Account(str, "com.google");
    }

    public java.lang.String getDisplayName() {
        return this.zaf;
    }

    public java.lang.String getEmail() {
        return this.zae;
    }

    public java.lang.String getFamilyName() {
        return this.zal;
    }

    public java.lang.String getGivenName() {
        return this.zak;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getGrantedScopes() {
        return new java.util.HashSet(this.zab);
    }

    public java.lang.String getId() {
        return this.zac;
    }

    public java.lang.String getIdToken() {
        return this.zad;
    }

    public android.net.Uri getPhotoUrl() {
        return this.zag;
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getRequestedScopes() {
        java.util.HashSet hashSet = new java.util.HashSet(this.zab);
        hashSet.addAll(this.zam);
        return hashSet;
    }

    public java.lang.String getServerAuthCode() {
        return this.zah;
    }

    public int hashCode() {
        return ((this.zaj.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + getRequestedScopes().hashCode();
    }

    public boolean isExpired() {
        return zaa.currentTimeMillis() / 1000 >= this.zai + (-300);
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount requestExtraScopes(com.google.android.gms.common.api.Scope... scopeArr) {
        if (scopeArr != null) {
            java.util.Collections.addAll(this.zam, scopeArr);
        }
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getEmail(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPhotoUrl(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getServerAuthCode(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zai);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zaj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 10, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zac() {
        return this.zaj;
    }

    public final java.lang.String zad() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (getIdToken() != null) {
                jSONObject.put("tokenId", getIdToken());
            }
            if (getEmail() != null) {
                jSONObject.put("email", getEmail());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (getGivenName() != null) {
                jSONObject.put("givenName", getGivenName());
            }
            if (getFamilyName() != null) {
                jSONObject.put("familyName", getFamilyName());
            }
            android.net.Uri photoUrl = getPhotoUrl();
            if (photoUrl != null) {
                jSONObject.put("photoUrl", photoUrl.toString());
            }
            if (getServerAuthCode() != null) {
                jSONObject.put("serverAuthCode", getServerAuthCode());
            }
            jSONObject.put("expirationTime", this.zai);
            jSONObject.put("obfuscatedIdentifier", this.zaj);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.List list = this.zab;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
            java.util.Arrays.sort(scopeArr, new java.util.Comparator() { // from class: com.google.android.gms.auth.api.signin.zaa
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                    android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> creator = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR;
                    return ((com.google.android.gms.common.api.Scope) obj).getScopeUri().compareTo(((com.google.android.gms.common.api.Scope) obj2).getScopeUri());
                }
            });
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (org.json.JSONException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
