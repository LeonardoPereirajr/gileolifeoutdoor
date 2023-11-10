ALTER TABLE events ADD COLUMN active BOOLEAN;
UPDATE events SET active = true;