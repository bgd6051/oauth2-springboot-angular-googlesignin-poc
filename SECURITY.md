# Política de Seguridad y Cumplimiento (ISO 27001 & GDPR)

## 1. Control de Acceso (A.9)

- Se requiere autenticación MFA para todos los desarrolladores con acceso a `develop`.
- Principio de mínimo privilegio aplicado en GitHub Secrets.

## 2. Gestión de Vulnerabilidades (A.12.6)

- Escaneos automáticos (Trivy) en cada Pull Request.
- SLAs de remediación: 24h para críticas, 7 días para altas.

## 3. Seguridad en las Comunicaciones (A.13)

- Uso obligatorio de HTTPS/TLS 1.2+ para todas las APIs.
- Cifrado de secretos en reposo mediante GitHub Encrypted Secrets.

## 4. Protección de Datos (GDPR)

- No se almacenan datos personales (PII) en logs.
- Derecho al olvido implementado mediante endpoints de borrado en `AppUserService`.
