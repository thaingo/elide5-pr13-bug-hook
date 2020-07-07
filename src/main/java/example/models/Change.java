/*
 * Copyright 2019, Verizon Media.
 * Licensed under the Apache License, Version 2.0
 * See LICENSE file in project root for terms.
 */
package example.models;

import com.yahoo.elide.annotation.Include;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Include
@Entity
@Setter
@Getter
public class Change {

    @Id
    private Long id;
    private String name = "Change";
    private Date createdAt = new Date();

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Report report;
}
