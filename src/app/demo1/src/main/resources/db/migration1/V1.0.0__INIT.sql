create role testuser with SUPERUSER;
alter role testuser with PASSWORD '${DB_PASS}';
alter role testuser wiht LOGIN;
