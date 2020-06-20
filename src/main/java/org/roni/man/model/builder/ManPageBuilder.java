package org.roni.man.model.builder;

import org.apache.commons.lang3.builder.Builder;
import org.roni.man.model.ManPage;
import org.roni.man.model.Options;
import org.roni.man.model.Usage;

public class ManPageBuilder implements Builder<ManPage> {
    private ManPage manPage;

    public ManPageBuilder(String application) {
        this.manPage = new ManPage(application);
    }

    public ManPageBuilder title(String title) {
        this.manPage.setTitle(title);
        return this; // Reference returned so calls can be chained
    }

    public ManPageBuilder usage(Usage usage) {
        this.manPage.setUsage(usage);
        return this; // Reference returned so calls can be chained
    }

    public ManPageBuilder addOption(Options options) {
        this.manPage.setOptions();
        return this; // Reference returned so calls can be chained
    }

    // Other Font construction methods
    public ManPage build() {
        return this.manPage;
    }
}
