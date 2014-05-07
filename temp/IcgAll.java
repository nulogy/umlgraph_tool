
  
  
  // --------------------------------------------------------------------------------------------------------------------
  // config
  
    
    /**
    
      * @hidden
    
    
     */
    class IcgAll {
      
    }
  
    
    /**
    
      * @opt vertical
    
      * @opt attributes
    
      * @opt operations
    
      * @hidden
    
    
     */
    class UMLOptions {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // base
  
    
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
    class CodeGenerationService {
      
    }
  
    
    /**
    
      * @has - - - Customer
    
    
      * @opt nodefillcolor lightgray
    
     */
    class MaterialsValidationConfig {
      
    }
  
    
    /**
    
      * @depend - - - ValidatingMaterials
    
    
      * @opt nodefillcolor lightgray
    
     */
    class MaterialsValidationService {
      
    }
  
    
    /**
    
      * @has - - - Driver
    
      * @depend - - - MfgDatesInterpreter
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ProductionProvider {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataTable
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ReferenceData {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceData
    
      * @depend - - - Rule
    
    
      * @opt nodefillcolor lightgray
    
     */
    class RuleService {
      
    }
  
    
    /**
    
      * @depend - - - ValidationPipeline
    
    
      * @opt nodefillcolor lightgray
    
     */
    class ValidatingMaterials {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // drivers
  
    
    /**
    
      * @has - - - Rule
    
      * @depend - creates - Scope
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ProductionParameters {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class EarliestMfgDateDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class LineDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ManufacturingOriginDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ProductionDateDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class SampleManufacturingOriginDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class SampleMfgDateDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ShiftDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class ShortestShelfLifeDriver extends Driver {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightcoral
    
     */
    class SiteDriver extends Driver {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // interpreters
  
    
    /**
    
    
      * @opt nodefillcolor gold
    
     */
    class ExpiryDateInterpreter {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor gold
    
     */
    class MfgDatesInterpreter {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor gold
    
     */
    class MfgOriginInterpreter {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // rules
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataField {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataRow {
      
    }
  
    
    /**
    
      * @composed - - - ReferenceDataField
    
      * @composed - - - ReferenceDataRow
    
    
      * @opt nodefillcolor lightblue
    
     */
    class ReferenceDataTable {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightblue
    
     */
    class Rule {
      
    }
  
    
    /**
    
      * @composed_HIDE  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class GenerateExpiryRule extends Rule {
      
    }
  
    
    /**
    
      * @composed  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class GenerateLotRule extends Rule {
      
    }
  
    
    /**
    
      * @composed_HIDE  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class InterpretExpiryRule extends Rule {
      
    }
  
    
    /**
    
      * @composed  - - - RuleFragment
    
    
      * @opt nodefillcolor lightblue
    
     */
    class InterpretLotRule extends Rule {
      
    }
  
    
    /**
    
      * @depend - - - Driver
    
      * @depend - - - ReferenceDataTable
    
      * @depend - - - ReferenceDataField
    
    
      * @opt nodefillcolor lightblue
    
     */
    class RuleFragment {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // scopes
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class Scope {
      
        void qualified_items() {}
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class JobLotsExpiriesScope extends Scope {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class MovePlanScope extends Scope {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class MovesScope extends Scope {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class PickListCandidateScope extends Scope {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor violet
    
     */
    class PickListsScope extends Scope {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // transitions
  
    
    /**
    
      * @depend - - - Wizard
    
    
      * @opt nodefillcolor cyan
    
     */
    class RuleWizardController {
      
        void show() {}
      
        void transition() {}
      
    }
  
    
    /**
    
      * @depend - - - Transition
    
    
      * @opt nodefillcolor cyan
    
     */
    class Wizard {
      
    }
  
    
    /**
    
      * @stereotype Icg::Rule::State::Spec
    
    
      * @opt nodefillcolor cyan
    
     */
    class Transition {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor cyan
    
     */
    class GenerateExpiryTransition extends Transition {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor cyan
    
     */
    class GenerateLotTransition extends Transition {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor cyan
    
     */
    class InterpretExpiryTransition extends Transition {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor cyan
    
     */
    class InterpretLotTransition extends Transition {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // validators
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class CanInterpretMfgDateValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class CanRunValidations {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateParsingValidator {
      
    }
  
    
    /**
    
      * @depend - - - ExpiryDateInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateRangeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ExpiryDateValidator {
      
    }
  
    
    /**
    
      * @depend - - - ExpiryDateInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class FinishedGoodProductionDateLimitValidator {
      
    }
  
    
    /**
    
      * @depend - - - MfgOriginInterpreter
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ManufacturingOriginValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class PickStrategyValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class QualifiedItemsPresenceValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ShelfLifeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipDateRangeValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipDateValidator {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor palegreen
    
     */
    class StopShipLimitValidator {
      
    }
  
    
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
    
    
      * @opt nodefillcolor palegreen
    
     */
    class ValidationPipeline {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // sync
  
    
    /**
    
      * @depend - - - ReferenceDataRow
    
    
      * @opt nodefillcolor khaki
    
     */
    class ReferenceDataSyncer {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataSyncer
    
      * @depend_HIDE - observes - Line
    
    
      * @opt nodefillcolor khaki
    
     */
    class LineObserver {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataSyncer
    
      * @depend_HIDE - observes - Shift
    
    
      * @opt nodefillcolor khaki
    
     */
    class ShiftObserver {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataSyncer
    
      * @depend_HIDE - observes - Site
    
    
      * @opt nodefillcolor khaki
    
     */
    class SiteObserver {
      
    }
  
    
    /**
    
      * @depend - - - ReferenceDataSyncer
    
    
      * @opt nodefillcolor khaki
    
     */
    class TableBuilderService {
      
    }
  

  
  
  // --------------------------------------------------------------------------------------------------------------------
  // domain
  
    
    /**
    
      * @composed - - - Customer
    
      * @composed - - - Site
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Account {
      
    }
  
    
    /**
    
      * @composed - - - ReferenceDataTable
    
      * @composed - - - Rule
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Customer {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Job {
      
    }
  
    
    /**
    
      * @composed - - - Job
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Line {
      
    }
  
    
    /**
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Shift {
      
    }
  
    
    /**
    
      * @composed - - - Line
    
      * @composed - - - Shift
    
    
      * @opt nodefillcolor lightyellow
    
     */
    class Site {
      
    }
  
