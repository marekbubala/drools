package org.drools.model.codegen.execmodel.drlx;

import java.time.LocalDate;

import org.drools.model.datasources.DataSource;

public class Example /*implements RuleUnit*/ {

    DataSource<LocalDate> dates;

    public DataSource<LocalDate> getDates() {
        return dates;
    }
}
