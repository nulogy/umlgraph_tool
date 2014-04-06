/** @hidden */
  public class IcgRoot {}

/**
 * @opt attributes
 * @opt operations
 * @hidden
 */
class UMLOptions {}


// --------------------------------------------------------------------------------------------------------------------
// Application Entry Point

/**
 * @depend - - - CodeGenerationService
 * @opt nodefillcolor lightgray
 */
class CodeGenerationController {
  void generate_lot_code() {}
  void generate_expiry_date() {}
}

/**
 * @depend - - - MaterialsValidationConfig
 * @depend - - - MaterialsValidationService
 * @depend - - - ProductionParameters
 * @depend - - - ProductionProvider
 * @depend - - - RuleService
 * @opt nodefillcolor lightgray
 */
class CodeGenerationService {}

/**
 * @has - - - Customer
 * @opt nodefillcolor lightgray
 */
class MaterialsValidationConfig {}

/**
 * @has - - - Rule
 * @opt nodefillcolor lightgray
 */
class ProductionParameters {}

/**
 * @has - - - Driver
 * @opt nodefillcolor lightgray
 */
class ProductionProvider {}

/**
 * @depend - - - ReferenceDataTable
 * @opt nodefillcolor lightgray
 */
class ReferenceData {}

/**
 * @depend - - - ReferenceData
 * @opt nodefillcolor lightgray
 */
class RuleService {}

/**
 * @depend - - - ValidationPipeline
 * @opt nodefillcolor lightgray
 */
class ValidatingMaterials {}

/**
 * @depend - - - ValidatingMaterials
 * @opt nodefillcolor lightgray
 */
class MaterialsValidationService {}


// --------------------------------------------------------------------------------------------------------------------
// Drivers
//
// Note: concrete drivers hidden for the moment.

/**
 * @opt nodefillcolor LightCoral
 */
class Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class EarliestMfgDateDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class LineDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class ManufacturingOriginDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class ProductionDateDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class SampleManufacturingOriginDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class SampleMfgDateDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class ShiftDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class ShortestShelfLifeDriver extends Driver {}

/**
 * @hidden
 * @opt nodefillcolor LightCoral
 */
class SiteDriver extends Driver {}


// --------------------------------------------------------------------------------------------------------------------
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


// --------------------------------------------------------------------------------------------------------------------
// Rules (< ActiveRecord::Base)

/**
 * @opt nodefillcolor LightBlue
 */
class Rule {}

/**
 * @composed  - - - Fragment
 * @opt nodefillcolor LightBlue
 */
class GenerateExpiry extends Rule {}

/**
 * @composed  - - - Fragment
 * @opt nodefillcolor LightBlue
 */
class GenerateLot extends Rule {}

/**
 * @composed  - - - Fragment
 * @opt nodefillcolor LightBlue
 */
class InterpretExpiry extends Rule {}

/**
 * @composed  - - - Fragment
 * @opt nodefillcolor LightBlue
 */
class InterpretLot extends Rule {}

/**
 * @depend - - - Driver
 * @depend - - - ReferenceDataTable
 * @depend - - - ReferenceDataField
 * @opt nodefillcolor LightBlue
 */
class Fragment {}


// --------------------------------------------------------------------------------------------------------------------
// Transition
//
// Note: commented out for the moment.

// /**
//  * @stereotype Icg::Rule::State::Spec
//  */
// class Transition {}

// class GenerateExpiry extends Transition {}
// class GenerateLot extends Transition {}
// class InterpretExpiry extends Transition {}
// class InterpretLot extends Transition {}


// --------------------------------------------------------------------------------------------------------------------
// Validations
//
// Note: concrete validators hidden for the moment.

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class CanInterpretMfgDateValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class CanRunValidations {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class ExpiryDateParsingValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class ExpiryDateRangeValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class ExpiryDateValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class FinishedGoodProductionDateLimitValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class ManufacturingOriginValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class PickStrategyValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class QualifiedItemsPresenceValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class ShelfLifeValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class StopShipDateRangeValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class StopShipDateValidator {}

/**
 * @hidden
 * @opt nodefillcolor PaleGreen
 */
class StopShipLimitValidator {}

/**
 * @depend - - - CanInterpretMfgDateValidator
 * @depend - - - CanRunValidations
 * @depend - - - ExpiryDateParsingValidator
 * @depend - - - ExpiryDateRangeValidator
 * @depend - - - ExpiryDateValidator
 * @depend - - - FinishedGoodProductionDateLimitValidator
 * @depend - - - ManufacturingOriginValidator
 * @depend - - - PickStrategyValidator
 * @depend - - - QualifiedItemsPresenceValidator
 * @depend - - - ShelfLifeValidator
 * @depend - - - StopShipDateRangeValidator
 * @depend - - - StopShipDateValidator
 * @depend - - - StopShipLimitValidator
 * @opt nodefillcolor PaleGreen
 */
class ValidationPipeline {}


// --------------------------------------------------------------------------------------------------------------------
// Data Syching
//
// Note: hiding the dependency on the observed models.

/**
 * @depend - - - ReferenceDataRow
 * @opt nodefillcolor Khaki
 */
class ReferenceDataSyncer {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Line
 * @opt nodefillcolor Khaki
 */
class LineObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Shift
 * @opt nodefillcolor Khaki
 */
class ShiftObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 * @depend_HIDE - observes - Site
 * @opt nodefillcolor Khaki
 */
class SiteObserver {}

/**
 * @depend - - - ReferenceDataSyncer
 * @opt nodefillcolor Khaki
 */
class TableBuilderService {}


// --------------------------------------------------------------------------------------------------------------------
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


