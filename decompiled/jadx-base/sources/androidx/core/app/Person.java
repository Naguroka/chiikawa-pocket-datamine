package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class Person {
    private static final java.lang.String ICON_KEY = "icon";
    private static final java.lang.String IS_BOT_KEY = "isBot";
    private static final java.lang.String IS_IMPORTANT_KEY = "isImportant";
    private static final java.lang.String KEY_KEY = "key";
    private static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String URI_KEY = "uri";
    androidx.core.graphics.drawable.IconCompat mIcon;
    boolean mIsBot;
    boolean mIsImportant;
    java.lang.String mKey;
    java.lang.CharSequence mName;
    java.lang.String mUri;

    public static androidx.core.app.Person fromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle("icon");
        return new androidx.core.app.Person.Builder().setName(bundle.getCharSequence("name")).setIcon(bundle2 != null ? androidx.core.graphics.drawable.IconCompat.createFromBundle(bundle2) : null).setUri(bundle.getString(URI_KEY)).setKey(bundle.getString("key")).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle persistableBundle) {
        return androidx.core.app.Person.Api22Impl.fromPersistableBundle(persistableBundle);
    }

    public static androidx.core.app.Person fromAndroidPerson(android.app.Person person) {
        return androidx.core.app.Person.Api28Impl.fromAndroidPerson(person);
    }

    Person(androidx.core.app.Person.Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putCharSequence("name", this.mName);
        androidx.core.graphics.drawable.IconCompat iconCompat = this.mIcon;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.toBundle() : null);
        bundle.putString(URI_KEY, this.mUri);
        bundle.putString("key", this.mKey);
        bundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle;
    }

    public android.os.PersistableBundle toPersistableBundle() {
        return androidx.core.app.Person.Api22Impl.toPersistableBundle(this);
    }

    public androidx.core.app.Person.Builder toBuilder() {
        return new androidx.core.app.Person.Builder(this);
    }

    public android.app.Person toAndroidPerson() {
        return androidx.core.app.Person.Api28Impl.toAndroidPerson(this);
    }

    public java.lang.CharSequence getName() {
        return this.mName;
    }

    public androidx.core.graphics.drawable.IconCompat getIcon() {
        return this.mIcon;
    }

    public java.lang.String getUri() {
        return this.mUri;
    }

    public java.lang.String getKey() {
        return this.mKey;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public java.lang.String resolveToLegacyUri() {
        java.lang.String str = this.mUri;
        if (str != null) {
            return str;
        }
        return this.mName != null ? "name:" + ((java.lang.Object) this.mName) : "";
    }

    public static class Builder {
        androidx.core.graphics.drawable.IconCompat mIcon;
        boolean mIsBot;
        boolean mIsImportant;
        java.lang.String mKey;
        java.lang.CharSequence mName;
        java.lang.String mUri;

        public Builder() {
        }

        Builder(androidx.core.app.Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }

        public androidx.core.app.Person.Builder setName(java.lang.CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public androidx.core.app.Person.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        public androidx.core.app.Person.Builder setUri(java.lang.String str) {
            this.mUri = str;
            return this;
        }

        public androidx.core.app.Person.Builder setKey(java.lang.String str) {
            this.mKey = str;
            return this;
        }

        public androidx.core.app.Person.Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        public androidx.core.app.Person.Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        public androidx.core.app.Person build() {
            return new androidx.core.app.Person(this);
        }
    }

    static class Api22Impl {
        private Api22Impl() {
        }

        static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle persistableBundle) {
            return new androidx.core.app.Person.Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString(androidx.core.app.Person.URI_KEY)).setKey(persistableBundle.getString("key")).setBot(persistableBundle.getBoolean(androidx.core.app.Person.IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(androidx.core.app.Person.IS_IMPORTANT_KEY)).build();
        }

        static android.os.PersistableBundle toPersistableBundle(androidx.core.app.Person person) {
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putString("name", person.mName != null ? person.mName.toString() : null);
            persistableBundle.putString(androidx.core.app.Person.URI_KEY, person.mUri);
            persistableBundle.putString("key", person.mKey);
            persistableBundle.putBoolean(androidx.core.app.Person.IS_BOT_KEY, person.mIsBot);
            persistableBundle.putBoolean(androidx.core.app.Person.IS_IMPORTANT_KEY, person.mIsImportant);
            return persistableBundle;
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static androidx.core.app.Person fromAndroidPerson(android.app.Person person) {
            return new androidx.core.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.createFromIcon(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }

        static android.app.Person toAndroidPerson(androidx.core.app.Person person) {
            return new android.app.Person.Builder().setName(person.getName()).setIcon(person.getIcon() != null ? person.getIcon().toIcon() : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
        }
    }
}
