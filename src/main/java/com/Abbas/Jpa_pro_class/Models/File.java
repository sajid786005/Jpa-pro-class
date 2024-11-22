package com.Abbas.Jpa_pro_class.Models;

import jakarta.annotation.Resource;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.lang.annotation.Annotation;


//@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorValue("F")
public class File implements Resource {


    private String type;

    @Override
    public String name() {
        return "";
    }

    @Override
    public String lookup() {
        return "";
    }

    @Override
    public Class<?> type() {
        return null;
    }

    @Override
    public AuthenticationType authenticationType() {
        return null;
    }

    @Override
    public boolean shareable() {
        return false;
    }

    @Override
    public String mappedName() {
        return "";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
