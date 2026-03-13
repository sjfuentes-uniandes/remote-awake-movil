# Remote Awake - Aplicación Móvil

Aplicación Android para gestión de alarmas con sistema de respaldos automáticos.

## Características

- **Sistema de Login**: Autenticación de usuario con validación
- **Gestión de Alarmas**: Visualización y control de múltiples alarmas
- **Alarmas con Respaldo**: Sistema de alarmas principales con respaldos automáticos
- **Transición Automática**: Si no hay interacción en la alarma de respaldo 1, automáticamente pasa a la alarma de respaldo 2 después de 2 segundos

## Credenciales de Acceso

**⚠️ IMPORTANTE: Para acceder a la aplicación, utiliza las siguientes credenciales:**

- **Usuario**: `admin`
- **Contraseña**: `admin`

## Estructura del Proyecto

### Activities
- **LoginActivity**: Pantalla de inicio de sesión
- **HomeActivity**: Pantalla principal con lista de alarmas
- **AlarmRingingActivity**: Pantalla de alarma principal sonando
- **AlarmRingingBackup1Activity**: Pantalla de alarma de respaldo 1
- **AlarmRingingBackup2Activity**: Pantalla de alarma de respaldo 2

### Características Técnicas
- **Lenguaje**: Kotlin
- **UI**: Material Design 3
- **Min SDK**: 24
- **Target SDK**: 35
- **Compile SDK**: 36

## Instalación

1. Clona el repositorio
2. Abre el proyecto en Android Studio
3. Sincroniza las dependencias de Gradle
4. Ejecuta la aplicación en un emulador o dispositivo físico

## Uso

1. Inicia la aplicación
2. Ingresa las credenciales: **admin** / **admin**
3. Navega por las diferentes alarmas configuradas
4. Usa los botones "Probar Principal" y "Probar Respaldo" para simular las alarmas
