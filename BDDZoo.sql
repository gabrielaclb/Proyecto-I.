PGDMP     #                    y            BDDZoo    13.1    13.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    32768    BDDZoo    DATABASE     d   CREATE DATABASE "BDDZoo" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE "BDDZoo";
                postgres    false            ?            1259    40996    anfibios    TABLE     ?  CREATE TABLE public.anfibios (
    nombre character varying NOT NULL,
    edad character varying,
    peso character varying,
    patas character varying,
    "tamaño" character varying,
    medio character varying,
    genero character varying,
    alimientacion character varying,
    color character varying,
    pelo character varying,
    cola character varying,
    respiracion character varying
);
    DROP TABLE public.anfibios;
       public         heap    postgres    false            ?            1259    40978    aves    TABLE     ?  CREATE TABLE public.aves (
    nombre character varying NOT NULL,
    edad character varying,
    peso character varying,
    patas character varying,
    "tamaño" character varying,
    medio character varying,
    genero character varying,
    alimientacion character varying,
    color character varying,
    pelo character varying,
    nplumas character varying,
    cpico character varying,
    garras character varying
);
    DROP TABLE public.aves;
       public         heap    postgres    false            ?            1259    40972 	   mamiferos    TABLE     ?  CREATE TABLE public.mamiferos (
    nombre character varying NOT NULL,
    edad character varying,
    peso character varying,
    patas character varying,
    "tamaño" character varying,
    medio character varying,
    genero character varying,
    alimientacion character varying,
    color character varying,
    pelo character varying,
    cantpelo character varying,
    ndientes character varying
);
    DROP TABLE public.mamiferos;
       public         heap    postgres    false            ?            1259    40984    peces    TABLE     ?  CREATE TABLE public.peces (
    nombre character varying NOT NULL,
    edad character varying,
    peso character varying,
    patas character varying,
    "tamaño" character varying,
    medio character varying,
    genero character varying,
    alimientacion character varying,
    color character varying,
    pelo character varying,
    naletas character varying,
    nbranquias character varying,
    cartilaginoso character varying,
    oseo character varying,
    escamas character varying
);
    DROP TABLE public.peces;
       public         heap    postgres    false            ?            1259    40990    reptiles    TABLE     ?  CREATE TABLE public.reptiles (
    nombre character varying NOT NULL,
    edad character varying,
    peso character varying,
    patas character varying,
    "tamaño" character varying,
    medio character varying,
    genero character varying,
    alimientacion character varying,
    color character varying,
    pelo character varying,
    caparazon character varying,
    extremidades character varying,
    dientes character varying,
    ndientes character varying
);
    DROP TABLE public.reptiles;
       public         heap    postgres    false            ?          0    40996    anfibios 
   TABLE DATA           ?   COPY public.anfibios (nombre, edad, peso, patas, "tamaño", medio, genero, alimientacion, color, pelo, cola, respiracion) FROM stdin;
    public          postgres    false    204   z       ?          0    40978    aves 
   TABLE DATA           ?   COPY public.aves (nombre, edad, peso, patas, "tamaño", medio, genero, alimientacion, color, pelo, nplumas, cpico, garras) FROM stdin;
    public          postgres    false    201   ?       ?          0    40972 	   mamiferos 
   TABLE DATA           ?   COPY public.mamiferos (nombre, edad, peso, patas, "tamaño", medio, genero, alimientacion, color, pelo, cantpelo, ndientes) FROM stdin;
    public          postgres    false    200   ?       ?          0    40984    peces 
   TABLE DATA           ?   COPY public.peces (nombre, edad, peso, patas, "tamaño", medio, genero, alimientacion, color, pelo, naletas, nbranquias, cartilaginoso, oseo, escamas) FROM stdin;
    public          postgres    false    202   ?       ?          0    40990    reptiles 
   TABLE DATA           ?   COPY public.reptiles (nombre, edad, peso, patas, "tamaño", medio, genero, alimientacion, color, pelo, caparazon, extremidades, dientes, ndientes) FROM stdin;
    public          postgres    false    203          ?      x?????? ? ?      ?      x?????? ? ?      ?   #   x?.)??K?4?`URT?
cq??qqq ???      ?      x?????? ? ?      ?      x?????? ? ?     