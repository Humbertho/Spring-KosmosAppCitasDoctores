PGDMP                          {            kosmos    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    65550    kosmos    DATABASE     z   CREATE DATABASE kosmos WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE kosmos;
                postgres    false            �            1259    65552    citas    TABLE     �   CREATE TABLE public.citas (
    id bigint NOT NULL,
    fecha_cita date,
    horario time without time zone,
    nombre_paciente character varying(255),
    id_consultorio bigint,
    id_doctor bigint
);
    DROP TABLE public.citas;
       public         heap    postgres    false            �            1259    65551    citas_id_seq    SEQUENCE     u   CREATE SEQUENCE public.citas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.citas_id_seq;
       public          postgres    false    215                       0    0    citas_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.citas_id_seq OWNED BY public.citas.id;
          public          postgres    false    214            �            1259    65559    consultorio    TABLE     �   CREATE TABLE public.consultorio (
    id bigint NOT NULL,
    numero_consultorio character varying(255),
    piso character varying(255)
);
    DROP TABLE public.consultorio;
       public         heap    postgres    false            �            1259    65558    consultorio_id_seq    SEQUENCE     {   CREATE SEQUENCE public.consultorio_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.consultorio_id_seq;
       public          postgres    false    217                       0    0    consultorio_id_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.consultorio_id_seq OWNED BY public.consultorio.id;
          public          postgres    false    216            �            1259    65568    doctores    TABLE     �   CREATE TABLE public.doctores (
    id bigint NOT NULL,
    apellido_materno character varying(255),
    apellido_paterno character varying(255),
    especialidad character varying(255),
    nombre character varying(255)
);
    DROP TABLE public.doctores;
       public         heap    postgres    false            �            1259    65567    doctores_id_seq    SEQUENCE     x   CREATE SEQUENCE public.doctores_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.doctores_id_seq;
       public          postgres    false    219                       0    0    doctores_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.doctores_id_seq OWNED BY public.doctores.id;
          public          postgres    false    218            o           2604    65555    citas id    DEFAULT     d   ALTER TABLE ONLY public.citas ALTER COLUMN id SET DEFAULT nextval('public.citas_id_seq'::regclass);
 7   ALTER TABLE public.citas ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214    215            p           2604    65562    consultorio id    DEFAULT     p   ALTER TABLE ONLY public.consultorio ALTER COLUMN id SET DEFAULT nextval('public.consultorio_id_seq'::regclass);
 =   ALTER TABLE public.consultorio ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    216    217    217            q           2604    65571    doctores id    DEFAULT     j   ALTER TABLE ONLY public.doctores ALTER COLUMN id SET DEFAULT nextval('public.doctores_id_seq'::regclass);
 :   ALTER TABLE public.doctores ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    219    218    219            	          0    65552    citas 
   TABLE DATA           d   COPY public.citas (id, fecha_cita, horario, nombre_paciente, id_consultorio, id_doctor) FROM stdin;
    public          postgres    false    215                    0    65559    consultorio 
   TABLE DATA           C   COPY public.consultorio (id, numero_consultorio, piso) FROM stdin;
    public          postgres    false    217   @                 0    65568    doctores 
   TABLE DATA           `   COPY public.doctores (id, apellido_materno, apellido_paterno, especialidad, nombre) FROM stdin;
    public          postgres    false    219   ~                  0    0    citas_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.citas_id_seq', 1, false);
          public          postgres    false    214                       0    0    consultorio_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.consultorio_id_seq', 1, false);
          public          postgres    false    216                       0    0    doctores_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.doctores_id_seq', 1, false);
          public          postgres    false    218            s           2606    65557    citas citas_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.citas
    ADD CONSTRAINT citas_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.citas DROP CONSTRAINT citas_pkey;
       public            postgres    false    215            u           2606    65566    consultorio consultorio_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.consultorio
    ADD CONSTRAINT consultorio_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.consultorio DROP CONSTRAINT consultorio_pkey;
       public            postgres    false    217            w           2606    65575    doctores doctores_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.doctores
    ADD CONSTRAINT doctores_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.doctores DROP CONSTRAINT doctores_pkey;
       public            postgres    false    219            x           2606    65581 !   citas fkehbckgw69ryt2otrfl2kand3q    FK CONSTRAINT     �   ALTER TABLE ONLY public.citas
    ADD CONSTRAINT fkehbckgw69ryt2otrfl2kand3q FOREIGN KEY (id_doctor) REFERENCES public.doctores(id);
 K   ALTER TABLE ONLY public.citas DROP CONSTRAINT fkehbckgw69ryt2otrfl2kand3q;
       public          postgres    false    215    219    3191            y           2606    65576     citas fkn4cdlqjp2qu8g9vkme7y1hd0    FK CONSTRAINT     �   ALTER TABLE ONLY public.citas
    ADD CONSTRAINT fkn4cdlqjp2qu8g9vkme7y1hd0 FOREIGN KEY (id_consultorio) REFERENCES public.consultorio(id);
 J   ALTER TABLE ONLY public.citas DROP CONSTRAINT fkn4cdlqjp2qu8g9vkme7y1hd0;
       public          postgres    false    217    3189    215            	   )   x�3�4202�50�54�44�2 !N?� ON#Nc�=... v�'         .   x���	 0�w2L�Z����QP,&����ZɆ�4���m$         �   x�}�K�0��}�� ����,�ܤU��lG��G��m�by6��g/�͓�^(R�DlEU� �FwYf�|HR$`tG����1�!tdɟa_��mC�*�}&�G7I{I�%�[ˣDu�����39     