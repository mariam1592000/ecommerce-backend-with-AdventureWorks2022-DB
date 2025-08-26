package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ProductPhoto", schema = "Production")
@Getter
@Setter
public class ProductPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductPhotoID")
    private int productPhotoID;

//    @Lob
    @Column(name = "ThumbNailPhoto")
    private byte[] thumbNailPhoto;

    @Column(name = "ThumbnailPhotoFileName", length = 50)
    private String thumbnailPhotoFileName;

//    @Lob
    @Column(name = "LargePhoto")
    private byte[] largePhoto;

    @Column(name = "LargePhotoFileName", length = 50)
    private String largePhotoFileName;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;
}
