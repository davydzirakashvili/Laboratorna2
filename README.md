# Java Serialization Laboratory Work 2

## Опис

Проєкт реалізує систему бібліотеки з підтримкою різних механізмів серіалізації у Java.

Програма дозволяє:
- створювати бібліотеку;
- додавати книги та авторів;
- реєструвати читачів;
- виконувати серіалізацію та десеріалізацію об’єктів;
- перемикатись між різними режимами серіалізації.

У проєкті реалізовано три версії серіалізації:
1. Serializable
2. Custom Serializable
3. Externalizable

---

# Структура проєкту

```text
src
│
├── app
│   └── Main.java
│
├── models
│   ├── Author.java
│   ├── Book.java
│   ├── Human.java
│   ├── Library.java
│   └── Reader.java
│
├── serializationv1
│   └── SerializationV1.java
│
├── serializationv2
│   └── SerializationV2.java
│
├── serializationv3
│   └── SerializationV3.java
│
└── service
    └── LibraryService.java
```

---

# Реалізовані механізми серіалізації

## Version 1 — Serializable

Усі класи використовують стандартну автоматичну серіалізацію через:

```java
implements Serializable
```

---

## Version 2 — Custom Serializable

Використовується:
- `transient`;
- `writeObject()`;
- `readObject()`.

Реалізовано частково ручне керування серіалізацією.

---

## Version 3 — Externalizable

Використовується:

```java
implements Externalizable
```

Реалізовано:
- `writeExternal()`;
- `readExternal()`.

---

# Логіка роботи програми

Після запуску програма пропонує вибір режиму серіалізації:

```text
1 - Serializable
2 - Custom Serializable
3 - Externalizable
```

Після вибору:
- створюється бібліотека;
- додаються книги та читачі;
- виконується серіалізація;
- виконується десеріалізація;
- виводиться відновлений стан системи.

---

# Використані технології

- Java
- Java Serialization API
- ObjectOutputStream
- ObjectInputStream
- Serializable
- Externalizable
- IntelliJ IDEA
- Git

---

# Примітка

Усі три режими серіалізації реалізовані в межах одного проєкту з можливістю вибору режиму під час виконання програми.
