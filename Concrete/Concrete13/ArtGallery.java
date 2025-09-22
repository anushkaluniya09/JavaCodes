package com.Concrete.Concrete13;

class ArtGallery {
    private String galleryName;
    private String city;
    private int paintings;

    public ArtGallery(String galleryName, String city, int paintings) {
        this.galleryName = galleryName;
        this.city = city;
        this.paintings = paintings;
    }

    public void displayGallery() {
        System.out.println(galleryName + " in " + city + " has " + paintings + " paintings");
    }
}
