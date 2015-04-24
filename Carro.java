{\rtf1\ansi\ansicpg1252\cocoartf1347\cocoasubrtf570
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
public class Carro \{\
\
    private String marca;\
    private int puertas;\
    private int velocidad;\
    private String color;\
\
    Carro()\{\
\
        marca = "";\
        puertas = 0;\
        velocidad = 0;\
        color = "";\
\
    \}\
\
    public void setMarca(String m)\{\
        marca = m;\
    \}\
\
    public String getMarca()\{\
        return marca;\
    \}\
\
\
    public void setColor(String c)\{\
        color = c;\
    \}\
\
    public String getColor()\{\
        return color;\
    \}\
\
    public void setPuertas(int p)\{\
        puertas = p;\
    \}\
\
    public int getpuertas()\{\
        return puertas;\
    \}\
\
    public void setVelocidad(int v)\{\
        puertas = v;\
    \}\
\
    public int getVelocidad()\{\
        return velocidad;\
    \}\
\
    public void ImprimirCarro()\{\
        System.out.println("Marca: "+marca+", puertas: "+puertas+", Velocidad: "+velocidad+", Color: "+color);\
    \}\
\}}