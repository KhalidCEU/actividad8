
## Ejemplo de Input / Output

```
  > add provincia
  > Inserte el nombre de la provincia: Madrid
  Provincia añadida: Madrid

  > add provincia
  > Inserte el nombre de la provincia: Barcelona
  Provincia añadida: Barcelona

  > add municipio
  Provincias:
  1. Madrid
  2. Barcelona
  > Seleccione el número : 1
  > Inserte el nombre del municipio: Boadilla
  Municipio Boadilla añadido a la provincia Madrid

  > add municipio
  Provincias:
  1. Madrid
  2. Barcelona
  > Seleccione el número : 2
  > Inserte el nombre del municipio: Hospitalet de Llobregat
  Municipio Hospitalet de Llobregat añadido a la provincia Barcelona

  > add localidad
  Municipios de Madrid:
    - 1. Boadilla
  Municipios de Barcelona:
    - 2. Hospitalet de Llobregat
  > Seleccione el número del municipio: 1
  > Inserte el nombre de la localidad: Las Lomas
  > Inserte el número de habitantes: 30500
  Localidad Las Lomas añadida al municipio Boadilla

  > add localidad
  Municipios de Madrid:
    - 1. Boadilla
  Municipios de Barcelona:
    - 2. Hospitalet de Llobregat
  > Seleccione el número del municipio: 1
  > Inserte el nombre de la localidad: Valdecabanas
  > Inserte el número de habitantes: 29500
  Localidad Valdecabanas añadida al municipio Boadilla

  > list
  Provincias:
  1. Madrid
  2. Barcelona

  Municipios de Madrid:
    - 1. Boadilla
  Municipios de Barcelona:
    - 2. Hospitalet de Llobregat

  Localidades:
    - Las Lomas (Boadilla, Madrid). Numero de habitantes: 30500.
    - Valdecabanas (Boadilla, Madrid). Numero de habitantes: 29500.
  La provincia Madrid tiene 60000 habitantes.
  La provincia Barcelona tiene 0 habitantes.

```