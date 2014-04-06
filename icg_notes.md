Intelligent Code Generation Notes
---------------------------------

## Enabling ICG

Account Settings > Modules > Intelligent Code Generation


## Creating an ICG Configuration

Customers > Configure > Intelligent Code


## Reference Table Structure

The reference table structure is a little challenging to understand at first because the database contains table metadata rather than the table directly.

This is to allow our customers to define their own table structure. Sheesh. This is a standard ERP move where there are tables that describe how to interpret other tabular data. Flexibility that comes with a complexity cost.

There are 5 kinds of reference tables: date, site, line, shift, and location. Only two of the tables are editable: date and location. The other tables are kept in sync with the contents of each customer's site, line and shift tables. The sync is managed by observing changes to the related ActiveRecord tables and using the ReferenceDataSyncer class.


## Random Notes

Each driver implements #supports? to denote if it supports a particular kind of rule fragment.
