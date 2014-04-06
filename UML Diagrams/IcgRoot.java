/** @hidden */
  public class IcgRoot {}

/**
 * @opt attributes
 * @opt operations
 * @hidden
 */
class UMLOptions {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Drivers

/**
 * @opt nodefillcolor LightCoral
 */
class Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class EarliestMfgDateDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class LineDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class ManufacturingOriginDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class ProductionDateDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class SampleManufacturingOriginDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class SampleMfgDateDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class ShiftDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class ShortestShelfLifeDriver extends Driver {}

/**
 * @opt nodefillcolor LightCoral
 */
class SiteDriver extends Driver {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Reference Data (< ActiveRecord::Base)

/**
 * @opt nodefillcolor LightBlue
 */
class ReferenceDataField {}

/**
 * @opt nodefillcolor LightBlue
 */
class ReferenceDataRow {}

/**
 * @composed - - - ReferenceDataField
 * @composed - - - ReferenceDataRow
 * @opt nodefillcolor LightBlue
 */
class ReferenceDataTable {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Rules (< ActiveRecord::Base)

/**
 * @composed  - - - Fragment
 * @opt nodefillcolor LightBlue
 */
class Rule {}

/**
 * @depend - - - Driver
 * @depend - - - ReferenceDataTable
 * @depend - - - ReferenceDataField
 * @opt nodefillcolor LightBlue
 */
class Fragment {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Transition

/**
 * @stereotype Icg::Rule::State::Spec
 */
class Transition {}

class GenerateExpiry extends Transition {}
class GenerateLot extends Transition {}
class InterpretExpiry extends Transition {}
class InterpretLot extends Transition {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Data Syching
//
// Note: hiding the dependency on the observed models.

/**
 * @depend - syncs - ReferenceDataRow
 */
class ReferenceDataSyncer {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Line
 */
class LineObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Shift
 */
class ShiftObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Site
 */
class SiteObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 */
class TableBuilderService {}


// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Domain Master

/**
 * @composed - - - Customer
 * @composed - - - Site
 * @opt nodefillcolor LightYellow
 */
class Account {}

/**
 * @composed - - - ReferenceDataTable
 * @composed - - - Rule
 * @opt nodefillcolor LightYellow
 */
class Customer {}

/**
 * @opt nodefillcolor LightYellow
 */
class Line {}

/**
 * @opt nodefillcolor LightYellow
 */
class Shift {}

/**
 * @composed - - - Line
 * @composed - - - Shift
 * @opt nodefillcolor LightYellow
 */
class Site {}


