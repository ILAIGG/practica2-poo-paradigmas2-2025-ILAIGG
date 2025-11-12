package com.mycompany.app;

public class Var {
    private AsistenteDeVideo asistenteDeVideo;
    private AsistenteVar asistenteVar1;
    private AsistenteVar asistenteVar2;
    private AsistenteVar asistenteVar3;

    public Var(AsistenteDeVideo asistenteDeVideo, AsistenteVar asistenteVar1, AsistenteVar asistenteVar2, AsistenteVar asistenteVar3) {
        setAsistenteDeVideo(asistenteDeVideo);
        setAsistenteVar1(asistenteVar1);
        setAsistenteVar2(asistenteVar2);
        setAsistenteVar3(asistenteVar3);
    }

    private void setAsistenteDeVideo(AsistenteDeVideo asistenteDeVideo) {
        this. asistenteDeVideo = asistenteDeVideo;
    }

    public AsistenteDeVideo getAsistenteDeVideo() {
        return asistenteDeVideo;
    }

    private void setAsistenteVar1(AsistenteVar asistenteVar1) {
        this.asistenteVar1 = asistenteVar1;
    }

    public AsistenteVar getAsistenteVar1() {
        return asistenteVar1;
    }

    private void setAsistenteVar2(AsistenteVar asistenteVar2) {
        this.asistenteVar2 = asistenteVar2;
    }

    public AsistenteVar getAsistenteVar2() {
        return asistenteVar2;
    }

    private void setAsistenteVar3(AsistenteVar asistenteVar3) {
        this.asistenteVar3 = asistenteVar3;
    }

    public AsistenteVar getAsistenteVar3() {
        return asistenteVar3;
    }
}
