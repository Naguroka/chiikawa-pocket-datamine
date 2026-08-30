package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AccountPicker {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static class AccountChooserOptions {
        private android.accounts.Account zza;
        private boolean zzb;
        private java.util.ArrayList zzc;
        private java.util.ArrayList zzd;
        private boolean zze;
        private java.lang.String zzf;
        private android.os.Bundle zzg;
        private boolean zzh;
        private int zzi;
        private java.lang.String zzj;
        private boolean zzk;
        private com.google.android.gms.common.zza zzl;
        private java.lang.String zzm;
        private boolean zzn;
        private boolean zzo;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
        public static class Builder {
            private android.accounts.Account zza;
            private java.util.ArrayList zzb;
            private java.util.ArrayList zzc;
            private boolean zzd = false;
            private java.lang.String zze;
            private android.os.Bundle zzf;

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions build() {
                com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
                com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
                com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions = new com.google.android.gms.common.AccountPicker.AccountChooserOptions();
                accountChooserOptions.zzd = this.zzc;
                accountChooserOptions.zzc = this.zzb;
                accountChooserOptions.zze = this.zzd;
                accountChooserOptions.zzl = null;
                accountChooserOptions.zzj = null;
                accountChooserOptions.zzg = this.zzf;
                accountChooserOptions.zza = this.zza;
                accountChooserOptions.zzb = false;
                accountChooserOptions.zzh = false;
                accountChooserOptions.zzm = null;
                accountChooserOptions.zzi = 0;
                accountChooserOptions.zzf = this.zze;
                accountChooserOptions.zzk = false;
                accountChooserOptions.zzn = false;
                accountChooserOptions.zzo = false;
                return accountChooserOptions;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccounts(java.util.List<android.accounts.Account> list) {
                this.zzb = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAllowableAccountsTypes(java.util.List<java.lang.String> list) {
                this.zzc = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setAlwaysShowAccountPicker(boolean z) {
                this.zzd = z;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setOptionsForAddingAccount(android.os.Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setSelectedAccount(android.accounts.Account account) {
                this.zza = account;
                return this;
            }

            public com.google.android.gms.common.AccountPicker.AccountChooserOptions.Builder setTitleOverrideText(java.lang.String str) {
                this.zze = str;
                return this;
            }
        }

        static /* bridge */ /* synthetic */ boolean zzA(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzo;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzB(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzb;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzC(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzh;
            return false;
        }

        static /* bridge */ /* synthetic */ boolean zzD(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzk;
            return false;
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            int i = accountChooserOptions.zzi;
            return 0;
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.common.zza zzd(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            com.google.android.gms.common.zza zzaVar = accountChooserOptions.zzl;
            return null;
        }

        static /* bridge */ /* synthetic */ java.lang.String zze(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            java.lang.String str = accountChooserOptions.zzj;
            return null;
        }

        static /* bridge */ /* synthetic */ java.lang.String zzf(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            java.lang.String str = accountChooserOptions.zzm;
            return null;
        }

        static /* bridge */ /* synthetic */ boolean zzz(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.zzn;
            return false;
        }
    }

    private AccountPicker() {
    }

    @java.lang.Deprecated
    public static android.content.Intent newChooseAccountIntent(android.accounts.Account account, java.util.ArrayList<android.accounts.Account> arrayList, java.lang.String[] strArr, boolean z, java.lang.String str, java.lang.String str2, java.lang.String[] strArr2, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        return intent;
    }

    public static android.content.Intent newChooseAccountIntent(com.google.android.gms.common.AccountPicker.AccountChooserOptions accountChooserOptions) {
        android.content.Intent intent = new android.content.Intent();
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(accountChooserOptions);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zze(accountChooserOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "We only support hostedDomain filter for account chip styled account picker");
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzd(accountChooserOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Consent is only valid for account chip styled account picker");
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzB(accountChooserOptions);
        com.google.android.gms.common.internal.Preconditions.checkArgument(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc);
        if (accountChooserOptions.zzd != null) {
            intent.putExtra("allowableAccountTypes", (java.lang.String[]) accountChooserOptions.zzd.toArray(new java.lang.String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzg);
        intent.putExtra("selectedAccount", accountChooserOptions.zza);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzB(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zze);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzf);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzC(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzf(accountChooserOptions);
        intent.putExtra("realClientPackage", (java.lang.String) null);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zza(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zze(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzD(accountChooserOptions);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzd(accountChooserOptions);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzz(accountChooserOptions);
        com.google.android.gms.common.AccountPicker.AccountChooserOptions.zzA(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
