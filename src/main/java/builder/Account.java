package builder;

import objectmodels.AccountListItem;

/**
 * Account entity builder
 */
public class Account extends AccountListItem {
    private final int id;
    private final String name;
    private final boolean enabled;
    private final String serviceProvider;
    private final int serviceProviderId;

    //constructor
    private Account(AccountBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.enabled = builder.enabled;
        this.serviceProvider = builder.serviceProvider;
        this.serviceProviderId = builder.serviceProviderId;
    }

    //Builder class
    public static final class AccountBuilder {
        private final int id;
        private final String name;
        private final boolean enabled;
        private final String serviceProvider;
        private final int serviceProviderId;

        public AccountBuilder(int id, String name, boolean enabled, String serviceProvider, int serviceProviderId) {
            this.id = id;
            this.name = name;
            this.enabled = enabled;
            this.serviceProvider = serviceProvider;
            this.serviceProviderId = serviceProviderId;
        }

        public Account build() {
            return new Account(this);
        }
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }
}
