package com.chanchal.sindhubhawanshaadi.tourguide;

public class PlaceName {

    private String PlaceName ;

    private String PlaceDesc ;

    private int ImageId = No_Image_Id;

    private final static int No_Image_Id = -1;


    public PlaceName(String PlaceName , String PlaceDesc ,int ImageId)
    {
        this.PlaceName = PlaceName;
        this.PlaceDesc = PlaceDesc;
        this.ImageId = ImageId;
    }

    public PlaceName(String PlaceName , String PlaceDesc)
    {
        this.PlaceName = PlaceName;
        this.PlaceDesc = PlaceDesc;
    }

    public String getPlaceDesc() {
        return PlaceDesc;
    }

    public void setPlaceDesc(String placeDesc) {
        PlaceDesc = placeDesc;
    }

    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String placeName) {
        PlaceName = placeName;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }


    public Boolean hasImage(){
        return (ImageId != -1);
    }
}
