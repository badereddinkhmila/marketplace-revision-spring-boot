package com.ecommerce.marketplace.Entity;

import com.ecommerce.marketplace.Entity.audit.UserDateAudit;
import lombok.*;
import org.hibernate.search.annotations.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Indexed
@Getter
@Setter
public
class Product extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    @Size(max=50)
    @Field(termVector = TermVector.YES)
    private String nameProduct;

    @NonNull
    @Size(min=10)
    @Field(termVector = TermVector.YES)
    private String description;

    private boolean isAvailable;

    @NonNull
    @Field(termVector = TermVector.YES)
    @SortableField
    private Float price;

    @Min(0)
    private int quantity=0;

    @Min(0)
    private int discount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id",nullable = false)
    @IndexedEmbedded
    private Category category;

}