-- Table: public."cases"

DROP TABLE IF EXISTS "cases" CASCADE;
DROP SEQUENCE IF EXISTS global_seq CASCADE;
CREATE SEQUENCE global_seq START 1000;

CREATE TABLE public."cases"
(
  id            integer PRIMARY KEY DEFAULT nextval('global_seq'),
  ssoid         text          NOT NULL,
  ts            integer       NOT NULL,
  grp           text          NOT NULL,
  type          text          NOT NULL,
  subtype       text          NOT NULL,
  url           text,
  orgid         text,
  formid        text,
  code          text,
  ltpa          text,
  sudirresponse text,
  ymdh          text          NOT NULL
)
  WITH (
    OIDS = FALSE
  )
  TABLESPACE pg_default;

ALTER TABLE public."cases"
  OWNER to postgres;

CREATE INDEX ts_index
  ON public.cases USING btree
    (ts ASC NULLS LAST)
  TABLESPACE pg_default;

CREATE INDEX ssoid_index
  ON public.cases USING btree
    (ssoid ASC NULLS LAST)
  TABLESPACE pg_default;

CREATE INDEX grp_index
  ON public.cases USING btree
    (grp ASC NULLS LAST)
  TABLESPACE pg_default;

CREATE INDEX formid_index
  ON public.cases USING btree
    (formid COLLATE pg_catalog."default")
  TABLESPACE pg_default;